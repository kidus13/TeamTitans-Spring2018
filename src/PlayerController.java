import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PlayerController {

	private static String name;

	public static void main(String[] args) throws IOException {

		RoomWriter r = new RoomWriter();
		Character c = new Character("", 0, 0);
		Weapon w = new Weapon(name, 0, 0, 0, 0, 0, false, false, false, false);

		r.openWelcome();
		r.readWelcome();
		r.closeWelcome();
		Scanner input = new Scanner(System.in);
		String saved = input.nextLine();

		// load
		if (saved.equalsIgnoreCase("s")) {
		System.out.println("Do you have a saved game?");
		 saved = input.nextLine();
		if (saved.equalsIgnoreCase("yes")) {
			System.out.println("Press 1 to load player stats");
			saved = input.nextLine();
			if (saved.equalsIgnoreCase("1")) {
				try {
					c.loadplayer();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				saved = "2";
				if (saved.equalsIgnoreCase("2")) {
					try {
						System.out.println("Inventory: ");
						w.loadInv();
						navigation();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
			}

		} else {

			System.out.println("=========================================");
			System.out.println("Please enter in your name");
			System.out.println("=========================================");
			name = input.nextLine();

			if (name != null) {
				navigation();

			} else {
				navigation();

			}
		}
	}
}

	public static void navigation() {
		Battle b = new Battle();
		RoomWriter wr = new RoomWriter();
		Room r = new Room();
		Character c = new Character("", 0, 0);
		Monster m = new Monster("", 0, 0);
		Weapon w = new Weapon("", 0, 0, 0, 0, 0, false, false, false, false);

		boolean firstTime = false;
		String userInput;
		Scanner input = new Scanner(System.in);
		c.setName(name);

		System.out.println("=========================================");
		System.out.println("Please enter the number room you would like to enter");
		System.out.println("Please enter'm' to view map");
		System.out.println("=========================================");

		userInput = input.nextLine();

		// save
		if (userInput.equalsIgnoreCase("save")) {

			System.out.println("=========================================");
			System.out.println("Please enter in your name");
			System.out.println("=========================================");
			name = input.nextLine();

			c.setName(name);
			c.setPlayerHP(b.getPlayerHP());

			try {
				c.savedplayer();
				w.savedInv();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		while (true) {
			// map
			if (userInput.equalsIgnoreCase("m")) {
				wr.openMap();
				wr.readMap();
				userInput = input.nextLine();
			}
			// EARTH LEVEL
			if (userInput.equalsIgnoreCase("1")) {
				b.getInv().add(w.getEI03());

				r.Room1();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("2")) {
				r.Room2();
			}
			if (userInput.equalsIgnoreCase("3")) {
				r.Room3();
			}
			if (userInput.equalsIgnoreCase("4")) {
				System.out.println("This room has access to rooms 5 & 7");
				userInput = input.nextLine();
				if (userInput.equalsIgnoreCase("4")) {
					r.Room4();
				}
				if (userInput.equalsIgnoreCase("5")) {
					if (b.getInv().contains(w.getEI03().TORTURE_KEY_DEFENSE == 0)) {
						r.Room5();

					} else {
						System.out.println("Comeback with a key");
						userInput = input.nextLine();
					}
				}
				if (userInput.equalsIgnoreCase("7")) {

					r.Room7();
				}
			}
			if (userInput.equalsIgnoreCase("5")) {
				if (b.getInv().size()>5) {
					r.Room5();

				} else {
					System.out.println("Comeback with a key");
					userInput = input.nextLine();
				}
			}
			if (userInput.equalsIgnoreCase("6")) {
				r.Room6();
			}
			if (userInput.equalsIgnoreCase("7")) {

				r.Room7();
			}

			if (userInput.equalsIgnoreCase("8")) {
				r.Room8();
			}
			// WATER LEVEL

			for (int i = 9; i < 17; i++)
				if (b.getInv().size() < 6 && userInput.equalsIgnoreCase(String.valueOf(i))) {
					System.out.println("You have not collected enough items to move on");
					userInput = input.nextLine();
					continue;
				} else {

					if (userInput.equalsIgnoreCase("9")) {

						r.Room9();
					}
					if (userInput.equalsIgnoreCase("10")) {
						System.out.println("Room 10 also has access to rooms 11 & 13");
						userInput = input.nextLine();
						if (userInput.equalsIgnoreCase("10")) {
							r.Room10();
						}
						if (userInput.equalsIgnoreCase("11")) {
							r.Room11();
						}
						if (userInput.equalsIgnoreCase("13")) {

							r.Room13();
						}

						if (userInput.equalsIgnoreCase("11")) {
							r.Room11();
						}

						if (userInput.equalsIgnoreCase("12")) {
							System.out.println("Room 12 also has access to rooms 13 & 14");
							userInput = input.nextLine();
							if (userInput.equalsIgnoreCase("12")) {
								r.Room12();
							}
							if (userInput.equalsIgnoreCase("13")) {
								r.Room13();
							}
							if (userInput.equalsIgnoreCase("14")) {

								r.Room14();
							}
						}

						if (userInput.equalsIgnoreCase("13")) {
							r.Room13();
						}
						if (userInput.equalsIgnoreCase("14")) {
							r.Room14();
						}
						if (userInput.equalsIgnoreCase("15")) {
							r.Room15();
						}
						if (userInput.equalsIgnoreCase("16")) {
							r.Room16();
						}
					}
				}
			// FIRE LEVEL
			for (int i = 17; i < 28; i++)
				if (b.getInv().size() < 11 && userInput.equalsIgnoreCase(String.valueOf(i))) {
					System.out.println("You have not collected enough items to move on");
					userInput = input.nextLine();
					continue;
				} else {
					if (userInput.equalsIgnoreCase("17")) {
						r.Room17();
					}
					if (userInput.equalsIgnoreCase("18")) {
						r.Room18();
					}
					if (userInput.equalsIgnoreCase("19")) {
						r.Room19();
					}
					if (userInput.equalsIgnoreCase("20")) {
						r.Room20();
					}
					if (userInput.equalsIgnoreCase("21")) {
						r.Room21();
					}
					if (userInput.equalsIgnoreCase("22")) {
						r.Room22();
					}
					if (userInput.equalsIgnoreCase("23")) {
						r.Room23();
					}
					if (userInput.equalsIgnoreCase("24")) {
						r.Room24();
					}
					if (userInput.equalsIgnoreCase("25")) {
						r.Room25();
					}
					if (userInput.equalsIgnoreCase("26")) {
						r.Room26();
					}
					if (userInput.equalsIgnoreCase("27")) {
						r.Room27();
					}
				}
			// AIR LEVEL

			for (int i = 28; i < 36; i++)
				if (b.getInv().size() < 1 && userInput.equalsIgnoreCase(String.valueOf(i))) {
					System.out.println("You have not collected enough items to move on");
					userInput = input.nextLine();
					continue;
				} else {
					if (userInput.equalsIgnoreCase("28")) {
						r.Room28();
					}
					if (userInput.equalsIgnoreCase("29")) {
						r.Room29();
					}
					if (userInput.equalsIgnoreCase("30")) {
						r.Room30();
					}
					if (userInput.equalsIgnoreCase("31")) {
						r.Room31();
					}
					if (userInput.equalsIgnoreCase("32")) {
						r.Room32();
					}
					if (userInput.equalsIgnoreCase("33")) {
						r.Room33();
					}
					if (userInput.equalsIgnoreCase("34")) {
						r.Room34();
					}
					if (userInput.equalsIgnoreCase("35")) {
						r.Room35();
				    }
			}
		}
	}
}
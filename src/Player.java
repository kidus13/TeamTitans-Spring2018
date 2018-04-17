import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Player {

	public static void main(String[] args) {

		RoomWriter r = new RoomWriter();
		Character p = new Character("", 0, 0);
		Monster m = new Monster("", 0, 0);
		Weapon w = new Weapon("", 0, 0, 0, 0, 0, false, false, false, false);
		Battle b = new Battle();
 
		Scanner input = new Scanner(System.in);
		boolean inRoom = false;
		boolean leaving = false;
		int room = 0;


		// Add inventory to array
		List<Weapon> inv = new ArrayList<Weapon>();
		Scanner inputItem = new Scanner(System.in);

		System.out.println("Hello user type please enter 'north' to continue");
		System.out.println("To view game commands please press h at anytime");
		String userInput = input.nextLine();

		if(userInput.equalsIgnoreCase("h")){
			r.openCommands();
			r.readCommands();
			r.closeCommands();
			
		}
		if (userInput.equalsIgnoreCase("north")) {
			room++;
		}
		if (userInput.equalsIgnoreCase("south")) {
			room--;
		}
		

	while (true) {

		if (userInput.equalsIgnoreCase("north")) {
			room++;
		}
		if (userInput.equalsIgnoreCase("south")) {
			room--;
		}
			// room1
			if (room == 1) {
				r.openRoom1();
				r.readRoom1();
				r.closeRoom1();
				// userInput = input.nextLine();
				if (userInput.contains("north")) {
					room = 2;

				}
			}
			
			
			// room2
			if (room == 2 && leaving == true) {
				System.out.println("You are in room 2");
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					room = 3;
				}
			}
			if (room == 2) {
				// userInput = input.nextLine();
				System.out.println("You are now in room 2");
				System.out.println("Would you like to search room? yes or no ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom2();
					r.readRoom2();
					r.closeRoom2();
					System.out.println("");
					System.out.println("There is a monster lurking in this room");
					System.out.println("Would you like to examine? yes or no");
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("Be careful a monster could pop out of a corner");
						leaving = true;
						}
					if (userInput.contains("yes")) {
						m.getEM01();

						System.out.println("The guard has a few weapons you might need");
						System.out.println("Would you like to see what he has? yes or no");
						userInput = input.nextLine();
						if (userInput.equalsIgnoreCase("no")) {
							System.out.println("Be careful a monster could pop out of a corner");
							leaving = true;
							}
						if (userInput.contains("yes")) {
							System.out.println(w.getEI01());
							System.out.println(w.getEI02());
							System.out.println("You have to battle the monster and defeat him to get the items");
							System.out.println("Would you like to fight or flee monster?");
							userInput = input.nextLine();
							
							if (userInput.equalsIgnoreCase("flee")) {
								System.out.println("Be careful a monster could pop out of a corner");
								leaving = true;
								}
							if (userInput.contains("fight")) {
								//b.battleMonster(m.getWM04()); // Still need to figure this out 
								m.getWM04();
								System.out.println("You won your battle!");
								System.out.println("You can now collect items dropped by the monster");
								System.out.println("Would you like to add items to your inventory? yes or no");
								userInput = inputItem.nextLine();
								if (userInput.equalsIgnoreCase("yes")) {
											inv.add(Weapon.getEI01());
											inv.add(Weapon.getEI02());
											for(int i = 0; i<inv.size(); i++){
												System.out.println(inv.get(i)+"\n");
								//	System.out.println(Arrays.toString(inv.toArray()));
											}
								}
							}
						}
					}
						
						} else if (userInput.equalsIgnoreCase("no")) {
							System.out.println("Be careful a monster could pop out of a corner");
							leaving = true;
							//userInput = input.nextLine();

						}
			}
					

				// room3
				if (room == 3) {
					r.openRoom3();
					r.readRoom3();
					r.closeRoom3();
					userInput = input.nextLine();

				}
				// room4
				if (room == 4) {
					r.openRoom4();
					r.readRoom4();
					r.closeRoom4();
					userInput = input.nextLine();
					if (userInput.contains("north")) {
						System.out.println("Do you want to access room 5 or 7?");
						userInput = input.nextLine();
						if (userInput.contains("5")) {
							room = 5;
						}
						if (userInput.contains("7")) {
							room = 7;
						}
					}
				}

				// room5
				if (room == 5) {
					r.openRoom5();
					r.readRoom5();
					r.closeRoom5();
					userInput = input.nextLine();

				}
				// room6
				if (room == 6) {
					r.openRoom6();
					r.readRoom6();
					r.closeRoom6();
					userInput = input.nextLine();
					if (userInput.contains("north")) {
						room = 6;
						System.out.println("Room 7 cannot be accessed in this room");
						System.out.println();
						userInput = input.nextLine();

					}
				}
				// room7
				if (room == 7) {
					r.openRoom7();
					r.readRoom7();
					r.closeRoom7();
					userInput = input.nextLine();
					if (userInput.contains("south")) {
						room = 5;
					}
				}
				// room8
				if (room == 8) {
					r.openRoom8();
					r.readRoom8();
					r.closeRoom8();
					userInput = input.nextLine();
				}

				// hallway1
				if (userInput.contains("hallway1")) {
					{
						System.out.println("entering hallway1");
					}
				}

				// hallway2
				if (userInput.contains("hallway2")) {
					{
						System.out.println("entering hallway2");
					}
				}

				// room9
				if (room == 9) {
					r.openRoom9();
					r.readRoom9();
					r.closeRoom9();
					userInput = input.nextLine();
				}

				// room10
				if (room == 10) {
					r.openRoom10();
					r.readRoom10();
					r.closeRoom10();
					userInput = input.nextLine();
					if (userInput.contains("north")) {
						System.out.println("Do you want to access room 11 or 13?");
						userInput = input.nextLine();
						if (userInput.contains("11")) {
							room = 11;
						}
						if (userInput.contains("13")) {
							room = 13;
						}
					}
				}

				// room11
				if (room == 11) {
					r.openRoom11();
					r.readRoom11();
					r.closeRoom11();
					userInput = input.nextLine();
					if (userInput.contains("north")) {
						System.out.println("Do you want to access room 12 or hallway?");
						userInput = input.nextLine();
						if (userInput.contains("12")) {
							room = 12;
						}
					}
				}

				// room12
				if (room == 12) {
					r.openRoom12();
					r.readRoom12();
					r.closeRoom12();
					userInput = input.nextLine();
					if (userInput.contains("north")) {
						System.out.println("Do you want to access room 13, room  14, hallway 1 or hallway2?");
						userInput = input.nextLine();
						if (userInput.contains("13")) {
							room = 13;
						}
						if (userInput.contains("14")) {
							room = 14;
						}
					}
				}

				// room13
				if (room == 13) {
					r.openRoom13();
					r.readRoom13();
					r.closeRoom13();
					userInput = input.nextLine();
					if (userInput.contains("north")) {
						System.out.println("Do you want to access room 15 or hallway2?");
						userInput = input.nextLine();
						if (userInput.contains("15")) {
							room = 15;
						}
					}
				}

				// room14
				if (room == 14) {
					r.openRoom14();
					r.readRoom14();
					r.closeRoom14();
					userInput = input.nextLine();
					if (userInput.contains("north")) {
						room = 16;

					}
				}

				// room15
				if (room == 15) {
					r.openRoom15();
					r.readRoom15();
					r.closeRoom15();
					userInput = input.nextLine();
				}

				// room16
				if (room == 16) {
					r.openRoom16();
					r.readRoom16();
					r.closeRoom16();
					userInput = input.nextLine();
				}
				}
			}
	}
	



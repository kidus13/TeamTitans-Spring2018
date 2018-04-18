import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		Test t = new Test();
		RoomWriter r = new RoomWriter();
		Character p = new Character("", 0, 0);
		Monster m = new Monster("", 0, 0);
		Weapon w = new Weapon("", 0, 0, 0, 0, 0, false, false, false, false);
		Battle b = new Battle();
		Character c = new Character("", 0, 0);

		Scanner input = new Scanner(System.in);
		boolean inRoom = false;
		boolean leaving = false;
		int room = 0;
		

		// Add inventory to array
		List<Weapon> inv = new ArrayList<Weapon>();
		//inv.add(Weapon.getEI03());

		Scanner inputItem = new Scanner(System.in);

		System.out.println("Hello user type please enter 'north' to continue");
		System.out.println("To view game commands please press h at anytime");
		String userInput = input.nextLine();

		if (userInput.equalsIgnoreCase("h")) {
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
					leaving = false;
					room = 3;
				}
			}
			if (room == 2 && leaving == false) {
				// userInput = input.nextLine();
				System.out.println("You are now in room 2");
				System.out.println("Would you like to search the room? yes or no ");
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
						// m.getEM01();

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
							System.out.println("Would you like to fight or flee the monster?");
							userInput = input.nextLine();

							if (userInput.equalsIgnoreCase("flee")) {
								System.out.println("Be careful a monster could pop out of a corner");
								leaving = true;
							}
							if (userInput.contains("fight")) {
								b.enemyAppears();
								while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

									System.out.println(
											"Choose:\n1. To Attack \n2. To Equip weapon & attack \n3. To Flee");
									String choice = input.next();
									leaving = true;
									if (choice.equals("1")) {
										b.attack();

									} else if (choice.equals("2")) {
										b.weaponAttack();
									} else {
										b.run();
									}

									break;
								}
							}
						}
					}

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Be careful a monster could pop out of a corner");
					leaving = true;
					// userInput = input.nextLine();

				}
			}

			// room3
			// Monster in the room EM01(Guard)
			// Item dropped from the guard - Guard’s Armor - EI01 & Guard’s
			// Sword - EI02 Torture Room Key - EI03
			// No puzzles

			if (room == 3 && leaving == true) {
				System.out.println("You are in room 3");
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 4;
				}
			}
			if (room == 3 && leaving == false) {
				// userInput = input.nextLine();
				System.out.println("You are now in room 3");
				System.out.println("Would you like to search the room? yes or no ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom3();
					r.readRoom3();
					r.closeRoom3();
					System.out.println("");
					System.out.println("Would you like to examine the monster? yes or no");
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("Be careful a monster could pop out of a corner");
						leaving = true;
					}
					if (userInput.contains("yes")) {

						System.out.println("The guard has a few weapons you might need");
						System.out.println("Would you like to see what he has? yes or no");
						userInput = input.nextLine();
						if (userInput.equalsIgnoreCase("no")) {
							System.out.println("Be careful a monster could pop out of a corner");
							leaving = true;
						}
						if (userInput.contains("yes")) {

							System.out.println(w.getEI03());
							System.out.println("You have to battle the monster and defeat him to get the items");
							System.out.println("Would you like to fight or flee the monster?");
							userInput = input.nextLine();

							if (userInput.equalsIgnoreCase("flee")) {
								System.out.println("Be careful a monster could pop out of a corner");
								leaving = true;
							}
							if (userInput.contains("fight")) {
								b.enemyAppears();
								while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

									System.out.println(
											"Choose:\n1. To Attack \n2. To Equip weapon & attack \n3. To Flee");
									String choice = input.next();
									leaving = true;
									if (choice.equals("1")) {
										b.attack();

									} else if (choice.equals("2")) {
										b.weaponAttack();
									} else {
										b.run();
									}

									break;
								}
							}
						}
					}

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Be careful a monster could pop out of a corner");
					leaving = true;
					// userInput = input.nextLine();

				}
			}
			// room4
			// Monster in the room EM02 ( in the description of the room) but
			// not in the table. *** Maybe we shouldn't add
			// him here because its the next room and it drops a key in the next
			// room.
			// Items in the room Water Bucket - EI04
			// Puzzle EP01 -- not actually a puzzle but instead just letting the
			// player know the will need EI04 in room 8.

			if (room == 4 && leaving == true) {
				System.out.println("You are in room 4");
				System.out.println("This room has access to 5 & 7");
				
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 5;
				}
			}
			if (room == 4 && leaving == false) {
				// userInput = input.nextLine();
			   if (userInput.contains("5")) {
					room = 5;
				}
				if (userInput.contains("7")) {
					room = 7;
				}
				System.out.println("You are in room 4");
				System.out.println("This room has access to 5 & 7");
				System.out.println("Would you like to search the room? yes or no ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom4();
					r.readRoom4();
					r.closeRoom4();
					System.out.println("");
					System.out.println("This room has a few weapons you might need");
					System.out.println("Would you like to search ? yes or no");		
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("Be careful a monster could pop out of a corner");
						leaving = true;
					}
					
						if (userInput.equalsIgnoreCase("no")) {
							System.out.println("Be careful a monster could pop out of a corner");
							leaving = true;
						}
						if (userInput.contains("yes")) {
							System.out.println(w.getEI04());
							System.out.println("Would you like to add to inventory");
							userInput = input.nextLine();
							if (userInput.contains("yes")) {
								inv.add(w.getEI04());
								for(int i = 0; i<inv.size(); i++){
									System.out.println(inv.get(i)+"\n");
									leaving = true;

								}
							}
							
					}

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Be careful a monster could pop out of a corner");
					leaving = true;
					// userInput = input.nextLine();

				}
			}

			// room5
			// ***** You need this key dropped in room 3 in order to enter
			// Torture Room Key - EI03
			// Monster in the room EM02 (duplicate monster from previous room)
			// Items dropped by monster Cell Key - EI05
			// No puzzles

			if (room == 5 && !inv.contains(Weapon.getEI03())) {
			System.out.println("Sorry you need the torture room key.");
			}

			if (room == 5 && leaving == true && inv.contains(Weapon.getEI03())) {
				System.out.println("You are in room 5");
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 6;
				}
			}
			if (room == 5 && leaving == false && inv.contains(Weapon.getEI03())) {
				// userInput = input.nextLine();
				System.out.println("You are now in room 5");
				System.out.println("Would you like to search the room? yes or no ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom5();
					r.readRoom5();
					r.closeRoom5();
					System.out.println("");
					System.out.println("Would you like to examine the monster? yes or no");
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("Be careful a monster could pop out of a corner");
						leaving = true;
					}
					if (userInput.contains("yes")) {

						System.out.println("The guard has a few weapons you might need");
						System.out.println("Would you like to see what he has? yes or no");
						userInput = input.nextLine();
						if (userInput.equalsIgnoreCase("no")) {
							System.out.println("Be careful a monster could pop out of a corner");
							leaving = true;
						}
						if (userInput.contains("yes")) {

							System.out.println(w.getEI03());
							System.out.println("You have to battle the monster and defeat him to get the items");
							System.out.println("Would you like to fight or flee the monster?");
							userInput = input.nextLine();

							if (userInput.equalsIgnoreCase("flee")) {
								System.out.println("Be careful a monster could pop out of a corner");
								leaving = true;
							}
							if (userInput.contains("fight")) {
								b.enemyAppears();
								while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

									System.out.println(
											"Choose:\n1. To Attack \n2. To Equip weapon & attack \n3. To Flee");
									String choice = input.next();
									leaving = true;
									if (choice.equals("1")) {
										b.attack();

									} else if (choice.equals("2")) {
										b.weaponAttack();
									} else {
										b.run();
									}

									break;
								}
							}
						}
					}

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Be careful a monster could pop out of a corner");
					leaving = true;
					// userInput = input.nextLine();

				}
			}

			// room6
			// No monster
			// Items in the room Health Potion - EI07
			// No puzzle
			leaving =false;
			if (room == 6 && leaving == true) {
				System.out.println("You are in room 6");
				System.out.println("This room is a dead end so you can only move south ");
				
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 6;
					System.out.println("Dead end try again ");
					 userInput = input.nextLine();

					
				}
				if (userInput.contains("south")) {
					leaving = false;
					room = 5;
				}
			}
			if (room == 6 && leaving == false) {
				// userInput = input.nextLine();
			   
				System.out.println("You are in room 6");
				System.out.println("This room is a dead end so you can only move south ");
				System.out.println("Would you like to search the room? yes or no ");

				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom6();
					r.readRoom6();
					r.closeRoom6();
					System.out.println("");
					System.out.println("This room has a few weapons you might need");
					System.out.println("Would you like to search ? yes or no");		
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("Be careful a monster could pop out of a corner");
						leaving = true;
					}
					
						if (userInput.equalsIgnoreCase("no")) {
							System.out.println("Be careful a monster could pop out of a corner");
							leaving = true;
						}
						if (userInput.contains("yes")) {
							System.out.println(w.getEI04());
							System.out.println("Would you like to add to inventory");
							userInput = input.nextLine();
							if (userInput.contains("yes")) {
								inv.add(w.getEI07());
								for(int i = 0; i<inv.size(); i++){
									System.out.println(inv.get(i)+"\n");
									leaving = true;

								}
							}
							
					}

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Be careful a monster could pop out of a corner");
					leaving = true;
					// userInput = input.nextLine();

				}
			}
			// room7
			// No monster
			// No puzzle
			// No item
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
			// Monster in the room EM03
			// Items dropped by monster Earthen Helmet - EI06.
			// Puzzle EP01 -- puzzle states you need Water Bucket - EI04 to
			// defeat the monster.
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
			// No monster
			// No item
			// No puzzle
			if (room == 9) {
				r.openRoom9();
				r.readRoom9();
				r.closeRoom9();
				userInput = input.nextLine();
			}

			// room10
			// No monster
			// Puzzle WP01 -- must solve puzzle correctly in order to move to
			// room 11
			// Items WI04 & WI05
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
			// Monster WM01
			// Items none
			// Puzzle none
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
			// Monster none
			// Items none
			// Puzzle none
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
			// Monster WM04
			// Items WI01
			// Puzzle none

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
			// Monster none
			// Items WI02 and WI06
			// Puzzle WP02 -- you must solve this puzzle in order to get the
			// items above
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
			// Monster WM02
			// Items WI03
			// Puzzle none
			if (room == 15) {
				r.openRoom15();
				r.readRoom15();
				r.closeRoom15();
				userInput = input.nextLine();
			}

			// room16
			// Monster WM03 -- you need to have WI03 in order to defeat the
			// monster.
			// Puzzle none
			// Item none
			if (room == 16) {
				r.openRoom16();
				r.readRoom16();
				r.closeRoom16();
				userInput = input.nextLine();
			}

			// room17
			if (room == 17) {
				r.openRoom17();
				r.readRoom17();
				r.closeRoom17();
				userInput = input.nextLine();
			}

			// room18
			if (room == 18) {
				r.openRoom18();
				r.readRoom18();
				r.closeRoom18();
				userInput = input.nextLine();
			}
			// room19
			if (room == 19) {
				r.openRoom19();
				r.readRoom19();
				r.closeRoom19();
				userInput = input.nextLine();
			}

			// room20
			if (room == 20) {
				r.openRoom20();
				r.readRoom20();
				r.closeRoom20();
				userInput = input.nextLine();
			}
			// room21
			if (room == 21) {
				r.openRoom21();
				r.readRoom21();
				r.closeRoom21();
				userInput = input.nextLine();
			}

			// room22
			if (room == 22) {
				r.openRoom22();
				r.readRoom22();
				r.closeRoom22();
				userInput = input.nextLine();
			}
			// room23
			if (room == 23) {
				r.openRoom23();
				r.readRoom23();
				r.closeRoom23();
				userInput = input.nextLine();
			}

			// room24
			if (room == 24) {
				r.openRoom24();
				r.readRoom24();
				r.closeRoom24();
				userInput = input.nextLine();
			}

			// room25
			if (room == 25) {
				r.openRoom25();
				r.readRoom25();
				r.closeRoom25();
				userInput = input.nextLine();
			}

			// room26
			if (room == 26) {
				r.openRoom26();
				r.readRoom26();
				r.closeRoom26();
				userInput = input.nextLine();
			}
			// room27
			if (room == 27) {
				r.openRoom27();
				r.readRoom27();
				r.closeRoom27();
				userInput = input.nextLine();
			}

			// room28
			if (room == 28) {
				r.openRoom28();
				r.readRoom28();
				r.closeRoom28();
				userInput = input.nextLine();
			}
			// room29
			if (room == 29) {
				r.openRoom29();
				r.readRoom29();
				r.closeRoom29();
				userInput = input.nextLine();
			}

			// room30
			if (room == 30) {
				r.openRoom30();
				r.readRoom30();
				r.closeRoom30();
				userInput = input.nextLine();
			}
		}
	}
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		Test t = new Test();
		Puzzles puz = new Puzzles();
		RoomWriter r = new RoomWriter();
		Character c = new Character("", 0, 0);
		Monster m = new Monster("", 0, 0);
		Weapon w = new Weapon("", 0, 0, 0, 0, 0, false, false, false, false);
		Battle b = new Battle();
		// Character c = new Character("", 0, 0);

		Scanner input = new Scanner(System.in);
		boolean leaving = false;
		int room = 1;

		// Add inventory to array
		List<Weapon> inv = new ArrayList<Weapon>();

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

			inv.add(w.getEI03());
			inv.add(w.getEI03());
			inv.add(w.getEI03());

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
				userInput = input.nextLine();
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
								b.monsterAppearsEM01();
								while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

									System.out.println(
											"Choose:\n1. To Attack \n2. To Equip weapon & attack \n3. To Flee");
									String choice = input.next();
									leaving = true;
									if (choice.equals("1")) {
										b.attackEM01();

									} else if (choice.equals("2")) {
										b.weaponAttackEM01();
									} else {
										b.runEM01();
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
								b.monsterAppearsEM02();
								while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

									System.out.println(
											"Choose:\n1. To Attack \n2. To Equip weapon & attack \n3. To Flee");
									String choice = input.next();
									leaving = true;
									if (choice.equals("1")) {
										b.weaponAttackEM02();

									} else if (choice.equals("2")) {
										b.weaponAttackEM02();
									} else {
										b.runEM02();
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
			if (userInput.contains("5")) {
				room = 5;
				leaving = false;

			}
			if (userInput.contains("7")) {
				room = 7;
				leaving = false;

			}
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
						System.out.print("You must complete the puzzle to obtain the object");
						System.out.println("Would you like to proceed?");
						userInput = input.nextLine();
						if (userInput.contains("yes")) {

							puz.puzzleSol();
							leaving = true;

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

			if (room == 5 && leaving == false && b.inv.size() < 1) {
				System.out.println("Sorry you need the torture room key.");
				userInput = input.nextLine();
			}

			if (room == 5 && leaving == true && b.inv.size() > 0) {
				System.out.println("You are in room 5");
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 6;
				}
			}
			if (room == 5 && leaving == false && b.inv.size() > 0) {

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
								b.monsterAppearsEM02();
								while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

									System.out.println(
											"Choose:\n1. To Attack \n2. To Equip weapon & attack \n3. To Flee");
									String choice = input.next();
									leaving = true;
									if (choice.equals("1")) {
										b.weaponAttackEM02();

									} else if (choice.equals("2")) {
										b.weaponAttackEM02();
									} else {
										b.runEM02();
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
			if (room == 6 && leaving == true) {
				System.out.println("You are in room 6");

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
				System.out.println("Would you like to search the room? yes or no ");

				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom6();
					r.readRoom6();
					r.closeRoom6();
					System.out.println("");
					System.out.println("Go south to get out of here");
					leaving = true;
				}
			}
			// room7
			// No monster
			// No puzzle
			// No item
			if (userInput.contains("4")) {
				room = 4;
				leaving = false;

			}
			if (userInput.contains("8")) {
				room = 8;
				leaving = false;

			}
			
			if (room == 7 && leaving == true) {
				System.out.println("You are in room 7");
				System.out.println("Rooms 4 and 8 available");
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 4;
					userInput = input.nextLine();
				}
				if (userInput.contains("south")) {
					leaving = false;
					room = 8;
				}
			}

			if (room == 7 && leaving == false) {
				// userInput = input.nextLine();
				System.out.println("You are in room 7");
				System.out.println("Would you like to search the room? yes or no ");

				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom7();
					r.readRoom7();
					r.closeRoom7();
					System.out.println("");
					System.out.println("Nothing to see, Go south to get out of here");
					leaving = true;
				}
			}
			// room8
			// Monster in the room EM03
			// Items dropped by monster Earthen Helmet - EI06.
			// Puzzle EP01 -- puzzle states you need Water Bucket - EI04 to
			// defeat the monster.
			
			if (userInput.contains("9")) {
				room = 9;
				leaving = false;

			}
			if (room == 8 && leaving == true) {
				System.out.println("You are in room 8....");
				// System.out.println("Room 9 is availbale ");
				if (userInput.contains("9")) {
					room = 9;
					leaving = false;
				}
			}
			if (room == 8 && leaving == false) {
				System.out.println("You are in room 8");
				System.out.println("Would you like to search the room? \n Yes or No");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom8();
					r.readRoom8();
					r.closeRoom8();
					System.out.println("");
				}System.out.println("Would you like to examine the monster? yes or no");
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
							leaving = true;
							if (userInput.equalsIgnoreCase("flee")) {
								System.out.println("Be careful a monster could pop out of a corner");
								leaving = true;
							}
							if (userInput.contains("fight")) {
								b.monsterAppearsEM02();
								while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

									System.out.println(
											"Choose:\n1. To Attack \n2. To Equip weapon & attack \n3. To Flee");
									String choice = input.next();
									leaving = true;
									if (choice.equals("1")) {
										b.weaponAttackEM02();
										leaving = true;
									} else if (choice.equals("2")) {
										b.weaponAttackEM02();
										leaving = true;
									} else {
										b.runEM02();
										leaving = true;
									}

									break;
								}
							}
						}
					}
				
				
			else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Be careful a monster could pop out of a corner");
					leaving = true;
					// userInput = input.nextLine();

				}
			}
		
			// room9
			// No monster
			// No item
			// No puzzle
			
			if (room == 9 && leaving == true) {
				System.out.println("You are in room 9...");
				System.out.println("Rooms 10 available");
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 10;					
				}
				if (userInput.contains("10")) {
					leaving = false;
					room = 10;
				}
			}
			
			if (room == 9 && leaving == false) {
				System.out.println("You are in room 9");
				System.out.println("Would you like to search the room? \n Yes or No");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom9();
					r.readRoom9();
					r.closeRoom9();
					System.out.println("Please proceed");

					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("Be careful a monster could pop out of a corner");
						leaving = true;
					}
				}
			}

			// room10
			// No monster
			// Puzzle WP01 -- must solve puzzle correctly in order to move to
			// room 11
			// Items WI04 & WI05
			if (userInput.contains("11")) {
				room = 11;
				leaving = false;

			}
			if (userInput.contains("13")) {
				room = 13;
				leaving = false;

			}
			if (room == 10 && leaving == true) {
				System.out.println("You are in room 10");
				System.out.println("This room has access to 11 & 13");

				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 11;
				}
			}
			if (room == 10 && leaving == false) {
				// userInput = input.nextLine();

				System.out.println("You are in room 10");
				System.out.println("This room has access to 11 & 13");
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
						System.out.print("You must complete the puzzle to obtain the object");
						System.out.println("Would you like to proceed?");
						userInput = input.nextLine();
						if (userInput.contains("yes")) {
							// need correct puzzle here
							puz.puzzleSol();
							leaving = true;

						}

					}

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Be careful a monster could pop out of a corner");
					leaving = true;
					// userInput = input.nextLine();

				}
			}
			// room11
			// Monster WM01
			// Items none
			// Puzzle none
			if (room == 11 && leaving == true) {
				System.out.println("You are in room 11");
				// System.out.println("Room 9 is availbale ");
				if (userInput.contains("11")) {
					room = 12;
					leaving = false;
				}
			}
			if (room == 11 && leaving == false) {
				System.out.println("You are in room 11");
				System.out.println("Would you like to search the room? \n Yes or No");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom11();
					r.readRoom11();
					r.closeRoom11();
					System.out.println("");
					System.out.println("Would you like to examine the monster? yes or no");
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
							b.monsterAppearsEM02();
							while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

								System.out.println("Choose:\n1. To Attack \n2. To Equip weapon & attack \n3. To Flee");
								String choice = input.next();
								leaving = true;
								if (choice.equals("1")) {
									b.weaponAttackEM02();

								} else if (choice.equals("2")) {
									b.weaponAttackEM02();
								} else {
									b.runEM02();
								}

								break;
							}
						}
					}

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Be careful a monster could pop out of a corner");
					leaving = true;
					// userInput = input.nextLine();

				}
			}

			// room12 -------------->>>>> WR04
			// Monster none
			// Items none
			// Puzzle none

			if (room == 12 && leaving == true) {
				System.out.println("You are in room 12");
				System.out.println("This room has access to rooms 11, 13, 14, and hallway1");

				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 11;
				}
				if (userInput.contains("11")) {
					room = 11;
					leaving = false;

				}
				if (userInput.contains("13")) {
					room = 13;
					leaving = false;

				}
				if (userInput.contains("14")) {
					room = 14;
					leaving = false;

				}
				if (userInput.contains("hallway1")) {
					System.out.println("entering hallway1");
				}
			}

//<<<<<<< HEAD
			// room18
			if (room == 18) {
				r.openRoom18();
				r.readRoom18();
				r.closeRoom18();
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					System.out.println("Do you want to access room 19, or 22?");
					userInput = input.nextLine();
					if (userInput.contains("19")) {
						room = 19;
					}
					if (userInput.contains("22")) {
						room = 22;
					}
				}
			}

			// room19
			//monster 9 - ultimate hell fire beast FM01
			//if01 molten lava sword
			
			/*if (room == 19) {
				r.openRoom19();
				r.readRoom19();
				r.closeRoom19();
				userInput = input.nextLine();
			}
			if (room == 19 && leaving == true) {
				System.out.println("You are in room ");
				System.out.println("This room has access to 1 & 3");
				
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 1;
				}
			}
			if (room == 19 && leaving == false) {
				// userInput = input.nextLine();
			  
				System.out.println("You are in room 19");
				System.out.println("This room has access to 1 & 3");
				System.out.println("Would you like to search the room? yes or no ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom19();
					r.readRoom19();
					r.closeRoom19();
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
							System.out.println(w.getIF01());
							//System.out.print("You must complete the puzzle to obtain the object");
							//System.out.println("Would you like to proceed?");
							userInput = input.nextLine();
							if (userInput.contains("yes")) {
								
							puz.puzzleSol();
							leaving = true;
							System.out.println("okay keep it moving");
							}
							
					}

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Be careful a monster could pop out of a corner");
					leaving = true;
					// userInput = input.nextLine();

				}
			}*/
			// room20
			//no items or monsters
			if (room == 20) {
				r.openRoom20();
				r.readRoom20();
				r.closeRoom20();
				userInput = input.nextLine();
			}
			if (room == 20 && leaving == true) {
				System.out.println("You are in room 20");
				System.out.println("This room has access to rooms 19, 21, 24");
				
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 20;
				}
			 if (userInput.contains("19")) {
					room = 19;
					leaving = false;

				}
				if (userInput.contains("21")) {
					room = 21;
					leaving = false;

				}
				if (userInput.contains("24")) {
					room = 24;
					leaving = false;

				}
				/*if (userInput.contains("hallway1")) {					
				System.out.println("entering hallway1");				
				}*/
			}
			
			if (room == 20 && leaving == false) {  
				System.out.println("You are in room 20");
				System.out.println("This room has access to rooms 19, 21, 24 and hallway1");
				System.out.println("Would you like to search the room? \n Yes or No ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom20();
					r.readRoom20();
					r.closeRoom20();
					System.out.println("");
					System.out.println("Would you like to search? \n Yes or No");		
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("Be careful you never know whats lurking");
						leaving = true;
					}
					
						if (userInput.contains("yes")) {
							System.out.print("Nothing to see here. Proceed?");
							userInput = input.nextLine();
							if (userInput.contains("yes")) {
							leaving = true;
							}
						}
//=======
			if (room == 12 && leaving == false) {
				System.out.println("You are in room 12");
				System.out.println("This room has access to rooms 11, 13, 14, and hallway1");
				System.out.println("Would you like to search the room? \n Yes or No ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom12();
					r.readRoom12();
					r.closeRoom12();
					System.out.println("");
					System.out.println("Would you like to search? \n Yes or No");
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("Be careful you never know whats lurking");
						leaving = true;
					}

					if (userInput.contains("yes")) {
						System.out.print("Nothing to see here. Proceed?");
						userInput = input.nextLine();
						if (userInput.contains("yes")) {
							leaving = true;
						}
					}
//>>>>>>> f3613cd29b1f355409b35acdde5b681024b49a76

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Stop lollygagging and move on. ");
					leaving = true;
//<<<<<<< HEAD
					}
			}
			
			
			
			
			// room21
			//puzzle pf01
			//no monsters
			//27 20 22 
			if (userInput.contains("22")) {
								room = 22;
								leaving = false;
				
							}
							if (userInput.contains("27")) {
								room = 27;
								leaving = false;
				
							}
							if (room == 21 && leaving == true) {
								System.out.println("You are in room 21");
								System.out.println("This room has access to 22 & 27");
				
				 				userInput = input.nextLine();
				 				if (userInput.contains("north")) {
									System.out.println("Do you want to access room 22 or 27?");
									leaving = false;
									room = 22;
								}
							}
							if (room == 21 && leaving == false) {
								// userInput = input.nextLine();
				
								System.out.println("You are in room 21");
								System.out.println("This room has access to 22 & 27");
								System.out.println("Would you like to search the room? yes or no ");
								userInput = input.nextLine();
								if (userInput.contains("yes")) {
									r.openRoom21();
									r.readRoom21();
									r.closeRoom21();
									System.out.println("");
								//	System.out.println("This room has a few weapons you might need");
									System.out.println("Would you like to search ? yes or no");
				 					userInput = input.nextLine();
									if (userInput.contains("22")) {
										room = 22;
									if (userInput.equalsIgnoreCase("no")) {
										System.out.println("Be careful a monster could pop out of a corner");
										leaving = true;
				 					}
									if (userInput.contains("27")) {
										room = 27;
				
									if (userInput.equalsIgnoreCase("no")) {
										System.out.println("Be careful a monster could pop out of a corner");
										leaving = true;
									}
									if (userInput.contains("yes")) {
										//System.out.println(w.getEI04());
										System.out.print("You must complete the puzzle.");
										System.out.println("Would you like to proceed?");
										userInput = input.nextLine();
										if (userInput.contains("yes")) {
											// need correct puzzle here
											
											puz.puzzleSol();
											leaving = true;
				
										}
				
				 					}
				
								} else if (userInput.equalsIgnoreCase("no")) {
									System.out.println("Be careful a monster could pop out of a corner");
									leaving = true;
									// userInput = input.nextLine();
				
				 				}
				 			}
				
			
			
			
			
			
			// room22
			//monster hellfire beast - monster 9
			//drops lava gauntlets - if02
			//no puzzle
			
			if (room == 22) {
				r.openRoom22();
				r.readRoom22();
				r.closeRoom22();
				userInput = input.nextLine();
			}
			// room23
			//no puzzle or monsters
			if (room == 23) {
				r.openRoom23();
				r.readRoom23();
				r.closeRoom23();
				userInput = input.nextLine();
			}

			if (room == 23 && leaving == true) {
				System.out.println("You are in room 23");
				System.out.println("This room has access to rooms 22, 25 and 27");
				
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 22;
				}
			 if (userInput.contains("22")) {
					room = 22;
					leaving = false;

				}
				if (userInput.contains("25")) {
					room = 25;
					leaving = false;

				}
				if (userInput.contains("27")) {
					room = 27;
					leaving = false;

				}
				/*if (userInput.contains("hallway1")) {					
				System.out.println("entering hallway1");				
				}*/
			}
			
			if (room == 23 && leaving == false) {  
				System.out.println("You are in room 23");
				System.out.println("This room has access to rooms 22, 25 and 27");
				System.out.println("Would you like to search the room? \n Yes or No ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom23();
					r.readRoom23();
					r.closeRoom23();
					System.out.println("");
					System.out.println("Would you like to search? \n Yes or No");		
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("Be careful you never know whats lurking");
						leaving = true;
					}
					
						if (userInput.contains("yes")) {
							System.out.print("Nothing to see here. Proceed?");
							userInput = input.nextLine();
							if (userInput.contains("yes")) {
							leaving = true;
							}
						}

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Stop lollygagging and move on. ");
					leaving = true;
					}
			}
			// room24 
			//no puzzle or monsters
			if (room == 24) {
				r.openRoom24();
				r.readRoom24();
				r.closeRoom24();
				userInput = input.nextLine();
			}
			if (room == 24 && leaving == true) {
				System.out.println("You are in room 24");
				System.out.println("This room has access to rooms 21, 26 and 27");
				
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 24;
				}
			 if (userInput.contains("21")) {
					room = 21;
					leaving = false;

				}
				if (userInput.contains("26")) {
					room = 26;
					leaving = false;

				}
				if (userInput.contains("27")) {
					room = 27;
					leaving = false;

				}
				/*if (userInput.contains("hallway1")) {					
				System.out.println("entering hallway1");				
				}*/
			}
			
			if (room == 24 && leaving == false) {  
				System.out.println("You are in room 24");
				System.out.println("This room has access to rooms 21, 26 and 27");
				System.out.println("Would you like to search the room? \n Yes or No ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom24();
					r.readRoom24();
					r.closeRoom24();
					System.out.println("");
					System.out.println("Would you like to search? \n Yes or No");		
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("Be careful you never know whats lurking");
						leaving = true;
					}
					
						if (userInput.contains("yes")) {
							System.out.print("Nothing to see here. Proceed?");
							userInput = input.nextLine();
							if (userInput.contains("yes")) {
							leaving = true;
							}
						}

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Stop lollygagging and move on. ");
					leaving = true;
					}
			}
			// room25
			//
			if (room == 25) {
				r.openRoom25();
				r.readRoom25();
				r.closeRoom25();
				userInput = input.nextLine();
			}
			if (room == 25 && leaving == true) {
				System.out.println("You are in room 25");
				System.out.println("This room has access to rooms 23, 26 and 27");
				
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 23;
				}
			 if (userInput.contains("25")) {
					room = 25;
					leaving = false;

				}
				if (userInput.contains("26")) {
					room = 26;
					leaving = false;

				}
				if (userInput.contains("27")) {
					room = 27;
					leaving = false;

				}
				/*if (userInput.contains("hallway1")) {					
				System.out.println("entering hallway1");				
				}*/
			}
			
			if (room == 25 && leaving == false) {  
				System.out.println("You are in room 25");
				System.out.println("This room has access to rooms 23, 26 and 27");
				System.out.println("Would you like to search the room? \n Yes or No ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom25();
					r.readRoom25();
					r.closeRoom25();
					System.out.println("");
					System.out.println("Would you like to search? \n Yes or No");		
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("Be careful you never know whats lurking");
						leaving = true;
					}
					
						if (userInput.contains("yes")) {
							System.out.print("Nothing to see here. Proceed?");
							userInput = input.nextLine();
							if (userInput.contains("yes")) {
							leaving = true;
							}
						}

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Stop lollygagging and move on. ");
					leaving = true;
					}
			}

				}
			}

			// room13------------>>>>> WR 05
			// Monster WM04
			// Items WI01
			// Puzzle none

			if (room == 13 && leaving == true) {
				System.out.println("You are in room 13");
				System.out.println("This room has access to rooms 10, 12, 15, and hallway2");
//>>>>>>> f3613cd29b1f355409b35acdde5b681024b49a76

				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 12;
				}
				if (userInput.contains("10")) {
					room = 10;
					leaving = false;

//<<<<<<< HEAD
			// room28
			
//=======
				}
				if (userInput.contains("12")) {
					room = 12;
					leaving = false;
//>>>>>>> f3613cd29b1f355409b35acdde5b681024b49a76

				}
				if (userInput.contains("15")) {
					room = 15;
					leaving = false;

				}
				if (userInput.contains("hallway2")) {
					System.out.println("Entering Hallway 2");
				}

			}
			if (room == 13 && leaving == false) {
				// userInput = input.nextLine();

				System.out.println("You are in room 13");
				System.out.println("This room has a weapon you might need ");
				System.out.println("Would you like to search the room? \n Yes or No ");

				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom13();
					r.readRoom13();
					r.closeRoom13();
					System.out.println("");
					System.out.println("This room has a few weapons you might need");
					System.out.println("Would you like to search ? \n Yes or No");
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("You need to wake up, you'll need the weapon going forward");
						leaving = true;
					}
					if (userInput.contains("yes")) {
						System.out.println(w.getWI01());

						System.out.println("You have to battle the monster and defeat him to get the item");
						System.out.println("Would you like to fight or flee the monster?");
						userInput = input.nextLine();
						if (userInput.equalsIgnoreCase("flee")) {
							System.out.println("Only losers run away from battle");
							leaving = true;
						}
						if (userInput.contains("fight")) {
							b.monsterAppearsWM04();
							while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

								System.out.println("Choose:\n1. To Equip weapon & attack \n2. To Flee");
								String choice = input.next();
								leaving = true;
								if (choice.equals("1")) {
									b.weaponAttackEM01();
								} else {
									b.runEM01();
								}

								break;
							}
						}
					}

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Be careful a monster could pop out of a corner");
					leaving = true;
					// userInput = input.nextLine();

				}
			}

			// room14 ----->>> wr 6
			// Monster none
			// Items WI02 and WI06
			// Puzzle WP02 -- you must solve this puzzle in order to get the
			// items above
			if (room == 14 && leaving == true) {
				System.out.println("You are in room 14");
				System.out.println("This room has access to rooms 12, 16");

				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 12;
				}
				if (userInput.contains("12")) {
					room = 12;
					leaving = false;

				}
				if (userInput.contains("16")) {
					room = 16;
					leaving = false;
				}
			}
			if (room == 14 && leaving == false) {
				// userInput = input.nextLine();

				System.out.println("You are in room 14");
				System.out.println("This room has a weapon you might need ");
				System.out.println("Would you like to search the room? \n Yes or No ");

				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom14();
					r.readRoom14();
					r.closeRoom14();
					System.out.println("");
					System.out.println("This room has a few weapons you might need");
					System.out.println("Would you like to search ? \n Yes or No");
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("You need to wake up, you'll need the weapon going forward");
						leaving = true;
					}

					if (userInput.contains("yes")) {
						System.out.println(w.getWI02());
						System.out.print("You must complete the puzzle to obtain the object");
						System.out.println("Would you like to proceed? \n  Yes or No");
						userInput = input.nextLine();
						if (userInput.contains("yes")) {

							puz.puzzleSol();
							leaving = true;

						}
					}

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Be careful a monster could pop out of a corner");
					leaving = true;
					// userInput = input.nextLine();

				}
			}

			// room15----------->>>> wr07
			// Monster WM02
			// Items WI03
			// Puzzle none
			if (room == 15 && leaving == true) {
				System.out.println("You are in room 15");
				System.out.println("This room has access to rooms 13, and 16");

				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 13;
				}
				if (userInput.contains("13")) {
					room = 13;
					leaving = false;
				}
				if (userInput.contains("16")) {
					room = 16;
					leaving = false;
				}

			}
			if (room == 15 && leaving == false) {
				// userInput = input.nextLine();

				System.out.println("You are in room 16");
				System.out.println("This room has a weapon you might need ");
				System.out.println("Would you like to search the room? \n Yes or No ");

				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom15();
					r.readRoom15();
					r.closeRoom15();
					System.out.println("");
					System.out.println("This room has a few weapons you might need");
					System.out.println("Would you like to search ? \n Yes or No");
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("You need to wake up, you'll need the weapon going forward");
						leaving = true;
					}
					if (userInput.contains("yes")) {
						System.out.println(w.getWI01());

						System.out.println("You have to battle the monster and defeat him to get the item");
						System.out.println("Would you like to fight or flee the monster?");
						userInput = input.nextLine();
						if (userInput.equalsIgnoreCase("flee")) {
							System.out.println("Only losers run away from battle");
							leaving = true;
						}
						if (userInput.contains("fight")) {
							b.monsterAppearsWM02();
							while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

								System.out.println("Choose:\n1. To Equip weapon & attack \n2. To Flee");
								String choice = input.next();
								leaving = true;
								if (choice.equals("1")) {
									b.weaponAttackWM02();
								} else {
									b.runWM02();
								}

								break;
							}
						}
					}
				}

				else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Be careful a monster could pop out of a corner");
					leaving = true;
					// userInput = input.nextLine();

				}
			}

			/**
			 * Room 16 - WR08 WM03 Access to WR07 (15) and Hallway No items No puzzles WM03
			 */

			if (room == 16 && leaving == true) {
				System.out.println("You are in room 16...");
				System.out.println("This room has access to room 15, and hallway1");

				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 15;
				}
				if (userInput.contains("15")) {
					room = 15;
					leaving = false;
				}
				if (userInput.contains("hallway1")) {
					System.out.println("Entering Hallway 1");
					room = 17;
					leaving = false;
				}

			}
			if (room == 16 && leaving == false) {
				// userInput = input.nextLine();

				System.out.println("You are in room 16");
				System.out.println("Would you like to search the room? \n Yes or No ");

				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom16();
					r.readRoom16();
					r.closeRoom16();
					System.out.println("");
					System.out.println("Would you like to search ? \n Yes or No");
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("Your loss!");
						leaving = true;
					}
					if (userInput.contains("yes")) {
						System.out.println(w.getWI01());

						System.out
								.println("You have to battle the monster and defeat her to move on to the next level");
						System.out.println("Would you like to fight or flee the monster?");
						userInput = input.nextLine();
						if (userInput.equalsIgnoreCase("flee")) {
							System.out.println("You've Lost the Game! Good Riddance!");
							System.exit(15);
						}
						if (userInput.contains("fight")) {
							b.monsterAppearsWM03();
							System.out.println("Use that Actinolite you fought so hard for");
							while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

								System.out.println("Choose:\n1. To Equip weapon & attack \n2. To Flee");
								String choice = input.next();
								leaving = true;
								if (choice.equals("1")) {
									b.weaponAttackEM01();
								} else {
									b.runWM03();
								}

								break;
							}
						}
					}
				}

				else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Be careful a monster could pop out of a corner");
					leaving = true;
					// userInput = input.nextLine();

				}
			}

			// room17

			if (room == 17 && leaving == true) {
				System.out.println("You are in Hallway 1...");
				System.out.println("You have access to rooms 2, 3, 4, 7, 8");

				userInput = input.nextLine();
				if (userInput.contains("2")) {
					leaving = false;
					room = 2;
				}
				if (userInput.contains("3")) {
					room = 3;
					leaving = false;
				}
				if (userInput.contains("4")) {
					leaving = false;
					room = 4;
				}
				if (userInput.contains("7")) {
					room = 7;
					leaving = false;
				}
				if (userInput.contains("8")) {
					leaving = false;
					room = 8;
				}

			}
			if (room == 17 && leaving == false) {
				r.openRoom17();
				r.readRoom17();
				r.closeRoom17();
				System.out.println("Navigate thru here");
				leaving = true;
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
			// no items or monsters
			if (room == 20) {
				r.openRoom20();
				r.readRoom20();
				r.closeRoom20();
				userInput = input.nextLine();
			}
			// room21
			// puzzle pf01
			// no monsters
			if (room == 21) {
				r.openRoom21();
				r.readRoom21();
				r.closeRoom21();
				userInput = input.nextLine();
			}

			// room22
			// monster hellfire beast - monster 9
			// drops lava gauntlets - if02
			// no puzzle

			if (room == 22) {
				r.openRoom22();
				r.readRoom22();
				r.closeRoom22();
				userInput = input.nextLine();
			}
			// room23
			// no puzzle or monsters
			if (room == 23) {
				r.openRoom23();
				r.readRoom23();
				r.closeRoom23();
				userInput = input.nextLine();
			}

			// room24
			// no puzzle or monsters
			if (room == 24) {
				r.openRoom24();
				r.readRoom24();
				r.closeRoom24();
				userInput = input.nextLine();
			}

			// room25
			//
			if (room == 25) {
				r.openRoom25();
				r.readRoom25();
				r.closeRoom25();
				userInput = input.nextLine();
			}

			// room26
			// Treasure Keeper Absolute Blue - Monster 11
			// flame potion - if04 item
			// puzzle PF03
			if (room == 26) {
				r.openRoom26();
				r.readRoom26();
				r.closeRoom26();
				userInput = input.nextLine();
			}
			// room27
			// Lava Queen Fluffy - Monster 10
			// puzzle PF02
			// IF03 flame key item
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
//<<<<<<< HEAD

}}}
//=======

//>>>>>>> f3613cd29b1f355409b35acdde5b681024b49a76

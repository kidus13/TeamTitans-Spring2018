
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		Test t = new Test();
		Puzzles puz = new Puzzles();
		RoomWriter r = new RoomWriter();
		Character p = new Character("", 0, 0);
		Monster m = new Monster("", 0, 0);
		Weapon w = new Weapon("", 0, 0, 0, 0, 0, false, false, false, false);
		Battle b = new Battle();
		Character c = new Character("", 0, 0);

		Scanner input = new Scanner(System.in);
		boolean leaving = false;
		int room = 0;
		

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
			
			//inv.add(w.getEI03());



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
			// Item dropped from the guard - Guard�s Armor - EI01 & Guard�s
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

			if (room == 5 && leaving == false && b.inv.size()<1) {
			System.out.println("Sorry you need the torture room key.");
			userInput = input.nextLine();
			}

			if (room == 5 && leaving == true && b.inv.size()>0) {
				System.out.println("You are in room 5");
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 6;
				}
			}
			if (room == 5 && leaving == false && b.inv.size()>0) {

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
								b.inv.add(w.getEI07());
								for(int i = 0; i<b.inv.size(); i++){
									System.out.println(b.inv.get(i)+"\n");
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
			if (room == 7 && leaving == false) {
				// userInput = input.nextLine();
			   
				System.out.println("You are in room 7");
				System.out.println("This room is a dead end so you can only move south ");
				System.out.println("Would you like to search the room? yes or no ");

				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom7();
					r.readRoom7();
					r.closeRoom7();
						
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("Be careful a monster could pop out of a corner");
						leaving = true;
					}

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Be careful a monster could pop out of a corner");
					leaving = true;
					// userInput = input.nextLine();

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
			//no items or monsters
			if (room == 20) {
				r.openRoom20();
				r.readRoom20();
				r.closeRoom20();
				userInput = input.nextLine();
			}
			// room21
			//puzzle pf01
			//no monsters
			if (room == 21) {
				r.openRoom21();
				r.readRoom21();
				r.closeRoom21();
				userInput = input.nextLine();
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

			// room24 
			//no puzzle or monsters
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
			//Treasure Keeper Absolute Blue - Monster 11
			//flame potion - if04 item
			//puzzle PF03
			if (room == 26) {
				r.openRoom26();
				r.readRoom26();
				r.closeRoom26();
				userInput = input.nextLine();
			}
			// room27
			//Lava Queen Fluffy - Monster 10
			//puzzle PF02
			//IF03 flame key item
			if (room == 27) {
				r.openRoom27();
				r.readRoom27();
				r.closeRoom27();
				userInput = input.nextLine();
			}

			// room28
			// Items IA06“Gilded Sword” IA07 “Gilded Plate”IA08 “Gilded Helm”

			if (room == 28 && leaving == true) {
				System.out.println("You are in room 28");
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 29;
				}
			}
			if (room == 28 && leaving == false) {
				// userInput = input.nextLine();
				System.out.println("You are now in room 28");
				System.out.println("Would you like to search the room? yes or no ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom28();
					r.readRoom28();
					r.closeRoom28();
					System.out.println("");
					System.out.println("This room has a chest.");
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
							System.out.println(w.getAI06());
							System.out.println(w.getAI07());
							System.out.println(w.getAI08());
							
							System.out.println("Would you like to add to inventory");
							userInput = input.nextLine();
							if (userInput.contains("yes")) {
								b.inv.add(w.getAI06());
								b.inv.add(w.getAI07());
								b.inv.add(w.getAI08());
								for(int i = 0; i<b.inv.size(); i++){
									System.out.println(b.inv.get(i)+"\n");
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
			// room29
			// Breeze Key IA01
			//AM01

			if (room == 29 && leaving == true) {
				System.out.println("You are in room 29");
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 30;
				}
			}
			if (room == 29 && leaving == false) {
				// userInput = input.nextLine();
				System.out.println("You are now in room 29");
				System.out.println("Would you like to search the room? yes or no ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom29();
					r.readRoom29();
					r.closeRoom29();
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

							System.out.println(w.getAI01());
							System.out.println("You have to battle the monster and defeat him to get the items");
							System.out.println("Would you like to fight or flee the monster?");
							userInput = input.nextLine();

							if (userInput.equalsIgnoreCase("flee")) {
								System.out.println("Be careful a monster could pop out of a corner");
								leaving = true;
							}
							if (userInput.contains("fight")) {
								b.monsterAppearsAM01();
								while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

									System.out.println(
											"Choose:\n1. To Attack \n2. To Equip weapon & attack \n3. To Flee");
									String choice = input.next();
									leaving = true;
									if (choice.equals("1")) {
										b.weaponAttackAM01();

									} else if (choice.equals("2")) {
										b.weaponAttackAM01();
									} else {
										b.runAM01();
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

			// room30
			// Fancy Potion IA02
			// PA01
			// AM02 x2

			if (room == 30 && leaving == true) {
				System.out.println("You are in room 30");
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 31;
				}
			}
			if (room == 30 && leaving == false) {
				// userInput = input.nextLine();
				System.out.println("You are now in room 30");
				System.out.println("Would you like to search the room? yes or no ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom30();
					r.readRoom30();
					r.closeRoom30();
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

							System.out.println(w.getAI02());
							System.out.println("You have to battle the monster and defeat him to get the items");
							System.out.println("Would you like to fight or flee the monster?");
							userInput = input.nextLine();

							if (userInput.equalsIgnoreCase("flee")) {
								System.out.println("Be careful a monster could pop out of a corner");
								leaving = true;
							}
							if (userInput.contains("fight")) {
								b.monsterAppearsAM02();
								while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

									System.out.println(
											"Choose:\n1. To Attack \n2. To Equip weapon & attack \n3. To Flee");
									String choice = input.next();
									leaving = true;
									if (choice.equals("1")) {
										b.weaponAttackAM02();

									} else if (choice.equals("2")) {
										b.weaponAttackAM02();
									} else {
										b.runAM02();
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
			
			// room31
			if (room == 31 && leaving == true) {
				System.out.println("You are in room 31");
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 32;
				}
			}
			if (room == 31 && leaving == false) {
				// userInput = input.nextLine();
				System.out.println("You are now in room 32");
				System.out.println("Would you like to search the room? yes or no ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom31();
					r.readRoom31();
					r.closeRoom31();
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("Be careful a monster could pop out of a corner");
						leaving = true;
					}

				} else if (userInput.equalsIgnoreCase("no")) {
					System.out.println("Be careful a monster could pop out of a corner");
					leaving = true;
					// userInput = input.nextLine();

				}
			}
			// room32
			if (room == 32 && leaving == false && b.inv.size()<1) {
			System.out.println("Sorry you need the breeze key.");
			userInput = input.nextLine();
			}

			if (room == 32 && leaving == true && b.inv.size()>0) {
				System.out.println("You are in room 32");
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 33;
				}
			}
			if (room == 32 && leaving == false && b.inv.size()>0) {


				// userInput = input.nextLine();
				System.out.println("You are now in room 32");
				System.out.println("Would you like to search the room? yes or no ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom32();
					r.readRoom32();
					r.closeRoom32();
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

							System.out.println(w.getAI03());
							System.out.println("You have to battle the monster and defeat him to get the items");
							System.out.println("Would you like to fight or flee the monster?");
							userInput = input.nextLine();

							if (userInput.equalsIgnoreCase("flee")) {
								System.out.println("Be careful a monster could pop out of a corner");
								leaving = true;
							}
							if (userInput.contains("fight")) {
								b.monsterAppearsAM03();
								while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

									System.out.println(
											"Choose:\n1. To Attack \n2. To Equip weapon & attack \n3. To Flee");
									String choice = input.next();
									leaving = true;
									if (choice.equals("1")) {
										b.weaponAttackAM03();

									} else if (choice.equals("2")) {
										b.weaponAttackAM03();
									} else {
										b.runAM03();
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
			// room33
			if (room == 33 && leaving == true) {
				System.out.println("You are in room 33");
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 34;
				}
			}
			if (room == 33 && leaving == false) {
				// userInput = input.nextLine();
				System.out.println("You are now in room 33");
				System.out.println("Would you like to search the room? yes or no ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom33();
					r.readRoom33();
					r.closeRoom33();
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

							System.out.println(w.getAI04());
							System.out.println("You have to battle the monster and defeat him to get the items");
							System.out.println("Would you like to fight or flee the monster?");
							userInput = input.nextLine();

							if (userInput.equalsIgnoreCase("flee")) {
								System.out.println("Be careful a monster could pop out of a corner");
								leaving = true;
							}
							if (userInput.contains("fight")) {
								b.monsterAppearsAM04();
								while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

									System.out.println(
											"Choose:\n1. To Attack \n2. To Equip weapon & attack \n3. To Flee");
									String choice = input.next();
									leaving = true;
									if (choice.equals("1")) {
										b.weaponAttackAM04();

									} else if (choice.equals("2")) {
										b.weaponAttackAM04();
									} else {
										b.runAM04();
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
			

			// room34
			if (room == 34 && leaving == true) {
				System.out.println("You are in room 34");
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 35;
				}
			}
			if (room == 34 && leaving == false) {
				// userInput = input.nextLine();
				System.out.println("You are now in room 2");
				System.out.println("Would you like to search the room? yes or no ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom34();
					r.readRoom34();
					r.closeRoom34();
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
							System.out.println(w.getAI04());
							System.out.println("Would you like to add to inventory");
							userInput = input.nextLine();
							if (userInput.contains("yes")) {
								b.inv.add(w.getAI04());
								for(int i = 0; i<b.inv.size(); i++){
									System.out.println(b.inv.get(i)+"\n");
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
			// room35
			if (room == 35 && leaving == true) {
				System.out.println("You are in room 35");
				userInput = input.nextLine();
				if (userInput.contains("north")) {
					leaving = false;
					room = 36;
				}
			}
			if (room == 35 && leaving == false) {
				// userInput = input.nextLine();
				System.out.println("You are now in room 35");
				System.out.println("Would you like to search the room? yes or no ");
				userInput = input.nextLine();
				if (userInput.contains("yes")) {
					r.openRoom35();
					r.readRoom35();
					r.closeRoom35();
					System.out.println("");
					System.out.println("Would you like to examine the monster? yes or no");
					userInput = input.nextLine();
					if (userInput.equalsIgnoreCase("no")) {
						System.out.println("Be careful a monster could pop out of a corner");
						leaving = true;
					}
					if (userInput.contains("yes")) {

						System.out.println(" This is the final boss would you like to continue? yes or no");
						userInput = input.nextLine();
						if (userInput.equalsIgnoreCase("no")) {
							System.out.println("Be careful a monster could pop out of a corner");
							leaving = true;
						}
						if (userInput.contains("yes")) {

							System.out.println("You have to battle the monster and defeat him in order to finish the game.");
							System.out.println("Would you like to fight or flee the monster?");
							userInput = input.nextLine();

							if (userInput.equalsIgnoreCase("flee")) {
								System.out.println("Be careful a monster could pop out of a corner");
								leaving = true;
							}
							if (userInput.contains("fight")) {
								b.monsterAppearsAM05();
								while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

									System.out.println(
											"Choose:\n1. To Attack \n2. To Equip weapon & attack \n3. To Flee");
									String choice = input.next();
									leaving = true;
									if (choice.equals("1")) {
										b.weaponAttackAM05();

									} else if (choice.equals("2")) {
										b.weaponAttackAM05();
									} else {
										b.runAM05();
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
			
			System.out.println("You have completed the game.");

		}
	}
}

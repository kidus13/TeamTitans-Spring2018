import java.io.IOException;
import java.util.Scanner;

public class Room {
	Puzzle puz = new Puzzle();
	PlayerController p = new PlayerController();
	RoomWriter r = new RoomWriter();
	MonsterWriter mr = new MonsterWriter();
	Character c = new Character("", 0, 0);
	Monster m = new Monster("", 0, 0);
	Weapon w = new Weapon("", 0, 0, 0, 0, 0, false, false, false, false);
	Battle b = new Battle();

	boolean inRoom = true;
	boolean valid;

	public void Room1() {

		while (inRoom == true) {

			r.openRoom1();
			r.readRoom1();
			r.closeRoom1();

			Scanner input = new Scanner(System.in);
			System.out.println("=================");
			System.out.println("Ready to leave?");
			System.out.println("=================");
			String userInput = input.nextLine();
			if (userInput.equalsIgnoreCase("yes")) {
				p.navigation();
				break;
			}

		}
	}

	public void Room2() {
		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 2. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();

		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom2();
				r.readRoom2();
				r.closeRoom2();
				userInput = input.nextLine();
			}

			if (userInput.equalsIgnoreCase("e")) {
				/*
				 * mr.openMonster1(); mr.readMonster1(); mr.closeMonster1();
				 */
				b.monsterAppearsEM01();

				userInput = input.nextLine();

			}
			if (userInput.equalsIgnoreCase("f")) {
				b.runEM01();
				p.navigation();
				break;
			}
			if (userInput.equalsIgnoreCase("b")) {
				b.attackEM01();
				p.navigation();
				break;

			}

		}
	}

	public void Room3() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 3. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom3();
				r.readRoom3();
				r.closeRoom3();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("e")) {
				mr.openMonster1();
				mr.readMonster1();
				mr.closeMonster1();
				userInput = input.nextLine();

			}
			if (userInput.equalsIgnoreCase("f")) {
				b.runEM01();
				p.navigation();
				break;
			}
			if (userInput.equalsIgnoreCase("b")) {
				b.weaponAttackEM01();
				p.navigation();
				break;
			}
		}
	}

	public void Room4() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 4. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom4();
				r.readRoom4();
				r.closeRoom4();
				userInput = input.nextLine();
			}

			if (userInput.equalsIgnoreCase("e")) {
				puz.puzzleSol();
				userInput = input.nextLine();
				p.navigation();
				break;
			}
		}
	}

	public void Room5() {

		Scanner input = new Scanner(System.in);

		System.out.println("=========================================");
		System.out.println("You are at room 5. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		if(b.getInv().contains(w.getEI03())){
		
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom5();
				r.readRoom5();
				r.closeRoom5();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("e")) {
				mr.openMonster2();
				mr.readMonster2();
				mr.closeMonster2();
				userInput = input.nextLine();

			}
			if (userInput.equalsIgnoreCase("f")) {
				b.runEM02();
				p.navigation();
				break;
			}
			if (userInput.equalsIgnoreCase("b")) {
				b.weaponAttackEM02();
				p.navigation();
				break;
			}
		}
		}else{
			System.out.println("Sorry buddy you need a key");
			userInput = input.nextLine();
		}
	}

	public void Room6() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 6. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom6();
				r.readRoom6();
				r.closeRoom6();
				userInput = input.nextLine();
			}

			if (userInput.equalsIgnoreCase("t")) {
				b.inv.add(w.getEI07());
				System.out.println("=========================================");
				for (int i = 0; i < b.inv.size(); i++) {
					System.out.println(b.inv.get(i) + "\n");
				}
				System.out.println("=========================================");
				p.navigation();
				break;
			}
		}
	}

	public void Room7() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 7. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom7();
				r.readRoom7();
				r.closeRoom7();
				userInput = input.nextLine();
			}

			if (userInput.equalsIgnoreCase("m")) {
				p.navigation();
				break;
			}
		}
	}

	public void Room8() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 8. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom8();
				r.readRoom8();
				r.closeRoom8();
				userInput = input.nextLine();
			}

			if (userInput.equalsIgnoreCase("e")) {
				mr.openMonster3();
				mr.readMonster3();
				mr.closeMonster3();
				userInput = input.nextLine();

			}
			if (userInput.equalsIgnoreCase("f")) {
				b.runEM03();
				p.navigation();
				break;
			}
			if (userInput.equalsIgnoreCase("b")) {
				b.weaponAttackEM03();
				p.navigation();
				break;
			}
		}
	}
	///

	public void Room9() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 9. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom9();
				r.readRoom9();
				r.closeRoom9();
				userInput = input.nextLine();
			}

			if (userInput.equalsIgnoreCase("m")) {
				p.navigation();
				break;
			}
		}
	}

	public void Room10() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 10. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom10();
				r.readRoom10();
				r.closeRoom10();
				userInput = input.nextLine();
			}

			if (userInput.equalsIgnoreCase("e")) {
				puz.puzzleSol2();
				userInput = input.nextLine();
				p.navigation();
				break;
			}
		}
	}

	public void Room11() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 11. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom11();
				r.readRoom11();
				r.closeRoom11();
				userInput = input.nextLine();
			}

			if (userInput.equalsIgnoreCase("e")) {
				mr.openMonster4();
				mr.readMonster4();
				mr.closeMonster4();
				userInput = input.nextLine();

			}
			if (userInput.equalsIgnoreCase("f")) {
				b.runEM03();
				p.navigation();
				break;
			}
			if (userInput.equalsIgnoreCase("b")) {
				b.weaponAttackEM03();
				p.navigation();
				break;
			}
		}
	}

	public void Room12() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 12. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom12();
				r.readRoom12();
				r.closeRoom12();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("c")) {
				if (b.inv.size() > 10) {
					System.out.println("=========================================");
					System.out.println("You are to heavey. You must drop an item ");
					System.out.println("=========================================");

					for (int i = 0; i < b.inv.size(); i++) {
						System.out.println("Enter " + i + " to drop " + b.inv.get(i) + "\n");
					}
					userInput = input.nextLine();
					int weapon = Integer.parseInt(userInput);
					b.inv.remove(userInput);
					System.out.println("You have made it out safe!");
					p.navigation();
					break;
				} else {
					p.navigation();
					break;
				}
			}
		}
	}

	public void Room13() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 13. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom13();
				r.readRoom13();
				r.closeRoom13();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("e")) {
				mr.openMonster5();
				mr.readMonster5();
				mr.closeMonster5();
				userInput = input.nextLine();

			}
			if (userInput.equalsIgnoreCase("f")) {
				b.runWM04();
				p.navigation();
				break;
			}
			if (userInput.equalsIgnoreCase("b")) {
				b.weaponAttackWM04();
				p.navigation();
				break;
			}
		}
	}

	public void Room14() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 14. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom14();
				r.readRoom14();
				r.closeRoom14();
				userInput = input.nextLine();
			}

			if (userInput.equalsIgnoreCase("e")) {
				puz.puzzleSol3();
				p.navigation();
				break;
			}
		}
	}

	public void Room15() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 15. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom15();
				r.readRoom15();
				r.closeRoom15();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("e")) {
				mr.openMonster6(); // correct monsterwriter files
				mr.readMonster6();
				mr.closeMonster6();
				userInput = input.nextLine();

			}
			if (userInput.equalsIgnoreCase("f")) {
				b.runWM02();
				p.navigation();
				break;
			}
			if (userInput.equalsIgnoreCase("b")) {
				b.weaponAttackWM02();
				p.navigation();
				break;
			}
		}
	}

	public void Room16() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 16. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom16();
				r.readRoom16();
				r.closeRoom16();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("e")) {
				mr.openMonster7();
				mr.readMonster7();
				mr.closeMonster7();
				userInput = input.nextLine();
			}

			if (userInput.equalsIgnoreCase("t")) {
				System.out.println("=========================================");
				System.out.println("Monster: Choose an item to trade and " + "I shall return one twice as powerful!");
				System.out.println("=========================================");
				for (int i = 0; i < b.inv.size(); i++) {
					System.out.println("Enter " + i + " to trade " + b.inv.get(i) + "\n");
				}
				userInput = input.nextLine();
				int weapon = Integer.parseInt(userInput);
				b.inv.remove(userInput);
				System.out.println("=========================================");
				System.out.println("Monster: HA! You fool. You have too much trust!");
				System.out.println("=========================================");
				System.out.println("You were robbed...I told you so.");
				System.out.println("Press 'B' to enter in battle!");
				System.out.println("Press 'F' to enter in flee!");
				System.out.println("=========================================");
				userInput = input.nextLine();
			}

			if (userInput.equalsIgnoreCase("f")) {
				b.runWM03();
				p.navigation();
				break;
			}
			if (userInput.equalsIgnoreCase("b")) {
				b.weaponAttackWM03();
				p.navigation();
				break;
			}
		}
	}

	public void Room17() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are in room 17. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom17();
				r.readRoom17();
				r.closeRoom17();
				userInput = input.nextLine();
			}

			if (userInput.equalsIgnoreCase("e")) {
				puz.puzzleSol7();
				System.out.println("=========================================");
				System.out.println("Press 'w' to put out the flames and exit");
				System.out.println("=========================================");
				userInput = input.nextLine();
				if (userInput.equalsIgnoreCase("w")) {
					b.inv.remove(w.getEI04());
				}
				p.navigation();
				break;
			}
		}
	}

	public void Room18() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are in room 18. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom18();
				r.readRoom18();
				r.closeRoom18();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("e")) {
				mr.openMonster8();
				mr.readMonster8();
				mr.closeMonster8();
				userInput = input.nextLine();

			}
			if (userInput.equalsIgnoreCase("f")) {
				b.runFM01();
				p.navigation();
				break;
			}
			if (userInput.equalsIgnoreCase("b")) {
				b.weaponAttackFM01();
				p.navigation();
				break;
			}
		}
	}

	public void Room19() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are in room 19. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom19();
				r.readRoom19();
				r.closeRoom19();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("m")) {
				p.navigation();
				break;
			}
		}
	}

	public void Room20() {
		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 20. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom20();
				r.readRoom20();
				r.closeRoom20();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("m")) {
				p.navigation();
				break;
			}
		}
	}

	public void Room21() {

		while (inRoom == true) {
			Scanner input = new Scanner(System.in);
			System.out.println("=========================================");
			System.out.println("You are at room 21. Type 's' to search ");
			System.out.println("Press 'ex' to exit at anytime ");
			System.out.println("=========================================");
			String userInput = input.nextLine();
			while (inRoom == true) {

				if (userInput.equalsIgnoreCase("ex")) {
					p.navigation();
					break;
				}

				if (userInput.equalsIgnoreCase("s")) {
					r.openRoom21();
					r.readRoom21();
					r.closeRoom21();
					userInput = input.nextLine();
				}
				if (userInput.equalsIgnoreCase("m")) {
					p.navigation();
					break;
				}
			}
		}
	}

	public void Room22() {

		while (inRoom == true) {
			Scanner input = new Scanner(System.in);
			System.out.println("=========================================");
			System.out.println("You are at room 22. Type 's' to search ");
			System.out.println("Press 'ex' to exit at anytime ");
			System.out.println("=========================================");
			String userInput = input.nextLine();
			while (inRoom == true) {

				if (userInput.equalsIgnoreCase("ex")) {
					p.navigation();
					break;
				}

				if (userInput.equalsIgnoreCase("s")) {
					r.openRoom22();
					r.readRoom22();
					r.closeRoom22();
					userInput = input.nextLine();
				}

				if (userInput.equalsIgnoreCase("e")) {
					mr.openMonster9();
					mr.readMonster9();
					mr.closeMonster9();
					userInput = input.nextLine();

				}

				if (userInput.equalsIgnoreCase("f")) {
					b.runFM02();
					p.navigation();
					break;
				}

				if (userInput.equalsIgnoreCase("b")) {
					b.weaponAttackFM02();
					p.navigation();
					break;
				}

			}
		}
	}

	public void Room23() {
		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 23. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom23();
				r.readRoom23();
				r.closeRoom23();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("m")) {
				p.navigation();
				break;
			}
		}
	}

	public void Room24() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 24. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom24();
				r.readRoom24();
				r.closeRoom24();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("m")) {
				p.navigation();
				break;
			}
		}
	}

	public void Room25() {

		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 25. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom25();
				r.readRoom25();
				r.closeRoom25();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("m")) {
				p.navigation();
				break;
			}
		}
	}

	public void Room26() {

		while (inRoom == true) {
			Scanner input = new Scanner(System.in);
			System.out.println("=========================================");
			System.out.println("You are at room 26. Type 's' to search ");
			System.out.println("Press 'ex' to exit at anytime ");
			System.out.println("=========================================");
			String userInput = input.nextLine();
			while (inRoom == true) {

				if (userInput.equalsIgnoreCase("ex")) {
					p.navigation();
					break;
				}

				if (userInput.equalsIgnoreCase("s")) {
					r.openRoom26();
					r.readRoom26();
					r.closeRoom26();
					userInput = input.nextLine();
				}

				if (userInput.equalsIgnoreCase("e")) {
					mr.openMonster11();
					mr.readMonster11();
					mr.closeMonster11();
					userInput = input.nextLine();

				}

				if (userInput.equalsIgnoreCase("f")) {
					b.runFM04();
					p.navigation();
					break;
				}

				if (userInput.equalsIgnoreCase("b")) {
					b.weaponAttackFM04();
					p.navigation();
					break;
				}

				if (userInput.equalsIgnoreCase("e")) {
					puz.puzzleSol4();
					userInput = input.nextLine();
					p.navigation();
					break;
				}
			}
		}
	}

	public void Room27() {

		while (inRoom == true) {
			Scanner input = new Scanner(System.in);
			System.out.println("=========================================");
			System.out.println("You are at room 26. Type 's' to search ");
			System.out.println("Press 'ex' to exit at anytime ");
			System.out.println("=========================================");
			String userInput = input.nextLine();
			while (inRoom == true) {

				if (userInput.equalsIgnoreCase("ex")) {
					p.navigation();
					break;
				}

				if (userInput.equalsIgnoreCase("s")) {
					r.openRoom27();
					r.readRoom27();
					r.closeRoom27();
					userInput = input.nextLine();
				}

				if (userInput.equalsIgnoreCase("e")) {
					mr.openMonster10();
					mr.readMonster10();
					mr.closeMonster10();
					userInput = input.nextLine();

				}

				if (userInput.equalsIgnoreCase("f")) {
					b.runFM03();
					p.navigation();
					break;
				}

				if (userInput.equalsIgnoreCase("b")) {
					b.weaponAttackFM03();
					p.navigation();
					break;
				}

				if (userInput.equalsIgnoreCase("e")) {
					puz.puzzleSol5();
					userInput = input.nextLine();
					p.navigation();
					break;
				}
			}
		}
	}

	public void Room28() {
		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 28. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom28();
				r.readRoom28();
				r.closeRoom28();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("e")) {
				System.out.println("=========================================");
				System.out.println(w.getAI07());
				System.out.println(w.getAI08());
				System.out.println();
				System.out.println("Would you like to add these items to your inventory?");
				System.out.println("=========================================");
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("yes")) {
				b.inv.add(w.getAI06());
				b.inv.add(w.getAI07());
				b.inv.add(w.getAI08());

				System.out.println("=========================================");
				for (int i = 0; i < b.inv.size(); i++) {
					System.out.println(b.inv.get(i) + "\n");
				}
				System.out.println("=========================================");
				p.navigation();
				break;
			}
		}
	}

	public void Room29() {
		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 29. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom29();
				r.readRoom29();
				r.closeRoom29();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("e")) {
				mr.openMonster12();
				mr.readMonster12();
				mr.closeMonster12();
				userInput = input.nextLine();

			}
			if (userInput.equalsIgnoreCase("f")) {
				b.runAM01();
				p.navigation();
				break;
			}
			if (userInput.equalsIgnoreCase("b")) {
				b.weaponAttackAM01();
				p.navigation();
				break;
			}
		}
	}

	public void Room30() {
		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 30. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom30();
				r.readRoom30();
				r.closeRoom30();
				userInput = input.nextLine();
				if (userInput.equalsIgnoreCase("e")) {
					mr.openMonster13();
					mr.readMonster13();
					mr.closeMonster13();
					userInput = input.nextLine();

				}
				if (userInput.equalsIgnoreCase("f")) {
					b.runAM02();
					p.navigation();
					break;
				}
				if (userInput.equalsIgnoreCase("b")) {
					b.weaponAttackAM02();
					p.navigation();
					break;
				}
			}
		}
	}

	public void Room31() {
		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 31. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom31();
				r.readRoom31();
				r.closeRoom31();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("e")) {
				puz.puzzleSol6();
				userInput = input.nextLine();
				p.navigation();
				break;
			}
		}
	}

	public void Room32() {


			Scanner input = new Scanner(System.in);
			// if(b.inv.contains(w.getAI01().getName().equalsIgnoreCase("Breeze
			// Key")) ){
			if (b.inv.contains(w.getName().equalsIgnoreCase("Breeze Key"))) {

				System.out.println("=========================================");
				System.out.println("You are at room 32. Type 's' to search ");
				System.out.println("Press 'ex' to exit at anytime ");
				System.out.println("=========================================");
				String userInput = input.nextLine();
				while (inRoom == true) {

					if (userInput.equalsIgnoreCase("ex")) {
						p.navigation();
						break;
					}

					if (userInput.equalsIgnoreCase("s")) {
						r.openRoom32();
						r.readRoom32();
						r.closeRoom32();
						userInput = input.nextLine();
						if (userInput.equalsIgnoreCase("e")) {
							mr.openMonster14();
							mr.readMonster14();
							mr.closeMonster14();
							userInput = input.nextLine();

						}
						if (userInput.equalsIgnoreCase("f")) {
							b.runAM03();
							p.navigation();
							break;
						}
						if (userInput.equalsIgnoreCase("b")) {
							b.weaponAttackAM03();
							p.navigation();
							break;
						}
					}
				}
			} 
		}
	

	public void Room33() {
		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 33. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom33();
				r.readRoom33();
				r.closeRoom33();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("sh")) {

				System.out.println("=========================================");
				System.out.println(w.getAI04());
				System.out.println("Would you like to add these items to your inventory?");
				System.out.println("=========================================");
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("yes")) {
				b.inv.add(w.getAI04());
				System.out.println("=========================================");
				for (int i = 0; i < b.inv.size(); i++) {
					System.out.println(b.inv.get(i) + "\n");
				}
				System.out.println("=========================================");
				p.navigation();
				break;
			}
		}
	}

	public void Room34() {
		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 34. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom34();
				r.readRoom34();
				r.closeRoom34();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("e")) {
				mr.openMonster15();
				mr.readMonster15();
				mr.closeMonster15();
				userInput = input.nextLine();

			}
			if (userInput.equalsIgnoreCase("f")) {
				b.runAM04();
				p.navigation();
				break;
			}
			if (userInput.equalsIgnoreCase("b")) {
				b.weaponAttackAM04();
				p.navigation();
				break;
			}
		}
	}

	public void Room35() {
		Scanner input = new Scanner(System.in);
		System.out.println("=========================================");
		System.out.println("You are at room 35. Type 's' to search ");
		System.out.println("Press 'ex' to exit at anytime ");
		System.out.println("=========================================");
		String userInput = input.nextLine();
		while (inRoom == true) {

			if (userInput.equalsIgnoreCase("ex")) {
				p.navigation();
				break;
			}

			if (userInput.equalsIgnoreCase("s")) {
				r.openRoom35();
				r.readRoom35();
				r.closeRoom35();
				userInput = input.nextLine();
			}
			if (userInput.equalsIgnoreCase("e")) {
				mr.openMonster16();
				mr.readMonster16();
				mr.closeMonster16();
				userInput = input.nextLine();

			}
			if (userInput.equalsIgnoreCase("f")) {
				b.runAM05();
				p.navigation();
				break;
			}
			if (userInput.equalsIgnoreCase("b")) {
				b.weaponAttackAM05();
				break;

			}
		}
	}
}

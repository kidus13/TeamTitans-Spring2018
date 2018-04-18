import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Battle {
	Weapon w = new Weapon("", 0, 0, 0, 0, 0, false, false, false, false);
	Character c = new Character("", 0, 0);
	Monster m = new Monster(" ", 0, 0);
	List<Weapon> inv = new ArrayList<Weapon>();
	Scanner inputItem = new Scanner(System.in);

	private int monsterHP;
	private int playerHP = 1000;

	public void monsterAppearsEM01() {
		Monster monster = m.getEM01();
		System.out.println("A " + monster.getName() + " has appeared with " + monster.getMonsterHP() + " health.");
	}

	
	//For Earth Room 1 only
	public void attackEM01() {
		int damageTaken = (int) (Math.random() * m.getMonsterAP());
		int damageDealt = (int) (Math.random() * c.getPlayerAttackPoints() + w.getAI01().getDamage());
		monsterHP -= m.getMonsterHP() - damageDealt;
		playerHP -= damageTaken;
		System.out.println("You strike for " + damageDealt);
		System.out.println("You have been hit for " + damageTaken);
		System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");

		if (playerHP < 0) {
			System.out.println("You died.");
			System.exit(15);
		}
		if (monsterHP < 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			String choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(Weapon.getEI01());
				inv.add(Weapon.getEI02());
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i));
				}
			} else {
				System.out.println("bye");
			}
		}
	}
	
	
	
	
	public void weaponAttackEM01() {
		Monster monster = m.getEM01();
		String choice;
		int wChoice = 0;
		int damageTaken = (int) (Math.random() * (m.getMonsterAP()));
		int damageDealt = (int) (Math.random() * c.getPlayerAttackPoints() + w.getAI01().getDamage());
		playerHP -= damageTaken;

		System.out.println("What weapon do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon);
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			monsterHP -= m.getMonsterHP() - attackWeapon.getDamage();

			System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP < 0) {
			System.out.println("You died.");
			System.exit(15);
		}
		if (monsterHP < 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(Weapon.getEI01());
				inv.add(Weapon.getEI02());
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("bye");
			}
		}
	}
	public void runEM01() {
		System.out.println("Only losers run from battle");
	}

	// Battle with EM02
	public void monsterAppearsEM02() {
		Monster monster = m.getEM02();
		System.out.println("A " + monster.getName() + " has appeared with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackEM02() {
		Monster monster = m.getEM02();
		String choice;
		int wChoice = 0;
		int damageTaken = (int) (Math.random() * (m.getMonsterAP()));
		int damageDealt = (int) (Math.random() * c.getPlayerAttackPoints() + w.getAI01().getDamage());
		playerHP -= damageTaken;

		System.out.println("What weapon do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon);
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			monsterHP -= m.getMonsterHP() - attackWeapon.getDamage();

			System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP < 0) {
			System.out.println("You died.");
			System.exit(15);
		}
		if (monsterHP < 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(Weapon.getEI05());
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("bye");
			}
		}
	}

	public void runEM02() {

		System.out.println("Only losers run from battle");
	}
	
	// Battle with EM03
	public void monsterAppearsEM03() {
		Monster monster = m.getEM03();
		System.out.println("A " + monster.getName() + " has appeared with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackEM03() {
		Monster monster = m.getEM03();
		String choice;
		int wChoice = 0;
		int damageTaken = (int) (Math.random() * (m.getMonsterAP()));
		int damageDealt = (int) (Math.random() * c.getPlayerAttackPoints() + w.getEI06().getDamage());
		playerHP -= damageTaken;

		System.out.println("What weapon do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon);
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			monsterHP -= m.getMonsterHP() - attackWeapon.getDamage();

			System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP < 0) {
			System.out.println("You died.");
			System.exit(15);
		}
		if (monsterHP < 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(Weapon.getEI06());
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("bye");
			}
		}
	}

	public void runEM03() {

		System.out.println("Only losers run from battle");
	}
	
	// Battle with WM01
		public void monsterAppearsWM01() {
			Monster monster = m.getWM01();
			System.out.println("A " + monster.getName() + " has appeared with " + monster.getMonsterHP() + " health.");
		}

		public void weaponAttackWM01() {
			Monster monster = m.getWM01();
			Weapon weaponAvail = w.getWI04();
			String choice;
			int wChoice = 0;
			int damageTaken = (int) (Math.random() * (monster.getMonsterAP()));
			int damageDealt = (int) (Math.random() * c.getPlayerAttackPoints() + weaponAvail.getDamage());
			playerHP -= damageTaken;

			System.out.println("What weapon do you want ");
			for (int i = 0; i < inv.size(); i++) {
				System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
			}
			choice = inputItem.nextLine();
			int weapon = Integer.parseInt(choice);

			Weapon attackWeapon = inv.get(weapon);
			System.out.println("You have chosen " + attackWeapon);
			System.out.println("Enter 'fight' to attack");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("fight")) {

				monsterHP -= m.getMonsterHP() - attackWeapon.getDamage();

				System.out.println("You strike for " + attackWeapon.getDamage());
				System.out.println("You have been hit for " + damageTaken);
				System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
			}
			if (playerHP < 0) {
				System.out.println("You died.");
				System.exit(15);
			}
			if (monsterHP < 0) {
				System.out.println("You killed the monster!");
				System.out.println("Would you like to collect items?");
				choice = inputItem.nextLine();

				if (choice.equalsIgnoreCase("yes")) {
					inv.add(weaponAvail);
					for (int i = 0; i < inv.size(); i++) {
						System.out.println(inv.get(i) + "\n");
					}
				} else {
					System.out.println("bye");
				}
			}
		}

		public void runWM01() {

			System.out.println("Only losers run from battle");
		}
	
		// Battle with WM02
				public void monsterAppearsWM02() {
					Monster monster = m.getWM02();
					System.out.println("A " + monster.getName() + " has appeared with " + monster.getMonsterHP() + " health.");
				}

				public void weaponAttackWM02() {
					Monster monster = m.getWM02();
					Weapon weaponAvail = w.getWI03();
					String choice;
					int wChoice = 0;
					int damageTaken = (int) (Math.random() * (monster.getMonsterAP()));
					int damageDealt = (int) (Math.random() * c.getPlayerAttackPoints() + weaponAvail.getDamage());
					playerHP -= damageTaken;

					System.out.println("What weapon do you want ");
					for (int i = 0; i < inv.size(); i++) {
						System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
					}
					choice = inputItem.nextLine();
					int weapon = Integer.parseInt(choice);

					Weapon attackWeapon = inv.get(weapon);
					System.out.println("You have chosen " + attackWeapon);
					System.out.println("Enter 'fight' to attack");
					choice = inputItem.nextLine();

					if (choice.equalsIgnoreCase("fight")) {

						monsterHP -= m.getMonsterHP() - attackWeapon.getDamage();

						System.out.println("You strike for " + attackWeapon.getDamage());
						System.out.println("You have been hit for " + damageTaken);
						System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
					}
					if (playerHP < 0) {
						System.out.println("You died.");
						System.exit(15);
					}
					if (monsterHP < 0) {
						System.out.println("You killed the monster!");
						System.out.println("Would you like to collect items?");
						choice = inputItem.nextLine();

						if (choice.equalsIgnoreCase("yes")) {
							inv.add(weaponAvail);
							for (int i = 0; i < inv.size(); i++) {
								System.out.println(inv.get(i) + "\n");
							}
						} else {
							System.out.println("bye");
						}
					}
				}

				public void runWM02() {

					System.out.println("Only losers run from battle");
				}
				
				
				// Battle with WM03
				public void monsterAppearsWM03() {
					Monster monster = m.getWM03();
					System.out.println("A " + monster.getName() + " has appeared with " + monster.getMonsterHP() + " health.");
				}

				
				//check for implementation of if condition 
				public void weaponAttackWM03() {
					Monster monster = m.getWM03();
					Weapon weaponAvail = null;
					String choice;
					int wChoice = 0;
					int damageTaken = (int) (Math.random() * (monster.getMonsterAP()));
					int damageDealt = (int) (Math.random() * c.getPlayerAttackPoints() + weaponAvail.getDamage());
					playerHP -= damageTaken;

					System.out.println("What weapon do you want ");
					for (int i = 0; i < inv.size(); i++) {
						System.out.println("Enter " + i + " to equip " + inv.get(i));
						System.out.println("HINT: You need to grab 'Actinolite' to kill the Witch");
					}
					choice = inputItem.nextLine();
					int weapon = Integer.parseInt(choice);

					Weapon attackWeapon = inv.get(weapon);
					System.out.println("You have chosen " + attackWeapon);
					
					System.out.println("Enter 'fight' to attack");
					choice = inputItem.nextLine();
					if (choice.equalsIgnoreCase("fight")) {
					
					// condition if player chooses something other that actonite*
					if (attackWeapon != Weapon.getWI03())
					{
					monsterHP -= monster.getMonsterHP();
					System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
					//System.out.println("Looks like you didn't do any damage. Would you like to choose a different weapon?");
					}
					
					else
						monsterHP -= monster.getMonsterHP() - attackWeapon.getDamage();

						System.out.println("You strike for " + attackWeapon.getDamage());
						System.out.println("You have been hit for " + damageTaken);
						System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
					}
					if (playerHP < 0) {
						System.out.println("You died.");
						System.exit(15);
					}
					if (monsterHP < 0) {
						System.out.println("You killed the monster!");
						System.out.println("Would you like to collect items?");
						choice = inputItem.nextLine();

						if (choice.equalsIgnoreCase("yes")) {
							inv.add(weaponAvail);
							for (int i = 0; i < inv.size(); i++) {
								System.out.println(inv.get(i) + "\n");
							}
						} else {
							System.out.println("bye");
						}
					}
				}

				public void runWM03() {

					System.out.println("Only losers run from battle");
				}			
}

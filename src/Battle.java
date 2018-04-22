import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Battle {
	private int monsterHP;
	// private int playerHP = 100;
	private String playerName;
	private static int playerHP = 100;

	RoomWriter r = new RoomWriter();
	Weapon w = new Weapon("", 0, 0, 0, 0, 0, false, false, false, false);
	Character c = new Character("", 0, 0);
	Monster m = new Monster(" ", 0, 0);
	static List<Weapon> inv = new ArrayList<Weapon>();
	Scanner inputItem = new Scanner(System.in);

	String getPlayerName() {

		return playerName;
	}

	public List<Weapon> getInv() {
		return inv;
	}

	public void setInv() {
	}

	public void setName(String n) {
		if (n != null) {

			n = playerName;

		}
	}

	public int getPlayerHP() {
		return playerHP;
	}

	public void setPlayerHP(int playerHP) {
		this.playerHP = playerHP;
	}

	public void monsterAppearsEM01() {
		Monster monster = m.getEM01();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	/**
	 * For Earth Room 2 only
	 */
	public void attackEM01() {
		Monster monster = m.getEM01();
		playerHP = getPlayerHP();
		// int damageTaken = (int) ((Math.random() * 5) * monster.getMonsterAP());
		// int damageDealt = (int) ((Math.random() * 5) + 5);
		int damageTaken = (monster.getMonsterAP());
		int damageDealt = (int) ((Math.random() * 5) + 5);

		monsterHP -= monster.getMonsterHP() - damageDealt;
		playerHP -= damageTaken;
		setPlayerHP(playerHP);
		System.out.println("You strike for " + damageDealt);
		System.out.println("You have been hit for " + damageTaken);
		System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");

		if (playerHP < 0) {
			System.out.println("You died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");

			String choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(Weapon.getEI01());
				inv.add(Weapon.getEI02());
				inv.add(Weapon.getEI03());
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i));
				}
			} else {
				System.out.println("Moving on...");
			}
		}
	}

	// Room 3
	public void weaponAttackEM01() {
		playerHP = getPlayerHP();
		Monster monster = m.getEM01();
		Weapon weaponAvail = Weapon.getEI01();
		String choice;
		int wChoice = 0;

		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(weaponAvail);
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("Bad Decision.");
			}
		}
	}

	public void runEM01() {
		System.out.println("Only losers run from battle");
	}

	/**
	 * Battle vs EM02
	 */
	public void monsterAppearsEM02() {
		Monster monster = m.getEM02();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackEM02() {
		playerHP = getPlayerHP();
		Monster monster = m.getEM02();
		Weapon weaponAvail = Weapon.getEI05();
		String choice;
		int wChoice = 0;
		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(weaponAvail);
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("Bad Decision.");
			}
		}
	}

	public void runEM02() {

		System.out.println("Only losers run from battle");
	}

	// Battle with EM03
	public void monsterAppearsEM03() {
		Monster monster = m.getEM03();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackEM03() {
		playerHP = getPlayerHP();
		Monster monster = m.getEM03();
		String choice;
		Weapon weaponAvail = Weapon.getEI06();
		int wChoice = 0;
		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(weaponAvail);
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("Bad Decision.");
			}
		}
	}

	public void runEM03() {

		System.out.println("Only losers run from battle");
	}

	// Battle with WM01
	public void monsterAppearsWM01() {
		Monster monster = m.getWM01();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackWM01() {
		playerHP = getPlayerHP();
		Monster monster = m.getWM01();
		Weapon weaponAvail = w.getWI04();
		String choice;
		int wChoice = 0;
		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(weaponAvail);
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("Bad Decision.");
			}
		}
	}

	public void runWM01() {

		System.out.println("Only losers run from battle");
	}

	// Battle with WM02
	public void monsterAppearsWM02() {
		Monster monster = m.getWM02();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackWM02() {
		Monster monster = m.getWM02();
		Weapon weaponAvail = w.getWI03();
		String choice;
		int wChoice = 0;
		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(weaponAvail);
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("Bad Decision.");
			}
		}
	}

	public void runWM02() {

		System.out.println("Only losers run from battle");
	}

	// Battle with WM03
	public void monsterAppearsWM03() {
		Monster monster = m.getWM03();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	// check for implementation of if condition
	public void weaponAttackWM03() {
		Monster monster = m.getWM03();
		Weapon weaponAvail = null;
		String choice;
		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(weaponAvail);
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("Bad Decision.");
			}
		}
	}

	public void runWM03() {

		System.out.println("Only losers run from battle");
	}

	// Battle with WM04
	public void monsterAppearsWM04() {
		Monster monster = m.getWM02();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackWM04() {
		getPlayerHP();
		Monster monster = m.getWM02();
		Weapon weaponAvail = w.getWI01();
		String choice;
		int wChoice = 0;
		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(weaponAvail);
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("Bad Decision.");
			}
		}
	}

	public void runWM04() {

		System.out.println("Only losers run from battle");
	}

	// Battle with FM01
	public void monsterAppearsFM01() {
		Monster monster = m.getFM01();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackFM01() {
		getPlayerHP();
		Monster monster = m.getFM01();
		Weapon weaponAvail = w.getFI01();
		String choice;
		int wChoice = 0;
		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(weaponAvail);
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("Bad Decision.");
			}
		}
	}

	public void runFM01() {

		System.out.println("Only losers run from battle");
	}

	// Battle with FM02
	public void monsterAppearsFM02() {
		Monster monster = m.getFM02();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackFM02() {
		getPlayerHP();
		Monster monster = m.getFM02();
		Weapon weaponAvail = w.getFI02();
		String choice;
		int wChoice = 0;
		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(weaponAvail);
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("Bad Decision.");
			}
		}
	}

	public void runFM02() {

		System.out.println("Only losers run from battle");
	}

	// Battle with FM03
	public void monsterAppearsFM03() {
		Monster monster = m.getFM03();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackFM03() {
		getPlayerHP();
		Monster monster = m.getFM03();
		Weapon weaponAvail = w.getFI03();
		String choice;
		int wChoice = 0;
		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(weaponAvail);
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("Bad Decision.");
			}
		}
	}

	public void runFM03() {

		System.out.println("Only losers run from battle");
	}

	// Battle with FM04
	public void monsterAppearsFM04() {
		Monster monster = m.getFM04();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackFM04() {
		getPlayerHP();
		Monster monster = m.getFM04();
		Weapon weaponAvail = null;
		String choice;
		int wChoice = 0;
		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(weaponAvail);
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("Bad Decision.");
			}
		}
	}

	public void runFM04() {

		System.out.println("Only losers run from battle");
	}

	// Battle with AM01
	public void monsterAppearsAM01() {
		Monster monster = m.getAM01();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackAM01() {
		getPlayerHP();
		Monster monster = m.getAM01();
		Weapon weaponAvail = w.getAI01();
		String choice;
		int wChoice = 0;
		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(weaponAvail);
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("Bad Decision.");
			}
		}
	}

	public void runAM01() {

		System.out.println("Only losers run from battle");
	}

	// Battle with AM02
	public void monsterAppearsAM02() {
		Monster monster = m.getAM02();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackAM02() {
		getPlayerHP();
		Monster monster = m.getAM02();
		Weapon weaponAvail = w.getAI02();
		String choice;
		int wChoice = 0;
		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(weaponAvail);
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("Bad Decision.");
			}
		}
	}

	public void runAM02() {

		System.out.println("Only losers run from battle");
	}

	// Battle with AM03
	public void monsterAppearsAM03() {
		Monster monster = m.getAM01();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackAM03() {
		getPlayerHP();
		Monster monster = m.getAM03();
		Weapon weaponAvail = w.getAI03();
		String choice;
		int wChoice = 0;
		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(weaponAvail);
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("Bad Decision.");
			}
		}
	}

	public void runAM03() {

		System.out.println("Only losers run from battle");
	}

	// Battle with AM04
	public void monsterAppearsAM04() {
		Monster monster = m.getAM04();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackAM04() {
		getPlayerHP();
		Monster monster = m.getAM04();
		Weapon weaponAvail = null;
		String choice;
		int wChoice = 0;
		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}
		if (monsterHP <= 0) {
			System.out.println("You killed the monster!");
			System.out.println("Would you like to collect items?");
			choice = inputItem.nextLine();

			if (choice.equalsIgnoreCase("yes")) {
				inv.add(weaponAvail);
				for (int i = 0; i < inv.size(); i++) {
					System.out.println(inv.get(i) + "\n");
				}
			} else {
				System.out.println("Bad Decision.");
			}
		}
	}

	public void runAM04() {

		System.out.println("Only losers run from battle");
	}

	// Battle with AM05
	public void monsterAppearsAM05() {
		Monster monster = m.getAM05();
		System.out.println("A " + monster.getName() + " is ready to fight with " + monster.getMonsterHP() + " health.");
	}

	public void weaponAttackAM05() {
		getPlayerHP();
		Monster monster = m.getAM05();
		Weapon weaponAvail = null;
		String choice;
		int wChoice = 0;
		// int damageTaken = (int) ((Math.random() * 5) * (monster.getMonsterAP()));
		int damageTaken = (monster.getMonsterAP());
		System.out.println(playerHP);
		System.out.println("What item do you want ");
		for (int i = 0; i < inv.size(); i++) {
			System.out.println("Enter " + i + " to equip " + inv.get(i) + "\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);

		Weapon attackWeapon = inv.get(weapon);
		System.out.println("You have chosen " + attackWeapon + "\n Attack points gained = " + attackWeapon.getDamage());
		System.out.println("Enter 'fight' to attack");
		choice = inputItem.nextLine();

		if (choice.equalsIgnoreCase("fight")) {

			int damageDealt = (int) ((Math.random() + 1) * (attackWeapon.getDamage()));
			monsterHP -= monster.getMonsterHP() - (attackWeapon.getDamage() + damageDealt);
			playerHP -= attackWeapon.getAddHealth() - damageTaken;
			setPlayerHP(playerHP);

			// System.out.println("You strike for " + attackWeapon.getDamage());
			System.out.println("You have been hit for " + damageTaken);
			System.out.println("You have " + playerHP + " hp left.\n The monster has " + monsterHP + " hp left.");
		}
		if (playerHP <= 0) {
			System.out.println("You Died.");
			System.exit(15);
		}

		if (monsterHP < 0) {
			// this prints out the "Winner winner" art
			// delete the commented out logic below if you dont need it pls.
			r.openWinner();
			r.readWinner();
			r.closeWinner();
		}
	}

	public void runAM05() {

		System.out.println("Only losers give up!");
		System.out.println("Can't run from final boss");
		System.out.println("So close, yet so far");
		System.exit(15);
	}
}
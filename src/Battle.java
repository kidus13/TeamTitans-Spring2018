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
	private int playerHP = 100;

	public void enemyAppears() {
		Monster monster = m.getEM01();
		System.out.println("A " + monster.getName() + " has appeared with " + monster.getMonsterHP() + " health.");
//		System.out.println("Choose a weapon to use from inventory for battle");
//		for (int i = 0; i < inv.size(); i++) {
//
//			inv.add(Weapon.getEI05());
//		}
//		System.out.println(inv);
	}

	public void attack() {
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
					inv.add(Weapon.getEI03());

					
					for(int i = 0; i<inv.size(); i++){
						System.out.println(inv.get(i)+"\n");
					}
			} else {
				System.out.println("bye");
			}
		}
	}
	
	public void weaponAttack() {
		String choice ;
		int wChoice = 0;
		int damageTaken = (int) (Math.random() * m.getMonsterAP());
		int damageDealt = (int) (Math.random() * c.getPlayerAttackPoints() + w.getAI01().getDamage());
		playerHP -= damageTaken;

		System.out.println("What weapon do you want ");
		for( int i = 0; i<inv.size(); i++){
			System.out.println("Enter " + i + " to equip " +inv.get(i)+"\n");
		}
		choice = inputItem.nextLine();
		int weapon = Integer.parseInt(choice);



			Weapon attackWeapon = inv.get(weapon);
			System.out.println("You have chosen "+attackWeapon);
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
					for(int i = 0; i<inv.size(); i++){
						System.out.println(inv.get(i)+"\n");
					}
				} else {
					System.out.println("bye");
				}
			}
	}
		public void run() {

			System.out.println("bitch");
		}

	}

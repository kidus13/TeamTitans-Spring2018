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
					for(int i = 0; i < inv.size(); i++){
					//if(inv.get(i)==null)
					inv.add(Weapon.getEI05());
					inv.add(Weapon.getEI06());
					}
					System.out.println(inv + "\n");
			} else {
				System.out.println("bye");
			}
		}
	}
	
	public void run() {

		System.out.println("bitch");
	}

}

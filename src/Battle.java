import java.util.Random;
import java.util.Scanner;

public class Battle {
	Weapon w = new Weapon(getName(), 0, 0, 0, false, false, false, false);
	Character c = new Character(getName(), 0, 0);
	Monster m = new Monster(" ", 0, 0);

	int playerAttackPoints = 10;
	
	// Player attacks monster
	public void attack(Monster _monster) {
		int weaponDamage = w.getAI01().getDamage();
		int attackPoints = c.getPlayerAttackPoints();
		int monsterHP = _monster.getHealthPoints();
		int decreaseHealthPoints = monsterHP - (weaponDamage + attackPoints);		
		System.out.println(decreaseHealthPoints);
	}

	public boolean isPlayerDefeated(Character _player) {
		int playerHP = this.c.getPlayerHP();
		if (playerHP <= 0) {
			return true;
		}
		return false;
	}

	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void flee(Monster _monster) {
		int attack = 0;
		int monsterHP = _monster.getHealthPoints();
		_monster.decreaseHealthPoints(attack);
		System.out.println(monsterHP);

	}

	// player battles monster
	public void battleMonster(Monster _monster) {
		Random randomNums = new Random();
		Scanner keyboard = new Scanner(System.in);
		String room;
		Scanner input = new Scanner(System.in);
		room = input.nextLine();
		RoomWriter r = new RoomWriter();

		System.out.printf("***%s vs The Guard Monster ***\n", getName());

		while (_monster.getHealthPoints() > 0) {
			System.out.println("Choose your action:\n1. Attack\n2. Flee\n");
			System.out.print("What would you like to do: ");
			int playerActionChoice = keyboard.nextInt();
			System.out.println();

			switch (playerActionChoice) {
			case 1: // Attack
				this.attack(_monster);
				this.attack(_monster);
				_monster.decreaseHealthPoints(_monster.getHealthPoints());
				System.out.printf("The %s's The Monster's HP is now 0!\n\n", getName());
				break;
			case 2: // Flee
				this.flee(_monster);
				System.out.println("Wuss... You're fleeing the monster");
				System.out.println("Where would you like to flee to");
				System.out.println("1. Room 1 \n 2. Room 2 \n 3. Room 3");

				if (room.equals("1")) {
					r.openRoom1();
					r.readRoom1();
					r.closeRoom1();
					room = input.nextLine();

					if (room.equals("2")) {
						System.out.println("You are now leaving room 1");
						System.out.println();
					}
					if (!room.equals("2") && !room.equals("1")) {
						System.out.println("Sorry. You cannot skip from room 1 to " + room);
						System.out.println("Try another room");
						room = input.nextLine();
					}

				}
				System.out.printf("\nInvalid input.  is not an available option.\n\n", playerActionChoice);
				System.exit(0);
			}

			if (_monster.getHealthPoints() <= 0) {
				break;
			}
			// Player.attack(this);
			// end while

			if (this.isPlayerDefeated(c)) {
				System.out.printf("--%s You Lost!! ", getName());
				System.exit(0);

			}
			break;
		}
	}

}

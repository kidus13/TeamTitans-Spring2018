import java.util.Random;
import java.util.Scanner;

public class Test {

	private String name;
	private int hitPoints;
	private int healthPoint;
	private Weapon weapon;
	
	public Test(String name, int hitPoints, int healthPoint, Weapon weapon) {
		super();
		this.name = name;
		this.hitPoints = hitPoints;
		this.healthPoint = healthPoint;
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public int getHealthPoint() {
		return healthPoint;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	// player attacks monster
	public void attack(Monster _monster) {
		int weaponDamage = weapon.getDamage();
		int attack = weaponDamage;
		int monsterHP = _monster.getHealthPoints();
		_monster.decreaseHealthPoints(attack);
		System.out.printf("%s attacks with ATK = %d + %d = %d\n", name, weaponDamage, attack, monsterHP);

	}
	
	public void flee(Monster _monster) {
		int weaponDamage = weapon.getDamage();
		int attack = weaponDamage;
		int monsterHP = _monster.getHealthPoints();
		_monster.decreaseHealthPoints(attack);
		System.out.printf("%s attacks with ATK = %d + %d = %d\n", name, weaponDamage, attack, monsterHP);

	}

	public void battleEM01(Monster EM01) {
		Random randomNums = new Random();
		Scanner keyboard = new Scanner(System.in);
		String room; 
		Scanner input = new Scanner(System.in);
		room= input.nextLine();
		RoomWriter r = new RoomWriter();
		
		System.out.printf("***%s vs The Guard Monster ***\n", name);

		while (hitPoints > 0 && EM01.getHealthPoints() > 0) {
			System.out.println("Choose your action:\n1. Attack\n2. Flee\n");
			System.out.print("What would you like to do: ");
			int playerActionChoice = keyboard.nextInt();
			System.out.println();

			switch (playerActionChoice) {
			case 1: // Attack
				this.attack(EM01);
				this.attack(EM01);
				EM01.decreaseHealthPoints(EM01.getHealthPoints());
				System.out.printf("The %s's The MOnster's HP is now 0!\n\n", name);
				break;
			case 2: // Flee
					this.flee(EM01);
					System.out.println("Wuss... You're fleeing the monster");
					System.out.println("Where would you like to flee to");
					System.out.println("1. Room 1 \n 2. Room 2 \n 3. Room 3");
					
					if(room.equals("1")){
						r.openRoom1();
						r.readRoom1();
						r.closeRoom1();
						room= input.nextLine();	
				
						
						if(room.equals("2")){
							System.out.println("You are now leaving room 1");
							System.out.println();
						}
							if(!room.equals("2")&&!room.equals("1")){
								System.out.println("Sorry. You cannot skip from room 1 to " + room);
								System.out.println("Try another room");
								room= input.nextLine();
							}
						
					}
					

				}
				break;
			//default: // fail-safe
				System.out.printf("\nInvalid input. %d is not an available option.\n\n", playerActionChoice);
				System.exit(0);
			}

			if (EM01.getHealthPoints() <= 0) {
				break;
			}
			Player.attack(this);
		} // end while

		if (this.isDefeated()) {
			System.out.printf("--%s is defeated in battle!--\n\nGAME OVER\n", name);
			System.exit(0);
		}
	}
}

	public static void main(String[] args) {

		RoomWriter r = new RoomWriter();
		Weapon w = new Weapon(null, 0, 0, 0, false, false, false, false);
		w.getEI02();
		Monster m = new Monster(null, 0, 0);
		m.getEM01();

		System.out.println(attack(null));

	}
}
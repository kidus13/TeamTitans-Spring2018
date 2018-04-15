import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		RoomWriter r = new RoomWriter();
		Character p = new Character("", 0, 0);
		Monster m = new Monster("", 0, 0);
		Weapon w = new Weapon("", 0, 0, 0, 0, 0, false, false, false, false);
		Battle b = new Battle();
		WeaponsWriter wr = new WeaponsWriter();
		

		Scanner keyboard = new Scanner(System.in);
		while (m.getWM04().getHealthPoints() > 0) {
			System.out.println("Choose your action:\n1. Attack\n2. Flee\n");
			System.out.print("What would you like to do: ");
			int playerActionChoice = keyboard.nextInt();
			//System.out.println();

			switch (playerActionChoice) {
			case 1: // Attack
				b.attack(m.getWM04());
				b.attack(m.getWM04());
				m.getWM04().decreaseHealthPoints(10000);
				System.out.println(m.getWM04().isDefeated());
				break;
//			case 2: // Flee
//				b.flee(m.getWM04());
//				System.out.println("Wuss... You're fleeing the monster");
//				System.out.println("Where would you like to flee to");
//				System.out.println("1. Room 1 \n 2. Room 2 \n 3. Room 3");
//				int roomKeyboard = keyboard.nextInt();
//				
//				switch(roomKeyboard) {
//				case 1: r =  {
//					r.openRoom1();
//					r.readRoom1();
//					r.closeRoom1();
//					
//				}
//					if (r.equals(2)) {
//						System.out.println("You are now leaving room 1");
//						System.out.println();
//					}
//					if (!r.equals(2) && !r.equals(1)) {
//						System.out.println("Sorry. You cannot skip from room 1 to " + r);
//						System.out.println("Try another room");
//											}
				}
				
				System.out.printf("\nInvalid input.  is not an available option.\n\n", playerActionChoice);
				System.exit(0);
		}

			if (m.getWM04().getHealthPoints() <= 0) {
				System.out.println("Monster is dead");
			
			}
	}
}
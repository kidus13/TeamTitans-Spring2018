import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		RoomWriter r = new RoomWriter();
		Character c = new Character("", 0, 0);
		Monster m = new Monster("", 0, 0);
		Weapon w = new Weapon("", 0, 0, 0, 0, 0, false, false, false, false);
		Battle b = new Battle();
		WeaponsWriter wr = new WeaponsWriter();

		Scanner input = new Scanner(System.in);
		
		b.monsterAppearsEM01();
		while (c.getPlayerHP() > 0 || (m.getMonsterHP() > 0)) {

			System.out.println("Choose:\n1. To Attack \n2. To Flee");
			String choice = input.next();
			if (choice.equals("1")) {
				b.attackEM01();
			} else {
				b.runEM01();
			}
			break;
		}
	}
}

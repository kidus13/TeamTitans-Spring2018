import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		RoomWriter r = new RoomWriter();
		Character p = new Character("", 0, 0);
		Monster m = new Monster("", 0, 0);
		Weapon w = new Weapon("", 0, 0, 0, 0, 0, false, false, false, false);
		Battle b = new Battle();
		WeaponsWriter wr = new WeaponsWriter();
		
		    Scanner input = new Scanner(System.in);
		    System.out.println("Welcome to the dungeon");
		    boolean running = true;
		     while(running){

		        b.enemyAppears();

		        System.out.println("Choose:\n1. To Attack \n2. To Heal \n3. To Run");
		        String choice = input.next();
		        if(choice.equals("1")) {
		            b.attack();
	
		        } else if (choice.equals("2")){
		            b.heal();
		        } else {
		            b.run();
		            break;
		        }
		    }
		}
}
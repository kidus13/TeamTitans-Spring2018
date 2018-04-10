import java.util.Scanner;

public class Player extends Character {
	public static void main(String[] args) {

		RoomWriter r = new RoomWriter();
		String room;
		Scanner input = new Scanner(System.in);
		boolean inRoom = false;

		System.out.println("Hello user please enter in the room you would like to enter" );
	
		room= input.nextLine();
		
while (true){
	//room1
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
		//room2
		if(room.equals("2")){
			r.openRoom2();
			r.readRoom2();
			r.closeRoom2();
			room= input.nextLine();

			if(room.equals("3")){
				System.out.println("You are now leaving room 2");
				System.out.println();
				
			}
			if(!room.equals("3")&&!room.equals("1")){
				System.out.println("Sorry. You cannot skip from room 2 to " + room);
				System.out.println("Try another room");
				room= input.nextLine();
			}
	}
		//room3
		if(room.equals("3")){
			r.openRoom3();
			r.readRoom3();
			r.closeRoom3();
			room= input.nextLine();
		
			if(room.equals("4")){
				System.out.println("You are now leaving room 3");
				System.out.println();
				
			}
			if(!room.equals("4")&&!room.equals("2")){
				System.out.println("Sorry. You cannot skip from room 3 to " + room);
				System.out.println("Try another room");
				room= input.nextLine();
			
				}
			}
		}
	}
}

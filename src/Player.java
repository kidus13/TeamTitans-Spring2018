import java.util.Scanner;

public class Test extends Character {
	public static void main(String[] args) {

		RoomWriter r = new RoomWriter();
		Scanner input = new Scanner(System.in);
		boolean inRoom = false;

		System.out.println("Hello user please enter in the room you would like to enter" );
	String userInput= input.nextLine();
	int room =0;
	

		while (true){
			
			if(userInput.contains("north")){
				room++;
			}
			if(userInput.contains("south")){
				room--;
			}
			
			//room1
			if(room==1){
				r.openRoom1();
				r.readRoom1();
				r.closeRoom1();
				userInput= input.nextLine();	

			}
			//room2
			if(room==2){
				r.openRoom2();
				r.readRoom2();
				r.closeRoom2();
				userInput= input.nextLine();	

			}
			//room3
			if(room==3){
				r.openRoom3();
				r.readRoom3();
				r.closeRoom3();
				userInput= input.nextLine();	

			}
			//room4
			if(room==4){
				r.openRoom4();
				r.readRoom4();
				r.closeRoom4();
				userInput= input.nextLine();
				if(userInput.contains("north")){
					System.out.println("Do you want to access room 5 or 7?");
					userInput= input.nextLine();
					if(userInput.contains("5")){
						room=5;
					}
					if(userInput.contains("7")){
						room=7;
					}	
				}		
			}
				
			//room5
			if(room==5){
				r.openRoom5();
				r.readRoom5();
				r.closeRoom5();
				userInput= input.nextLine();

			}
			//room6
			if(room==6){
				r.openRoom6();
				r.readRoom6();
				r.closeRoom6();
				userInput= input.nextLine();
				if(userInput.contains("north")){
					room=6;
					System.out.println("Room 7 cannot be accessed in this room");
					System.out.println();
					userInput= input.nextLine();

				}
			}
			//room7
			if(room==7){
				r.openRoom7();
				r.readRoom7();
				r.closeRoom7();
				userInput = input.nextLine();
				if(userInput.contains("south")){
					room=5;
				}
			}
			//room8
			if(room==8){
				r.openRoom8();
				r.readRoom8();
				r.closeRoom8();
				userInput= input.nextLine();
			}
			
			//hallway1
			if(userInput.contains("hallway1")){
				{
					System.out.println("entering hallway1");
				}
			}
			
			//hallway2
			if(userInput.contains("hallway2")){
				{
					System.out.println("entering hallway2");
				}
			}
			
			//room9
			if(room==9){
				r.openRoom9();
				r.readRoom9();
				r.closeRoom9();
				userInput= input.nextLine();
			}
			
			//room10
			if(room==10){
				r.openRoom10();
				r.readRoom10();
				r.closeRoom10();
				userInput= input.nextLine();
				if(userInput.contains("north")){
					System.out.println("Do you want to access room 11 or 13?");
					userInput= input.nextLine();
					if(userInput.contains("11")){
						room=11;
					}
					if(userInput.contains("13")){
						room=13;
					}	
				}	
			}
			
			//room11
			if(room==11){
				r.openRoom11();
				r.readRoom11();
				r.closeRoom11();
				userInput= input.nextLine();
				if(userInput.contains("north")){
					System.out.println("Do you want to access room 12 or hallway?");
					userInput= input.nextLine();
					if(userInput.contains("12")){
						room=12;
					}
				}
			}
				
			//room12
			if(room==12){
				r.openRoom12();
				r.readRoom12();
				r.closeRoom12();
				userInput= input.nextLine();
				if(userInput.contains("north")){
					System.out.println("Do you want to access room 13, room  14, hallway 1 or hallway2?");
					userInput= input.nextLine();
					if(userInput.contains("13")){
						room=13;
					}
					if(userInput.contains("14")){
						room=14;
					}
				}
			}
			
			//room13
			if(room==13){
				r.openRoom13();
				r.readRoom13();
				r.closeRoom13();
				userInput= input.nextLine();
				if(userInput.contains("north")){
					System.out.println("Do you want to access room 15 or hallway2?");
					userInput= input.nextLine();
					if(userInput.contains("15")){
						room=15;
					}
				}
			}

			//room14
			if(room==14){
				r.openRoom14();
				r.readRoom14();
				r.closeRoom14();
				userInput= input.nextLine();
				if(userInput.contains("north")){
						room=16;
					
				}
			}
			
			//room15
			if(room==15){
				r.openRoom15();
				r.readRoom15();
				r.closeRoom15();
				userInput= input.nextLine();	
			}
			
			//room16
			if(room==16){
				r.openRoom16();
				r.readRoom16();
				r.closeRoom16();
				userInput= input.nextLine();	
			}
		}
	}
}

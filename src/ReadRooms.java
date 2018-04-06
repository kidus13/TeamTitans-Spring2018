
public class ReadRooms {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomWriter r = new RoomWriter();
		r.openRoom1();
		r.readRoom1();
		r.closeRoom1();
		
		System.out.println("#################");
		
		r.openRoom2();
		r.readRoom2();
		r.closeRoom2();
	
	}

}

	// this is a class just to test reading file works
	// basically every time you go in a room you call the 3 methods from the RoomFile class
	
	

/**
 * @author tethe_000
 *
 */
public class Rooms {

	public boolean isDoorOpen() {
		int doorOpen = 0;
		if (doorOpen <= 0) {
			return true;
		}
		System.out.println("The door is locked. You need the key to open it.");
		return false;
	}
	//can we associate these with the items specifically 
	// ifhas(item) ?
	public boolean isDoorLocked() {
		
		int doorLocked = 0;
		if(doorLocked  <= 0) {
			return true;
		}
		//System.out.println("")
		return false;
		}
		
	
	public boolean hasKey(){
		return false;
		
	}

	//ummmmm need to look into this more because i know im missing something so let me look it up - 4.10
}	  
			  


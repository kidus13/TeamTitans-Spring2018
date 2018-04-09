 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Puzzles extends Rooms{
	public final static String TITLE;
	public final static String hint;
	public final static String answer;
	public final static String DESCRIPTION;
	public final static String puzzleId;

	public String Puzzle(String TITLE, String hint, String answer, String DESCRIPTION) {
		File file = new File("puzzlesFile.txt");
		Scanner scan = new Scanner(System.in);
				while (scan.hasNext()){
					TITLE = scan.nextLine();
			    hint = scan.nextLine();
			    answer = scan.nextLine();
			    DESCRIPTION = scan.nextLine();
	}
				
	}
	public Room(String roomID, String roomName, String description, int doorID, int attribute4) {
		super( roomID,  roomName,  description,  doorID,  attribute4);
	}

	public static String getTITLE() {
		return TITLE;
	}

	public static String getHint() {
		return hint;
	}

	public static String getAnswer() {
		return answer;
	}

	public static String getDESCRIPTION() {
		return DESCRIPTION;
	}
	

}

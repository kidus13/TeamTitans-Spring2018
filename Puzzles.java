import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Puzzles extends Rooms{
	public final static String puzzle;
	public final static String hint;
	public final static String answer;
	public final static String wrongAnswer;

	public String Puzzle(String puzzle, String hint, String answer, String wrongAnswer) {
		File file = new File("puzzlesFile.txt");
		Scanner scan = new Scanner(System.in);
				while (scan.hasNext()){
			    puzzle = scan.nextLine();
			    hint = scan.nextLine();
			    answer = scan.nextLine();
			    wrongAnswer = scan.nextLine();
	}
	}

	public static String getPuzzle() {
		return puzzle;
	}

	public static String getHint() {
		return hint;
	}

	public static String getAnswer() {
		return answer;
	}

	public static String getWronganswer() {
		return wrongAnswer;
	}
	

}

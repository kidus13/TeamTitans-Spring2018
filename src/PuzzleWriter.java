import java.io.*;
import java.util.Scanner;

/**
 * @author tethe_000
 *
 */
public class PuzzleWriter {

	// commands
	private Scanner commands;

	public void openCommands() {
		try {
			commands = new Scanner(new File("commands.txt"));
		} catch (Exception e) {
			System.out.println("file 1 not found");
		}
	}

	public void readCommands() {
		while (commands.hasNextLine()) {
			String _commands = commands.nextLine();
			System.out.println(_commands);
		}
	}

	public void closeCommands() {
		commands.close();
	}

	// puzzle1;
	private Scanner puzzle1;

	public void openPuzzle1() {
		try {
			puzzle1 = new Scanner(new File("puzzle1.txt"));
		} catch (Exception e) {
			System.out.println("file 1 not found");
		}
	}

	public void readPuzzle1() {
		while (puzzle1.hasNextLine()) {
			String _Puzzle = puzzle1.nextLine();
			System.out.println(_Puzzle);
		}
	}

	public void closePuzzle1() {
		puzzle1.close();
	}

	// puzzle2;
	private Scanner puzzle2;

	public void openPuzzle2() {
		try {
			puzzle2 = new Scanner(new File("puzzle2.txt"));
		} catch (Exception e) {
			System.out.println("file 2 not found");
		}
	}

	public void readPuzzle2() {
		while (puzzle2.hasNextLine()) {
			String _Puzzle2 = puzzle2.nextLine();
			System.out.println(_Puzzle2);
		}
	}

	public void closePuzzle2() {
		puzzle2.close();
	}

	// puzzle3;
	private Scanner puzzle3;

	public void openPuzzle3() {
		try {
			puzzle3 = new Scanner(new File("puzzle3.txt"));
		} catch (Exception e) {
			System.out.println("file 3 not found");
		}
	}

	public void readPuzzle3() {
		while (puzzle3.hasNextLine()) {
			String _Puzzle3 = puzzle3.nextLine();
			System.out.println(_Puzzle3);
		}
	}

	public void closePuzzle3() {
		puzzle3.close();
	}

	// puzzle4;
	private Scanner puzzle4;

	public void openPuzzle4() {
		try {
			puzzle4 = new Scanner(new File("puzzle4.txt"));
		} catch (Exception e) {
			System.out.println("file 4 not found");
		}
	}

	public void readPuzzle4() {
		while (puzzle4.hasNextLine()) {
			String _Puzzle4 = puzzle4.nextLine();
			System.out.println(_Puzzle4);
		}
	}

	public void closePuzzle4() {
		puzzle4.close();
	}

	// puzzle5;
	private Scanner puzzle5;

	public void openPuzzle5() {
		try {
			puzzle5 = new Scanner(new File("puzzle5.txt"));
		} catch (Exception e) {
			System.out.println("file 5 not found");
		}
	}

	public void readPuzzle5() {
		while (puzzle5.hasNextLine()) {
			String _Puzzle5 = puzzle5.nextLine();
			System.out.println(_Puzzle5);
		}
	}

	public void closePuzzle5() {
		puzzle5.close();
	}

	// puzzle6;
	private Scanner puzzle6;

	public void openPuzzle6() {
		try {
			puzzle6 = new Scanner(new File("puzzle6.txt"));
		} catch (Exception e) {
			System.out.println("file 6 not found");
		}
	}

	public void readPuzzle6() {
		while (puzzle6.hasNextLine()) {
			String _Puzzle6 = puzzle6.nextLine();
			System.out.println(_Puzzle6);
		}
	}

	public void closePuzzle6() {
		puzzle6.close();
	}

	// puzzle7;
	private Scanner puzzle7;

	public void openPuzzle7() {
		try {
			puzzle7 = new Scanner(new File("puzzle7.txt"));
		} catch (Exception e) {
			System.out.println("file 7 not found");
		}
	}

	public void readPuzzle7() {
		while (puzzle7.hasNextLine()) {
			String _Puzzle7 = puzzle7.nextLine();
			System.out.println(_Puzzle7);
		}
	}

	public void closePuzzle7() {
		puzzle7.close();
	}
}
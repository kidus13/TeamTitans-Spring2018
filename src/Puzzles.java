import java.util.Scanner;

public class Puzzles {
	PuzzleWriter p = new PuzzleWriter();
	Battle b = new Battle();
	Scanner input = new Scanner(System.in);
	Weapon w = new Weapon(null, 0, 0, 0, 0, 0, false, false, false, false);
	String hint;

	void puzzleSol() {
		p.openPuzzle1();
		p.readPuzzle1();
		p.closePuzzle1();

		System.out.println("Type 'h' for a hint");
		System.out.println("Enter answer below");
		String answer = input.next();

		if (answer.contains("same")) {

			b.inv.add(w.getEI04());
			for (int i = 0; i < b.inv.size(); i++) {
				System.out.println(b.inv.get(i) + "\n");
			}
		}

		if (answer.contains("h")) {
			System.out.println("Hint: Remeber conversions?");
			 answer = input.next();
		
			if (answer.contains("same")) {

				b.inv.add(w.getEI04());
				for (int i = 0; i < b.inv.size(); i++) {
					System.out.println(b.inv.get(i) + "\n");
				}
			}
		}

	}
}

import java.util.Scanner;

public class Puzzle  {
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

		if (answer.equalsIgnoreCase("same")) {

			b.inv.add(w.getEI04());
			for (int i = 0; i < b.inv.size(); i++) {
				System.out.println(b.inv.get(i) + "\n");
			}
		}

		if (answer.equalsIgnoreCase("h")) {
			System.out.println("Hint: Remember conversions?");
			 answer = input.next();
		
			if (answer.equalsIgnoreCase("same")) {

				b.inv.add(w.getEI04());
				for (int i = 0; i < b.inv.size(); i++) {
					System.out.println(b.inv.get(i) + "\n");
				}
			}
		}
	}
	void puzzleSol2() {
		p.openPuzzle2();
		p.readPuzzle2();
		p.closePuzzle2();

		System.out.println("Type 'h' for a hint");
		System.out.println("Enter answer below");
		String answer = input.next();

		if (answer.equalsIgnoreCase("age")) {

			b.inv.add(w.getWI06());
			b.inv.add(w.getWI07());
			for (int i = 0; i < b.inv.size(); i++) {
				System.out.println(b.inv.get(i) + "\n");
			}
		}

		if (answer.equalsIgnoreCase("h")) {
			System.out.println("Hint: how old are you?");
			 answer = input.next();
		
			if (answer.equalsIgnoreCase("age")) {

				b.inv.add(w.getWI06());
				b.inv.add(w.getWI07());
				for (int i = 0; i < b.inv.size(); i++) {
					System.out.println(b.inv.get(i) + "\n");
				}
			}
		}
	}
	void puzzleSol3() {
		p.openPuzzle3();
		p.readPuzzle3();
		p.closePuzzle3();

		System.out.println("Type 'h' for a hint");
		System.out.println("Enter answer below");
		String answer = input.next();

		if (answer.equalsIgnoreCase("towel")) {

			b.inv.add(w.getWI06());
			b.inv.add(w.getWI02());
			for (int i = 0; i < b.inv.size(); i++) {
				System.out.println(b.inv.get(i) + "\n");
			}
		}

		if (answer.equalsIgnoreCase("h")) {
			System.out.println("Hint: Do you even shower bro?");
			 answer = input.next();
		
			if (answer.equalsIgnoreCase("towel")) {

				b.inv.add(w.getWI06());
				b.inv.add(w.getWI02());
				for (int i = 0; i < b.inv.size(); i++) {
					System.out.println(b.inv.get(i) + "\n");
				}
			}
		}
	}
	void puzzleSol4() {
		p.openPuzzle4();
		p.readPuzzle4();
		p.closePuzzle4();

		System.out.println("Type 'h' for a hint");
		System.out.println("Enter answer below");
		String answer = input.next();

		if (answer.equalsIgnoreCase("table")) {

			b.inv.add(w.getFI04());
			for (int i = 0; i < b.inv.size(); i++) {
				System.out.println(b.inv.get(i) + "\n");
			}
		}

		if (answer.equalsIgnoreCase("h")) {
			System.out.println("Hint: You usually eat, work or even nap here");
			 answer = input.next();
		
			if (answer.equalsIgnoreCase("table")) {

				b.inv.add(w.getFI04());
				for (int i = 0; i < b.inv.size(); i++) {
					System.out.println(b.inv.get(i) + "\n");
				}
			}
		}
	}
	void puzzleSol5() {
		p.openPuzzle5();
		p.readPuzzle5();
		p.closePuzzle5();

		System.out.println("Type 'h' for a hint");
		System.out.println("Enter answer below");
		String answer = input.next();

		if (answer.equalsIgnoreCase("tuesday")) {

			b.inv.add(w.getFI03());
			for (int i = 0; i < b.inv.size(); i++) {
				System.out.println(b.inv.get(i) + "\n");
			}
		}

		if (answer.equalsIgnoreCase("h")) {
			System.out.println("Hint: What day comes three days after the day Saturday?");
			 answer = input.next();
		
			if (answer.equalsIgnoreCase("tuesday")) {

				b.inv.add(w.getFI03());
				for (int i = 0; i < b.inv.size(); i++) {
					System.out.println(b.inv.get(i) + "\n");
				}
			}
		}
	}
	void puzzleSol6() {
		p.openPuzzle6();
		p.readPuzzle6();
		p.closePuzzle6();

		System.out.println("Type 'h' for a hint");
		System.out.println("Enter answer below");
		String answer = input.next();

		if (answer.equalsIgnoreCase("river bank")) {

			b.inv.add(w.getFI03());
			for (int i = 0; i < b.inv.size(); i++) {
				System.out.println(b.inv.get(i) + "\n");
			}
		}

		if (answer.equalsIgnoreCase("h")) {
			System.out.println("Hint: It's the same place they swim");
			 answer = input.next();
		
			if (answer.equalsIgnoreCase("river bank")) {

				b.inv.add(w.getFI03());
				for (int i = 0; i < b.inv.size(); i++) {
					System.out.println(b.inv.get(i) + "\n");
				}
			}
		}
	}
	void puzzleSol7() {
		p.openPuzzle7();
		p.readPuzzle7();
		p.closePuzzle7();

		System.out.println("Type 'h' for a hint");
		System.out.println("Enter answer below");
		String answer = input.next();

		if (answer.equalsIgnoreCase("3")) {

			b.inv.add(w.getEI04());
			for (int i = 0; i < b.inv.size(); i++) {
				System.out.println(b.inv.get(i) + "\n");
			}
			
		}

		if (answer.equalsIgnoreCase("h")) {
			System.out.println("Hint: It's not that hard dude. Learn to count");
			 answer = input.next();
		
			if (answer.equalsIgnoreCase("3")) {

				b.inv.add(w.getEI04());
				for (int i = 0; i < b.inv.size(); i++) {
					System.out.println(b.inv.get(i) + "\n");
				}
			}
		}
	}
}
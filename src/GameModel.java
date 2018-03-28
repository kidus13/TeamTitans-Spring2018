import java.util.*;


public  class GameModel extends java.util.Observable {


	GameController controller;
	Scanner input = new Scanner(System.in);
	String userInput;
	String question = "";
	int count = 0;

	public void nextDialogue(){



		++count;
		switch(count){
		case 1:
			question = "Welcome to Tower of the Heavens. What is your name?";
			setChanged();
			notifyObservers(question); 
			break;

		case 2:

			question = "Hello "; //+ controller.userInput;
			setChanged();
			notifyObservers(question); 
			break;

		case 3:
			question = "Are you ready?";
			setChanged();
			notifyObservers(question); 
			break;
		}

		setChanged();
		notifyObservers(question); 
	}

	public String getText(String text) {

		return text = userInput;

	}


}


import java.awt.event.ActionListener;

class GameController implements java.awt.event.ActionListener {


	GameModel model;
	View view;
	//String userInput =  view.text;

	GameController() {	
	} 

	public void actionPerformed(java.awt.event.ActionEvent e){
		model.nextDialogue();
	}

	public void addModel(GameModel m){
		this.model = m;
	}

	public void addView(View v){
		this.view = v;
	}
	
} 
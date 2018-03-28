//RunMVC.java
//(C) Joseph Mack 2011, jmack (at) wm7d (dot) net, released under GPL v3 (or any later version)

//  non-reusable piece of code RunMVC tells model to send notices to view and to accept commands from controller.
// With the code for the Model not having a reference to the View (at least as an attribute), how does the Model know where view is? A non-reusable glue class (my term) RunMVC instantiates the objects model, view and controller and tells them what they need to know about each other. RunMVC:myModel.addObserver(Observer myView) gives the model a reference to the view.
public class GameRunMVC {

	//The order of instantiating the objects below will be important for some pairs of commands.
	//I haven't explored this in any detail, beyond that the order below works.

	//initialise model, which in turn initialises view

	public GameRunMVC() {

		//create Model and View
		GameModel myModel 	= new GameModel();
		View myView 	= new View();

		//tell Model about View.
		//Although there is no mention of view in the model code (thus making Model reusable), 
		//the model is being passed a reference to the view. This can be done 
		//because Model is an Observable and an Observable knows the declaration of an Observer (like view). 
		myModel.addObserver(myView);
		/*	
			init model after view is instantiated and can show the status of the model
			(I later decided that only the controller should talk to the model
			and moved initialization to the controller (see below).)
		*/
		

		//create Controller. tell it about Model and View, initialize model
		GameController myController = new GameController();
		myController.addModel(myModel);
		myController.addView(myView);		
		//myModel.addController(myController);

		
		
		//tell View about Controller 
		// a method addController(ActionListener controller), which attaches the controller as a listener to the button (called by the glue class RunMVC). 
		myView.addController(myController);
		

	} //RunMVC()

} //RunMVC
import java.awt.Button;
import java.awt.Panel;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.WindowEvent;	
import java.awt.event.WindowAdapter;	
import java.lang.Integer;		
import java.util.Observable;
import java.awt.event.ActionListener;	


class View implements java.util.Observer {

	private TextField myTextField;
	private TextField inputTextField;
	private Button button; 
	  String text;
	
	View() {
		
		Frame frame 		= new Frame("Tower of the Heavens");
		frame.add("North", new Label("counter"));

		myTextField 		= new TextField();
		frame.add("Center", myTextField);
		//inputTextField 		= new TextField();
		//frame.add("Center",inputTextField);

		Panel panel 		= new Panel();
		button	 		= new Button("Continue");
		panel.add(button);
		frame.add("South", panel);		

		frame.addWindowListener(new CloseListener());	
		frame.setSize(400,400);
		frame.setLocation(100,100);
		frame.setVisible(true);
	}
	
		public void setValue(String v){
	    		myTextField.setText(v);
		}
		
    	public void update(Observable obs, Object obj) {
		myTextField.setText(""+obj);	
    	}

  
	public void addController(ActionListener controller){
		button.addActionListener(controller);	
		}
	
	public void inputController(ActionListener controller){
		  myTextField.addActionListener(controller);	
		   text = myTextField.getText();

	}
		
	public static class CloseListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			System.exit(0);
		} 
	}

}
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.util.Observable;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import java.io.*;

public class GUI extends JFrame implements java.util.Observer {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	 




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			 String fileName = "game.txt";
			 
			
			public void run() {
				try {
					
					GUI frame = new GUI();
					
					frame.setVisible(true);
					//JPanel.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("test.jpg")))));

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		
		setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		setTitle("Tower of the Heavens");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, Color.GREEN, Color.MAGENTA, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField1 = new JTextField();
		textField1.setHorizontalAlignment(SwingConstants.LEFT);
		textField1.setForeground(Color.RED);
		textField1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		textField1.setBackground(Color.LIGHT_GRAY);
		textField1.setBounds(407, 13, 452, 150);
		contentPane.add(textField1);
		textField1.setColumns(10);
		//Thehandler handler = new Thehandler();
		//textField.addActionListener(handler);
		
		JButton btnN = new JButton("N");
		btnN.setForeground(Color.BLUE);
		btnN.setFont(new Font("Jokerman", Font.BOLD, 18));
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnN.setBackground(Color.RED);
		btnN.setBounds(107, 364, 55, 40);
		contentPane.add(btnN);
		
		JButton btnS = new JButton("S");
		btnS.setForeground(Color.BLUE);
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnS.setFont(new Font("Jokerman", Font.BOLD, 18));
		btnS.setBackground(Color.RED);
		btnS.setBounds(107, 462, 55, 40);
		contentPane.add(btnS);
		
		JButton btnW = new JButton("W");
		btnW.setForeground(Color.BLUE);
		btnW.setFont(new Font("Jokerman", Font.BOLD, 18));
		btnW.setBackground(Color.RED);
		btnW.setBounds(23, 414, 55, 40);
		contentPane.add(btnW);
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE.setForeground(Color.BLUE);
		btnE.setFont(new Font("Jokerman", Font.BOLD, 18));
		btnE.setBackground(Color.RED);
		btnE.setBounds(196, 414, 55, 40);
		contentPane.add(btnE);
		
		JProgressBar progressBarPlayer = new JProgressBar();
		progressBarPlayer.setBackground(Color.MAGENTA);
		progressBarPlayer.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent arg0) {
			}
			public void inputMethodTextChanged(InputMethodEvent arg0) {
			}
		});
		progressBarPlayer.setToolTipText("Player");
		progressBarPlayer.setOrientation(SwingConstants.VERTICAL);
		progressBarPlayer.setBounds(871, 246, 30, 100);
		contentPane.add(progressBarPlayer);
		
		JProgressBar progressBarEnemy = new JProgressBar();
		progressBarEnemy.setBackground(Color.MAGENTA);
		progressBarEnemy.setToolTipText("Enemy");
		progressBarEnemy.setOrientation(SwingConstants.VERTICAL);
		progressBarEnemy.setBounds(939, 246, 30, 100);
		contentPane.add(progressBarEnemy);
		
		JLabel playerHP = new JLabel("Player ");
		playerHP.setToolTipText("Player");
		playerHP.setBounds(871, 354, 56, 16);
		contentPane.add(playerHP);
		
		JLabel enemyHP = new JLabel("Enemy");
		enemyHP.setBounds(939, 354, 56, 16);
		contentPane.add(enemyHP);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(885, 34, 97, 25);
		contentPane.add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.setBounds(885, 87, 97, 25);
		contentPane.add(btnLoad);
		
		JButton btnResume = new JButton("Resume");
		btnResume.setBounds(885, 138, 97, 25);
		contentPane.add(btnResume);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(885, 191, 97, 25);
		contentPane.add(btnQuit);
		
		JLabel lblMove = new JLabel("Move");
		lblMove.setBounds(117, 428, 56, 16);
		contentPane.add(lblMove);
		
		JLabel lblHealthBar = new JLabel("Health Bar");
		lblHealthBar.setBounds(894, 378, 88, 16);
		contentPane.add(lblHealthBar);
		
		JButton btnAttack = new JButton("Attack");
		btnAttack.setBounds(288, 350, 97, 25);
		contentPane.add(btnAttack);
		
		JButton btnFlee = new JButton("Flee");
		btnFlee.setBounds(288, 391, 97, 25);
		contentPane.add(btnFlee);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.setBounds(288, 429, 97, 25);
		contentPane.add(btnOpen);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(401, 429, 97, 25);
		contentPane.add(btnEnter);
		btnEnter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				File file = new File("game.txt");
				Player player = new Player();
				String getValue = textField1.getText();				
				
				try {
					PrintWriter output = new PrintWriter(file);
					output.println(textField1.getText());
					output.close();

				} catch (IOException e1) {
					System.out.println("that shit dont exist nigga");
				}		
				Scanner input;
				try {
					input = new Scanner(file);
					//c.setName(input.nextLine());
					textField1.setText("Hello ");
				} catch (FileNotFoundException e1) {
					System.out.println("that shit dont exist nigga");
				}
			

				
			}
		});
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(401, 472, 97, 25);
		contentPane.add(btnExit);
		
		JButton btnExamine = new JButton("Examine");
		btnExamine.setBounds(288, 472, 97, 25);
		contentPane.add(btnExamine);
		
		JButton btnNewButton = new JButton("Pickup");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(401, 350, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnDrop = new JButton("Drop");
		btnDrop.setBounds(401, 391, 97, 25);
		contentPane.add(btnDrop);
		
		JLabel lblInventory = new JLabel("Inventory");
		lblInventory.setBounds(624, 378, 56, 16);
		contentPane.add(lblInventory);
		
		textField2 = new JTextField();
		textField2.setAutoscrolls(false);
		textField2.setHorizontalAlignment(SwingConstants.LEFT);
	//	textField2.setHorizontalAlignment(SwingConstants.TOP);
		textField2.setForeground(Color.RED);
		textField2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		textField2.setColumns(10);
		textField2.setBackground(Color.LIGHT_GRAY);
		textField2.setBounds(407, 176, 452, 150);
		contentPane.add(textField2);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setBounds(729, 339, 97, 25);
		contentPane.add(btnContinue);
	}

	@Override

	public void update(Observable obs, Object obj) {
	
		textField1.setText(""+obj);	
    	}
	/*private class Thehandler implements ActionListener{
		GameModel model = new GameModel();
		Player player = new Player();
		public void actionPerformed(ActionEvent e){
			
			//model.nextDialogue();
			Player.setName(e.get);
			textField.setText(Player.getName());
			
		}
	}*/
}

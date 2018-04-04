import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
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
		
//		JPanel panel = new JPanel();
//		BufferedImage myPicture;
//		try {
//		myPicture = ImageIO.read(new File("fireMap.jpg"));
//		JLabel picLabel = new JLabel(new ImageIcon("C:\\Users\\Kidus\\Desktop\\workspace\\TeamTitans-Spring2018\\fireMap.jpg"));
//		getContentPane().add(picLabel);
//		panel.setBounds(401, 13, -392, 325);
//		contentPane.add(panel);
//		}
//		catch (IOException e1) {
//			System.out.println("Image not found");
//			e1.printStackTrace();
//		}
		
	
	
		textField = new JTextField();
		textField.setBounds(407, 13, 452, 274);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setForeground(Color.RED);
		textField.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setColumns(10);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(107, 364, 55, 40);
		btnN.setForeground(Color.BLUE);
		btnN.setFont(new Font("Jokerman", Font.BOLD, 18));
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnN.setBackground(Color.RED);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(107, 473, 55, 40);
		btnS.setForeground(Color.BLUE);
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnS.setFont(new Font("Jokerman", Font.BOLD, 18));
		btnS.setBackground(Color.RED);
		
		JButton btnW = new JButton("W");
		btnW.setBounds(23, 414, 55, 40);
		btnW.setForeground(Color.BLUE);
		btnW.setFont(new Font("Jokerman", Font.BOLD, 18));
		btnW.setBackground(Color.RED);
		
		JButton btnE = new JButton("E");
		btnE.setBounds(196, 414, 55, 40);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnE.setForeground(Color.BLUE);
		btnE.setFont(new Font("Jokerman", Font.BOLD, 18));
		btnE.setBackground(Color.RED);
		
		JProgressBar progressBarPlayer = new JProgressBar();
		progressBarPlayer.setBounds(891, 241, 30, 100);
		progressBarPlayer.setBackground(Color.MAGENTA);
		progressBarPlayer.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent arg0) {
			}
			public void inputMethodTextChanged(InputMethodEvent arg0) {
			}
		});
		progressBarPlayer.setToolTipText("Player");
		progressBarPlayer.setOrientation(SwingConstants.VERTICAL);
		
		JProgressBar progressBarEnemy = new JProgressBar();
		progressBarEnemy.setBounds(939, 241, 30, 100);
		progressBarEnemy.setBackground(Color.MAGENTA);
		progressBarEnemy.setToolTipText("Enemy");
		progressBarEnemy.setOrientation(SwingConstants.VERTICAL);
		
		JLabel playerHP = new JLabel("Player ");
		playerHP.setBounds(882, 354, 56, 16);
		playerHP.setToolTipText("Player");
		
		JLabel enemyHP = new JLabel("Enemy ");
		enemyHP.setBounds(939, 354, 55, 16);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(885, 34, 97, 25);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.setBounds(885, 87, 97, 25);
		
		JButton btnResume = new JButton("Resume");
		btnResume.setBounds(885, 138, 97, 25);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(885, 191, 97, 25);
		
		JLabel lblMove = new JLabel("Move");
		lblMove.setBounds(117, 428, 56, 16);
		
		JLabel lblHealthBar = new JLabel("Health Bar");
		lblHealthBar.setBounds(894, 378, 88, 16);
		
		JButton btnAttack = new JButton("Attack");
		btnAttack.setBounds(288, 350, 97, 25);
		
		JButton btnFlee = new JButton("Flee");
		btnFlee.setBounds(288, 391, 97, 25);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.setBounds(288, 429, 97, 25);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBounds(401, 429, 97, 25);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(401, 467, 97, 25);
		
		JButton btnExamine = new JButton("Examine");
		btnExamine.setBounds(288, 467, 97, 25);
		
		JButton btnNewButton = new JButton("Pickup");
		btnNewButton.setBounds(401, 350, 97, 25);
		
		JButton btnDrop = new JButton("Drop");
		btnDrop.setBounds(401, 391, 97, 25);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		
		JLabel lblInventory = new JLabel("Inventory");
		lblInventory.setBounds(651, 305, 56, 16);
		contentPane.setLayout(null);
		contentPane.add(textField);
		contentPane.add(btnSave);
		contentPane.add(btnLoad);
		contentPane.add(btnResume);
		contentPane.add(btnQuit);
		contentPane.add(btnW);
		contentPane.add(btnN);
		contentPane.add(lblMove);
		contentPane.add(btnE);
		contentPane.add(btnAttack);
		contentPane.add(btnFlee);
		contentPane.add(btnOpen);
		contentPane.add(btnNewButton);
		contentPane.add(btnDrop);
		contentPane.add(btnEnter);
		contentPane.add(lblInventory);
		contentPane.add(lblHealthBar);
		contentPane.add(playerHP);
		contentPane.add(progressBarPlayer);
		contentPane.add(progressBarEnemy);
		contentPane.add(enemyHP);
		contentPane.add(btnS);
		contentPane.add(btnExamine);
		contentPane.add(btnExit);
		
		JCheckBox checkBox1 = new JCheckBox("");
		checkBox1.setBounds(522, 350, 113, 25);
		contentPane.add(checkBox1);
		
		JCheckBox checkBox2 = new JCheckBox("");
		checkBox2.setBounds(522, 391, 113, 25);
		contentPane.add(checkBox2);
		
		JCheckBox checkBox3 = new JCheckBox("");
		checkBox3.setBounds(522, 429, 113, 25);
		contentPane.add(checkBox3);
		
		JCheckBox checkBox4 = new JCheckBox("");
		checkBox4.setBounds(522, 467, 113, 25);
		contentPane.add(checkBox4);
		
		JCheckBox checkBox5 = new JCheckBox("");
		checkBox5.setBounds(689, 350, 113, 25);
		contentPane.add(checkBox5);
		
		JCheckBox checkBox6 = new JCheckBox("");
		checkBox6.setBounds(689, 391, 113, 25);
		contentPane.add(checkBox6);
		
		JCheckBox checkBox7 = new JCheckBox("");
		checkBox7.setBounds(689, 429, 113, 25);
		contentPane.add(checkBox7);
		
		JCheckBox checkBox8 = new JCheckBox("");
		checkBox8.setBounds(689, 467, 113, 25);
		contentPane.add(checkBox8);
	}
}

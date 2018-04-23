import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public  class Character implements Serializable{

	private String playerName;
	private int playerHP;
	private int playerAttackPoints;

	public  Character(String name, int playerHP, int playerAttackPoints) {

		this.playerName = name;
		this.playerHP = playerHP;
		this.playerAttackPoints = playerAttackPoints;
	}

	public void setName(String n) {
		if (n != null) {

			playerName = n;

		} 
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getPlayerHP() {
		return playerHP;
	}

	public void setPlayerHP(int playerHP) {
		this.playerHP = playerHP;
	}

	public void setPlayerAttackPoints(int playerAttackPoints) {
		this.playerAttackPoints = playerAttackPoints;
	}

	public int getPlayerAttackPoints() {
		return playerAttackPoints;
	}

	public void savedplayer() throws ClassNotFoundException {

		
		try {
			Character c = new Character(getPlayerName(),getPlayerHP(), getPlayerAttackPoints());
			
			// write object to file
			FileOutputStream fos = new FileOutputStream("save.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c);
			oos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadplayer() throws ClassNotFoundException {

		try {

			FileInputStream fis = new FileInputStream("save.txt");

			ObjectInputStream ois = new ObjectInputStream(fis);

			Character result = (Character) ois.readObject();
			
			Battle b = new Battle();
			
			
			setName(result.getPlayerName());
			b.setPlayerHP(result.getPlayerHP());
			
			System.out.println("Name:" + result.getPlayerName() + ", PlayerHp:" + result.getPlayerHP() + ", PlayerAttack Points:" + result.getPlayerHP() +
					+ result.getPlayerAttackPoints());
			
			
			

			ois.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	static void viewStats() {
		System.out.println();
		
	}

}

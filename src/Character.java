public class Character {

	private String playerName;
	private int playerHP;
	private int playerAttackPoints;
	
	public Character(String name, int playerHP, int playerAttackPoints) {
		super();
		this.playerName = name;
		this.playerHP = playerHP;
		this.playerAttackPoints = playerAttackPoints;
		
	}

	public void setName(String n) {
		if (n != null) {

			playerName = n;

		} else {
			System.out.println("Invalid entry");
		}
	}

	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @return the playerHP
	 */
	public int getPlayerHP() {
		return playerHP;
	}

	/**
	 * @param playerHP the playerHP to set
	 */
	public void setPlayerHP(int playerHP) {
		this.playerHP = playerHP;
	}

	/**
	 * @return the playerAttackPoints
	 */
	public int getPlayerAttackPoints() {
		return playerAttackPoints;
	}

}

/**
 * 
 */

/**
 * @author tethe_000
 *
 */
public class Rooms {

	private Monster monster;
	private Puzzles puzzles;
	private Weapon weapon;
		  
	public static Rooms ER01;
	public static Rooms ER02 = null;
	public static Rooms ER03 = null;
	public static Rooms ER04 = null;
	public static Rooms ER05 = null;
	public static Rooms ER06 = null;
	public static Rooms ER07 = null;
	public static Rooms ER08 = null;
		   
		  public Rooms (Monster _monster, Weapon _weapon) {		  
			  monster = _monster;
			//  puzzles = _puzzles;
			  weapon = _weapon;
		  }
		


		public static void getER01() {
				if (ER01 == null) {
					ER01 = new Rooms(Monster.getEM01(), Weapon.getEI01());
				}
				System.out.println(ER01); 
			}	  
}	  
			  


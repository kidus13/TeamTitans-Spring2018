/**
 * 
 */

/**
 * @author tethe_000
 *
 */
public class Rooms {

	private String roomID;
	private String roomName;
	private String description;
	private int doorID;
	// not needed - private int attribute4;
	
	/**
     * Default constructor used to create empty attributes
     */
	public Rooms() {
		// TODO Auto-generated constructor stub
		roomID = "";
		roomName = "";
		description = null;
		doorID = 0;
		
		}

	public Rooms(String roomID, String roomName, String description, int doorID) {
		this.roomID = roomID;
		this.roomName = roomName;
		this.description = description;
		this.doorID = doorID;
		
		
		
	}
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//should the roomid be changed to string since each level starts with that levels ID?
		
		//need to fix these, theyre out of order 4.6 Trivon
		Rooms Entrance = new Rooms("ER01", "Entrance", null, 0);
		Rooms GuardiansStation = new Rooms("ER02", "Guardian's Station", null, 1);
		Rooms GuardsBarracks = new Rooms("ER03", "Guard's Barracks", null, 2);
		Rooms LongHallway = new Rooms("ER04", "Long Hallway", null, 3);
		Rooms TortureRoom = new Rooms("ER05", "Torture Room", null, 4);
		Rooms Cell = new Rooms("ER06", "Cell", null, 5);
		Rooms EquipmentRoom = new Rooms("ER07", "Equipment Room", null, 6);
		Rooms LargeChamber = new Rooms("ER08", "Large Chamber", null, 7);
		
		//Rooms EntranceRoom = new Rooms("WR01", "Entrance Room", room1, 1, 1);
		Rooms EntranceRoom = new Rooms("WR01", "Entrance Room", null, 8);
		Rooms VerKsrRoom = new Rooms("WR02", "VerKsr Room", null, 9); //verksr is room 10 actually
		Rooms SarCoRoom = new Rooms("WR03", "SarCo Room", null, 10);
		Rooms StalacticeRoom = new Rooms("WR04", "Stalactice Room", null, 11);
		Rooms CraftRoomStore= new Rooms("WR05", "Craft Store Room", null, 12);
		Rooms DoomsRoom = new Rooms("WR06", "Dooms Room", null, 13);
		Rooms HellPathRoom = new Rooms("WR07", "Hell Path Room", null, 14);
		Rooms WitchOfTheFallsRoom = new Rooms("WR08", "Witch of the Falls Room", null, 15);
		Rooms FireHallway = new Rooms("FH", "Fire Hallway", null, 16);
		Rooms FireCavern1 = new Rooms("FR01", "Fire Cavern 1", null, 17);
		Rooms FireCavern2 = new Rooms("FR02", "Fire Cavern 2", null, 18);
		Rooms FireCavern3 = new Rooms("FR03", "Fire Cavern 3", null, 19);
		Rooms FireCavern4 = new Rooms("FR04", "Fire Cavern 4", null, 20);
		Rooms FireCavern5 = new Rooms("FR05", "Fire Cavern 5", null, 21);
		Rooms FireCavern6 = new Rooms("FR06", "Fire Cavern 6", null, 22);
		Rooms FireCavern7 = new Rooms("FR07", "Fire Cavern 7", null, 23);
		Rooms FireCavern8 = new Rooms("FR08", "Fire Cavern 8", null, 24);
		Rooms FireCavern9 = new Rooms("FR09", "Fire Cavern 9", null, 25);
		Rooms FireCavern10= new Rooms("FR10", "Fire Cavern 10", null, 26);
		Rooms = new Rooms("", "", "", 27);
		Rooms = new Rooms("", "", "", 28);
		Rooms = new Rooms("", "", "", 29);
		Rooms = new Rooms("", "", "", 30);
		Rooms = new Rooms("", "", "", 31);
		Rooms = new Rooms("", "", "", 32);
		Rooms = new Rooms("", "", "", 33);
		Rooms = new Rooms("", "", "", 34);
		Rooms = new Rooms("", "", "", 35);
		Rooms = new Rooms("", "",3 "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		
	}

}
/* class Room{
    private String roomName;
    public void setRoomName(String roomNameParam){
        roomName=roomNameParam;
    }
    public String getRoomName(){
        return roomName;
    }
    private String roomDescription;
    public void setRoomDescription(String roomDescriptionParam){
        roomDescription=roomDescriptionParam;
    }
    public String getRoomDescription(){
        return roomDescription;
    }

}
class Inventory{
    private ArrayList<Item> items= new ArrayList<Item>();
    public boolean findItem(String itemToFind)
    {
        for(int i=0;i<items.size();i++){
            if(items.get(i).getItemName()==itemToFind){
                return true;
            }
        }
        return false;
    }
}
public class Main {

     public static void main(String[] args){ 
      Scanner scanner = new Scanner(System.in); 
      Player player = new Player();
      boolean gameRunning=true;
      while(gameRunning){
      System.out.println("Welcome to TextBasedGamev1!"
                       + "Before beginning, please enter your name");
      String name=scanner.nextLine();
      player.setPlayerName(name);

      Room forestWelcome=new Room();
      Room forestSouth=new Room();
      Room forestNorth=new Room();
      Room abandonedHouse=new Room();

      } 
      
      *
      *
      *
      *public final class Room {

    private final String description;
    private final Monster monster;
    private final Boolean isBossRoom;
    private final static Random random = new Random();
    private final static Set<Integer> roomsSeen = new HashSet<Integer>();
    private final static int NUM_ROOMS = 7;

    private Room(String description, Monster monster, Boolean isBossRoom) {
        this.description = description;
        this.monster = monster;
        this.isBossRoom = isBossRoom;
    }

    public static Room newRegularInstance() {
        if (roomsSeen.size() == NUM_ROOMS) {
            roomsSeen.clear();
        }
        int i;
        do {
            i = random.nextInt(NUM_ROOMS);
        } while (roomsSeen.contains(i));
        roomsSeen.add(i);

        String roomDescription = null;
        if (i == 0) {
            roomDescription = "a fetid, dank room teeming with foul beasts";
        } else if (i == 1) {
            roomDescription = "an endless mountain range where eagles soar looking for prey";
        } else if (i == 2) {
            roomDescription = "a murky swamp with a foul smelling odour";
        } else if (i == 3) {
            roomDescription = "a volcano with rivers of lava at all sides";
        } else if (i == 4) {
            roomDescription =
                    "a thick forest where strange voices call out from the trees high above";
        } else if (i == 5) {
            roomDescription =
                    "an old abandoned sailing ship, littered with the remains of some unlucky sailors";
        } else if (i == 6) {
            roomDescription = "a cafe filled with hipster baristas who refuse to use encapsulation";
        } else {
        }
        return new Room(roomDescription, Monster.newRandomInstance(), false);
    }

    public static Room newBossInstance() {
        return new Room("a huge cavern thick with the smell of sulfur", Monster.newBossInstance(),
                true);
    }

    public boolean isBossRoom() {
        return isBossRoom;
    }

    public boolean isComplete() {
        return !monster.isAlive();
    }

    @Override
    public String toString() {
        return description;
    }

    public void enter(Player player) throws IOException {
        System.out.println("You are in " + description);
        if (monster.isAlive()) {
            new Battle(player, monster);
        }
    }

} */

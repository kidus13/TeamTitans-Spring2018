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

	public Rooms(String roomID, String roomName, String description, int doorID, int attribute4) {
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
		
		//Rooms EntranceRoom = new Rooms("WR01", "Entrance Room", room1, 1, 1);
		Rooms VerKsrRoom = new Rooms("WR02", "VerKsr Room", null, 2, 2);
		Rooms SarCoRoom = new Rooms("WR03", "SarCo Room", null, 3, 0 );
		Rooms StalacticeRoom = new Rooms("WR04", "Stalactice Room", null, 4, 4);
		Rooms CraftRoomStore= new Rooms("WR05", "Craft Store Room", null, 5, 5);
		/*Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "",3 "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0);
		Rooms = new Rooms("", "", "", 0, 0)*/;
		
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

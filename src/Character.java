public class Character {

	private static  String name;

	public  void setName(String n){
		if(n!= null){

			 name = n;

		}
		else{
			System.out.println("Invalid entry");
		}
	}
	public static   String getName(){
		return name;
	}
}

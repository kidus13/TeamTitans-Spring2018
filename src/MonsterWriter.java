/**
 * 
 */
import java.io.*;
import java.util.Scanner;
/**
 * @author tethe_000
 *
 */
public class MonsterWriter {

	private Scanner Monster1; //create scanner to read in monster
	
	//open monster text file
	public void openMonster1(){
		try {
			Monster1 = new Scanner(new File("monster1.txt"));
		} catch (Exception e) {
			System.out.println("file 1 not found");
		}
	}
	
	//read monster text file 
	public void readMonster1(){
	while (Monster1.hasNextLine()) {
		String _Monster1 = Monster1.nextLine();
		System.out.println(_Monster1);
	}
	}
	//close the file
	public void closeMonster1() {
		Monster1.close();
	}
	
	private Scanner Monster2; //create scanner to read in monster
	
	//open monster text file
	public void openMonster2(){
		try {
			Monster2 = new Scanner(new File("monster2.txt"));
		} catch (Exception e) {
			System.out.println("file 2 not found");
		}
	}
	
	//read monster text file 
	public void readMonster2(){
	while (Monster2.hasNextLine()) {
		String _Monster2 = Monster2.nextLine();
		System.out.println(_Monster2);
	}
	}
	//close the file
	public void closeMonster2() {
		Monster2.close();
	}
	private Scanner Monster3; //create scanner to read in monster
	
	//open monster text file
	public void openMonster3(){
		try {
			Monster3 = new Scanner(new File("monster3.txt"));
		} catch (Exception e) {
			System.out.println("file 3 not found");
		}
	}
	
	//read monster text file 
	public void readMonster3(){
	while (Monster3.hasNextLine()) {
		String _Monster3 = Monster3.nextLine();
		System.out.println(_Monster3);
	}
	}
	//close the file
	public void closeMonster3() {
		Monster3.close();
	}
	private Scanner Monster4; //create scanner to read in monster
	
	//open monster text file
	public void openMonster4(){
		try {
			Monster4 = new Scanner(new File("monster4.txt"));
		} catch (Exception e) {
			System.out.println("file 4 not found");
		}
	}
	
	//read monster text file 
	public void readMonster4(){
	while (Monster4.hasNextLine()) {
		String _Monster4 = Monster4.nextLine();
		System.out.println(_Monster4);
	}
	}
	//close the file
	public void closeMonster4() {
		Monster4.close();
	}
	private Scanner Monster5; //create scanner to read in monster
	
	//open monster text file
	public void openMonster5(){
		try {
			Monster5 = new Scanner(new File("monster5.txt"));
		} catch (Exception e) {
			System.out.println("file 5 not found");
		}
	}
	
	//read monster text file 
	public void readMonster5(){
	while (Monster5.hasNextLine()) {
		String _Monster5 = Monster5.nextLine();
		System.out.println(_Monster5);
	}
	}
	//close the file
	public void closeMonster5() {
		Monster5.close();
	}
	private Scanner Monster6; //create scanner to read in monster
	
	//open monster text file
	public void openMonster6(){
		try {
			Monster6 = new Scanner(new File("monster6.txt"));
		} catch (Exception e) {
			System.out.println("file 6 not found");
		}
	}
	
	//read monster text file 
	public void readMonster6(){
	while (Monster6.hasNextLine()) {
		String _Monster6 = Monster6.nextLine();
		System.out.println(_Monster6);
	}
	}
	//close the file
	public void closeMonster6() {
		Monster6.close();
	}
	private Scanner Monster7; //create scanner to read in monster
	
	//open monster text file
	public void openMonster7(){
		try {
			Monster7 = new Scanner(new File("monster7.txt"));
		} catch (Exception e) {
			System.out.println("file 7 not found");
		}
	}
	
	//read monster text file 
	public void readMonster7(){
	while (Monster7.hasNextLine()) {
		String _Monster7 = Monster7.nextLine();
		System.out.println(_Monster7);
	}
	}
	//close the file
	public void closeMonster7() {
		Monster7.close();
	}
	private Scanner Monster8; //create scanner to read in monster
	
	//open monster text file
	public void openMonster8(){
		try {
			Monster8 = new Scanner(new File("monster8.txt"));
		} catch (Exception e) {
			System.out.println("file 8 not found");
		}
	}
	
	//read monster text file 
	public void readMonster8(){
	while (Monster8.hasNextLine()) {
		String _Monster8 = Monster8.nextLine();
		System.out.println(_Monster8);
	}
	}
	//close the file
	public void closeMonster8() {
		Monster8.close();
	}
	private Scanner Monster9; //create scanner to read in monster
	
	//open monster text file
	public void openMonster9(){
		try {
			Monster9 = new Scanner(new File("monster9.txt"));
		} catch (Exception e) {
			System.out.println("file 9 not found");
		}
	}
	
	//read monster text file 
	public void readMonster9(){
	while (Monster9.hasNextLine()) {
		String _Monster9 = Monster9.nextLine();
		System.out.println(_Monster9);
	}
	}
	//close the file
	public void closeMonster9() {
		Monster9.close();
	}
	
	/*private Scanner Monster; //create scanner to read in monster
	
	//open monster text file
	public void openMonster(){
		try {
			Monster = new Scanner(new File("monster.txt"));
		} catch (Exception e) {
			System.out.println("file not found");
		}
	}
	
	//read monster text file 
	public void readMonster(){
	while (Monster.hasNextLine()) {
		String _Monster = Monster.nextLine();
		System.out.println(Monster);
	}
	}
	//close the file
	public void closeMonster() {
		Monster.close();
	}*/
	
	
}

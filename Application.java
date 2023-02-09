/**
 * This is the Application object that will launch our application
 * @author Rob Kelley
 * @version 1.3
 * Lab1 
 * CS131ON
 */
public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter();
		npc.reportStructure();
		npc.introduce();
		npc.exclaim();
		//Uncomment the line below to ensure reportStructure() method works after you have written it.
		//System.out.println(npc.reportStructure());
		BasketballTeam t1 = new BasketballTeam();
		t1.setStats(56, 98, 465, 600, 193, 411);
		t1.getStats();
	}//end main

}//end class
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
		System.out.println(npc.reportStructure());
		System.out.println(npc.introduce());
		System.out.println(npc.exclaim());
		
		NonPlayerCharacter npc2 = new NonPlayerCharacter("Vader", "MEAN", true, "Superior");
		npc2.reportStructure();
		System.out.println(npc2.reportStructure());
		
		
		//Uncomment the line below to ensure reportStructure() method works after you have written it.
		//System.out.println(npc.reportStructure());
		BasketballTeam t1 = new BasketballTeam();
		t1.setStats(56, 98, 465, 600, 193, 411);
		t1.getStats();
		System.out.println(t1.getTeamName());
		
		BasketballTeam t2 = new BasketballTeam("raiders", "bear", "coach");
		t2.setStats(56, 98, 465, 600, 193, 411);
		t2.getStats();
		System.out.println(t2.teamName);
	}//end main

}//end class
import java.security.SecureRandom;
import java.util.Random;
/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	private boolean active;
	private String intelligenceType;
	
	/**
	 * default constructor
	 */
	public NonPlayerCharacter() {
		super();
		setActive(false);
		setIntelligenceType("AVERAGE");
	}//end default constructor
	
	/**
	 * preferred constructor
	 * @param id specifies the exact name
	 * @param personality specifies the npc's personality type
	 * @param active specifies whether or not the npc is currently active
	 * @param intelligenceType specifies the npc's level of intelligence
	 */
	public NonPlayerCharacter(String id, String personality, boolean active, 
			String intelligenceType) {
		super();
		setActive(false);
		setIntelligenceType("AVERAGE");
	}//end preferred constructor
	
	
	/**
	 * This method will print both halves of the report structure.
	 * The report structure will show the values of every variable present.
	 */
	public String reportStructure() {
		super.reportStructure();
		System.out.println(super.reportStructure());
		StringBuilder sb = new StringBuilder();
		sb.append("Active: " + getActive() + "\n");
		sb.append("Intelligence Type: " + getIntelligenceType() + "\n");
		sb.append("==================================\n");
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	
	/**
	 * This method has the npc introduce themselves through returning a string
	 * containing their name.
	 */
	public String introduce() {
		System.out.println("Hello, my name is " + uniqueID);
		return ("Hello, my name is " + uniqueID);
	}//end introduce method
	
	/**
	 * This method will have the npc exclaim a randomly chosen phrase.
	 */
	public String exclaim() {
		Random generator = new Random();
		int value = generator.nextInt(0, 6);
		if (value == 1) {
			System.out.println("Dag Gummit");
			return "Dag Gummit";
		} else if (value == 2) {
			System.out.println("Doggone it");
			return "Doggone it";
		} else if (value == 3) {
			System.out.println("Holy cow");
			return "Holy cow";
		} else if (value == 4) {
			System.out.println("Jeez");
			return "Jeez";
		} else {
			System.out.println("Well cheese and crackers");
			return "Well cheese and crackers";
		}
				
	}//end exclaim method
	
	
	/**
	 * The getter will return the value of active
	 * @return the value of active
	 */
	public boolean getActive() {
		return active;
	}//end getter
	
	/**
	 * The setter will return the newly set value of active
	 * @param newActive will replace old value of active
	 */
	public void setActive(boolean newActive) {
		active = newActive;
	}//end setter
	
	/**
	 * The getter will return the value of intelligenceType
	 * @return the value of intelligenceType
	 */
	public String getIntelligenceType() {
		return intelligenceType;
	}//end getter
	
	/**
	 * The setter will return the newly set value of intelligenceType
	 * @param newIntelligenceType will replace old value of intelligenceType
	 */
	public void setIntelligenceType(String newIntelligenceType) {
		intelligenceType = newIntelligenceType;
	}//end setter
	
}//end class

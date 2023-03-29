
public class BasketballTeam extends SportsTeam{
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	
	/**
	 * default constructor
	 */
	public BasketballTeam() {
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
		teamName = "";
		teamMascot = "";
		headCoach = "";
	}//end default constructor
	
	
	/**
	 * preferred constructor
	 * @param teamName specifies the team
	 * @param teamMascot specifies the team's mascot
	 * @param headCoach specifies the team's coach
	 */
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		super.teamName = teamName;
		super.teamMascot = teamMascot;
		super.headCoach = headCoach;
		fieldGoals = 0;
		fieldGoalsAttempted = 0;
		freeThrows = 0;
		freeThrowsAttempted = 0;
	}//end preferred constructor
	
	
	/**
	 * 
	 * @return the field goal percentage
	 */
	public double fieldGoalPercentage() {
		double hold1 = fieldGoals;
		double hold2 = fieldGoalsAttempted;
		double goalPercentage = hold1/hold2;
		return goalPercentage;
	}//end fieldGoalPercentage method
	
	
	/**
	 * 
	 * @return the free throw percentage
	 */
	public double freeThrowPercentage() {
		double hold3 = freeThrows;
		double hold4 = freeThrowsAttempted;
		double throwPercentage = hold3/hold4;
		return throwPercentage;
	}//end freeThrowPercentage method
	
	
	/**
	 * sets the value of every integer
	 * @param wins keeps the amount of wins
	 * @param losses keeps the amount of losses
	 * @param fieldGoals keeps the amount of field goals
	 * @param fieldGoalsAttempted keeps the amount of field goals attempted
	 * @param freeThrows keeps the amount of free throws
	 * @param freeThrowsAttempted keeps the amount of free throws attempted
	 */
	public void setStats(int newWins, int newLosses, int newFieldGoals, 
			int newFieldGoalsAttempted, int newFreeThrows, int newFreeThrowsAttempted) {
		wins = newWins;
		losses = newLosses;
		fieldGoals = newFieldGoals;
		fieldGoalsAttempted = newFieldGoalsAttempted;
		freeThrows = newFreeThrows;
		freeThrowsAttempted = newFreeThrowsAttempted;
	}//end setStats method
	
	
	/**
	 * returns the stats
	 */
	public double[] getStats() {
		double stats[] = {getWinPercentage(), fieldGoalPercentage(), freeThrowPercentage()};
		for (int i = 0; i < 3; i++) {
			System.out.println(stats[i]);
		}
		return stats;
	}//end getStats method


	public int getFieldGoals() {
		return fieldGoals;
	}


	public void setFieldGoals(int fieldGoals) {
		if (fieldGoals >= 0) {
		this.fieldGoals = fieldGoals;
		}
	}


	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}


	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		if (fieldGoalsAttempted >= 0) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
		}
	}


	public int getFreeThrows() {
		return freeThrows;
	}


	public void setFreeThrows(int freeThrows) {
		if (freeThrows >= 0) {
		this.freeThrows = freeThrows;
		}
	}


	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}


	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		if (freeThrowsAttempted >= 0) {
		this.freeThrowsAttempted = freeThrowsAttempted;
		}
	}
	
	
	
	
	//end program
}

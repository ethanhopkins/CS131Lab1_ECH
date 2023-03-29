
abstract class SportsTeam {
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;
	
	
	/**
	 * default constructor
	 * sets default values for each item
	 */
	public SportsTeam() {
		teamName = "";
		teamMascot = "";
		headCoach = "";
		wins = 0;
		losses = 0;
	}//end default constructor
	
	
	/**
	 * preferred constructor
	 * @param teamName represents the name of the team; is initially set to 0
	 * @param teamMascot represents the name of the mascot; is initially set to 0
	 * @param headCoach represents the name of the coach; is initially set to 0
	 */
	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		setTeamName(teamName);
		setTeamMascot(teamMascot);
		setHeadCoach(headCoach);
		wins = 0;
		losses = 0;
	}//end preferred constructor
	
	
	/**
	 * getter for win percentage
	 * @return the win percentage
	 */
	public double getWinPercentage() {
		double add = wins + losses;
		double winPercentage = wins/add;
		return winPercentage;
	}//end getter for win percentage
	
	
	/**
	 * @return the value of stats
	 */
	public abstract double[] getStats();
	//end get stats method


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public String getTeamMascot() {
		return teamMascot;
	}


	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}


	public String getHeadCoach() {
		return headCoach;
	}


	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}


	public int getWins() {
		return wins;
	}


	public void setWins(int wins) {
		if (wins >= 0) {
		this.wins = wins;
		}
	}


	public int getLosses() {
		return losses;
	}


	public void setLosses(int losses) {
		if (losses >= 0) {
		this.losses = losses;
		}
	}
	
	
	
}

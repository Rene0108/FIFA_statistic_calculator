package fifa_package;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Player {

	public String name;
	public int wins;
	public int loses;
	public int draw;
	public int goalsScored;
	public int goalsReceived;
	public int points;
	public int att;
	public int mid;
	public int def;
	public int teamsOver80;
	public int teamsBetween70and80;
	public int teamsBetween60and70;
	public int teamsBetween50and60;
	
	public Player(String name) {
		this.name = name;
		this.wins = 0;
		this.loses = 0;
		this.draw = 0;
		this.goalsScored = 0;
		this.goalsReceived = 0;
		this.points = 0;
		this.att = 0;
		this.def = 0;
		this.mid = 0;
		this.teamsOver80 = 0;
		this.teamsBetween70and80 = 0;
		this.teamsBetween60and70 = 0;
		this.teamsBetween50and60 = 0;
	}
	
	public int getWins() {
		return wins;
	}
	public void addWins() {
		this.wins++;
	}
	
	public int getLoses() {
		return loses;
	}
	public void addLoses() {
		this.loses++;
	}
	
	public int getDraw() {
		return draw;
	}
	public void addDraw() {
		this.draw++;
	}
	
	public int getGoalsScored() {
		return goalsScored;
	}
	public void addGoalsScored(int goals) {
		this.goalsScored += goals;
	}
	
	public int getGoalsReceived() {
		return goalsReceived;
	}
	public void addGoalsReceived(int goals) {
		this.goalsReceived += goals;
	}
	
	public int getPoints() {
		return points;
	}
	public void addPoints(int points) {
		this.points += points;
	}
	
	public int getAtt() {
		return att;
	}
	public void addAtt(int att) {
		this.att += att;
	}
	
	public int getMid() {
		return mid;
	}
	public void addMid(int mid) {
		this.mid += mid;
	}
	
	public int getDef() {
		return def;
	}
	public void addDef(int def) {
		this.def += def;
	}
	
	public double getAvgAtt() {
		double avgAtt = (double) att / (wins + loses + draw);
		BigDecimal bd = new BigDecimal(avgAtt).setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
	
	public double getAvgMid() {
		double avgMid = (double) mid / (wins + loses + draw);
		BigDecimal bd = new BigDecimal(avgMid).setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
	
	public double getAvgDef() {
		double avgDef = (double) def / (wins + loses + draw);
		BigDecimal bd = new BigDecimal(avgDef).setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
	
	public void addTeamsOver80() {
		this.teamsOver80++;
	}
	
	public void addTeamsBetween70and80() {
		this.teamsBetween70and80++;
	}
	
	public void addTeamsBetween60and70() {
		this.teamsBetween60and70++;
	}
	
	public void addTeamsBetween50and60() {
		this.teamsBetween50and60++;
	}
	
	public String toString() {
		String s = "\n " + name + 
				"\n-----------------------------------------" +
				"\n     WIN    " + wins + 
				"\n     LOSE   " + loses + 
				"\n     DRAW   " + draw +
				"\n-----------------------------------------" + 
				"\n     Points :     " + points + 
				"\n-----------------------------------------" + 
				"\n     Goals scored :     " + goalsScored + 
				"\n     Goals received :   " + goalsReceived +
				"\n-----------------------------------------" + 
				"\n     Average team rating :" +
				"\n          ATT   " + getAvgAtt() +
				"\n          MID   " + getAvgMid() +
				"\n          DEF   " + getAvgDef() +
				"\n-----------------------------------------" + 
				"\n     Teams 80+      -->     " + teamsOver80 + " times" +
				"\n     Teams 70-80    -->     " + teamsBetween70and80 + " times" +
				"\n     Teams 60-70    -->     " + teamsBetween60and70 + " times" +
				"\n     Teams 50-60    -->     " + teamsBetween50and60 + " times";
		return s;
 	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

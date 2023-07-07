package fifa_package;


public class Team {
	
	public String name;
	public int att;
	public int mid;
	public int def;
	
	public Team(String name, int att, int mid, int def) {
		this.name = name;
		this.att = att;
		this.mid = mid;
		this.def = def;
	}
	
	public String getName() {
		return name;
	}

	public int getAtt() {
		return att;
	}
	public int getMid() {
		return mid;
	}
	public int getDef() {
		return def;
	}
}

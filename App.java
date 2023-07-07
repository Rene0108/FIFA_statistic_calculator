package fifa_package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
	
	private static File teams_file = new File("teams.txt");
	private static Player rene = new Player("Rene");
	private static Player alen = new Player("Alen");
	
	public static void main(String[] args) {
		
		List<Team> teams = new ArrayList<Team>();

		BufferedReader reader;
		
		try {
			reader = new BufferedReader(new FileReader("teams.txt"));
			
			String line = reader.readLine();
			while (line != null) {
				String[] arrOfStr = line.split(",");
				Team team = new Team(arrOfStr[0], Integer.parseInt(arrOfStr[1]), Integer.parseInt(arrOfStr[2]), Integer.parseInt(arrOfStr[3]));
				teams.add(team);
				line = reader.readLine();
			}
			reader.close();	
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		// READ GAMES
		try {
			reader = new BufferedReader(new FileReader("games.txt"));
			
			String line = reader.readLine();
			while (line != null) {
				String[] first = line.split(":");
				String[] left = first[0].split(",");
				String[] right = first[1].split(",");
				
				// GOLOVI
				int alen_golovi = Integer.parseInt(left[1]);
				int rene_golovi = Integer.parseInt(right[0]);
				if (alen_golovi < rene_golovi) {
					rene.addPoints(3);
					rene.addWins();
					alen.addLoses();
				} else if (alen_golovi > rene_golovi) {
					alen.addPoints(3);
					alen.addWins();
					rene.addLoses();
				} else {
					rene.addPoints(1);
					rene.addDraw();
					alen.addDraw();
					alen.addPoints(1);
				}
				rene.addGoalsScored(rene_golovi);
				rene.addGoalsReceived(alen_golovi);
				alen.addGoalsReceived(rene_golovi);
				alen.addGoalsScored(alen_golovi);
				
				// Saving teams statistics
				Team alenov = null;
				Team reneov = null;
				for (Team team : teams) {
					if (team.getName().equals(left[0])) {
						alenov = team;
						break;
					}
				}
				for (Team team : teams) {
					if (team.getName().equals(right[1])) {
						reneov = team;
						break;
					}
				}
				// System.out.println(alenov.getName());
				// System.out.println(reneov.getName());
				double alenTeamRating = (alenov.att + alenov.mid + alenov.def) / 3;
				double reneTeamRating = (reneov.att + reneov.mid + reneov.def) / 3;
				
				if (alenTeamRating >= 80) {
					alen.addTeamsOver80();
				} else if (alenTeamRating >= 70) {
					alen.addTeamsBetween70and80();
				} else if (alenTeamRating >= 60) {
					alen.addTeamsBetween60and70();
				} else {
					alen.addTeamsBetween50and60();
				}
				
				if (reneTeamRating >= 80) {
					rene.addTeamsOver80();
				} else if (reneTeamRating >= 70) {
					rene.addTeamsBetween70and80();
				} else if (reneTeamRating >= 60) {
					rene.addTeamsBetween60and70();
				} else {
					rene.addTeamsBetween50and60();
				}
				
				alen.addAtt(alenov.getAtt());
				alen.addDef(alenov.getDef());
				alen.addMid(alenov.getMid());
				rene.addAtt(reneov.getAtt());
				rene.addDef(reneov.getDef());
				rene.addMid(reneov.getMid());
				
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("_________________________________________");
		System.out.println(rene.toString());
		System.out.println("_________________________________________");
		System.out.println("_________________________________________");
		System.out.println("_________________________________________");
		System.out.println(alen.toString());
		System.out.println("_________________________________________");
	}
}



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {
	
	private static File teams_file = new File("teams.txt");
	private static Player rene = new Player();
	private static Player alen = new Player();
	
	public static void main(String[] args) {
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"teams.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// create teams field
		Team[] teams = {};
		
		// read games 
		
		// 
	}
	

}

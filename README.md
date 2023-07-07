# FIFA Statistics Calculator

This Java application allows me to track match statistics in the game FIFA between me and my brother. It reads two text files, one containing a list of played matches, and the other serving as a database of all teams and their player strength statistics that can be selected in FIFA.

## Features

- Reads a file with a list of played matches and stores the results for you and your brother.
- Calculates and stores the points earned by each player based on the match results. The winner receives 3 points, while a draw awards 1 point to each player.
- Maintains a league table that displays the number of matches played, the points earned by each player, and the average strength of the teams played against.

## Installation

1. Clone the repository or download the source code.
2. Open the project in your Java development environment.
3. Compile the Java files to generate the executable application.

## Usage

1. Make sure you have the following two text files:
   - `games.txt`: Contains the list of played matches in the format `teamA,result,teamB`. Be careful not to put any extra spaces and result format should be in example: `3:0`
   - `teams.txt`: Serves as the database of all teams and their player strength statistics.

2. Update the file paths in the application code to point to the correct locations of the `games.txt` and `teams.txt` files.

3. Run the application.

4. The application will read the match data from `games.txt` and calculate the points for each player based on the match results. It will also update the league table accordingly.

5. You can view the league table in the console output or save it to a file for future reference.

6. To add new matches, simply append the match details to the `games.txt` file in the format `teamA,result,teamB` and re-run the application.

## Example Files

### matches.txt

```
teamA,1:2,teamB
teamB,4:3,teamC
teamA,0:5,teamC
```

## Notes

- Make sure the team names in `games.txt` match the team names in `teams.txt` exactly.
- The application assumes that the team names in `teams.txt` are unique.
- You can enhance the application by adding error handling, user input validation, and additional features as per your requirements.

Enjoy your FIFA Statistic Calculator :)


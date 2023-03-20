package Portfolio.Practical_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class FootballLeague {
    private String id;
    private ArrayList<Team> teams;
    private Random random;

    public FootballLeague(String id) {
        this.id = id;
        this.teams = new ArrayList<>();
        this.random = new Random();
    }

    /**
     * Adds a new team to the league. If a team with the same name already exists in the league,
     * a message is printed indicating that the team is already enrolled.
     *
     * @param team the team to be added
     */
    public void addTeam(Team team) {
        for (Team t : teams) {
            if (t.getName().equals(team.getName())) {
                System.out.println("ERROR while enrolling a team. Team already enrolled.");
                return;
            }
        }
        teams.add(team);
    }

    /**
     * Removes a team from the league.
     *
     * @param team the team to be removed
     */
    public void removeTeam(Team team) {
        teams.remove(team);
    }

    /**
     * Determines the winner of a match between two teams in the league randomly. The number of wins,
     * losses, and points of each team are updated accordingly. The teams are then sorted by their number
     * of points and the updated league standings are printed.
     *
     * @param team1 the first team
     * @param team2 the second team
     */
    public void determineMatchOutcomeRandomly(Team team1, Team team2) {
        if (random.nextInt(2) == 0) {
            team1.increaseWins();
            team2.increaseLosses();
        } else {
            team1.increaseLosses();
            team2.increaseWins();
        }
        updatePoints();
        sortTeams();
        printStandings();
    }

    /**
     * Determines the winner of a match between two teams in the league based on the name of the teams.
     * The team with the name that comes first alphabetically is considered the winner. The number of wins,
     * losses, and points of each team are updated accordingly. The teams are then sorted by their number
     * of points and the updated league standings are printed.
     *
     * @param team1 the first team
     * @param team2 the second team
     */
    public void determineMatchOutcomeByName(Team team1, Team team2) {
        if (team1.getName().compareTo(team2.getName()) < 0) {
            team1.increaseWins();
            team2.increaseLosses();
        } else {
            team1.increaseLosses();
            team2.increaseWins();
        }
        updatePoints();
        sortTeams();
        printStandings();
    }

    /**
     * Records a draw between two teams in the league. The number of draws and points of each team are
     * updated accordingly. The teams are then sorted by their number of points and the updated league
     * <p>
     * standings are printed.
     *
     * @param team1 the first team
     * @param team2 the second team
     */
    public void recordDraw(Team team1, Team team2) {
        team1.increaseDraws();
        team2.increaseDraws();
        updatePoints();
        sortTeams();
        printStandings();
    }

    /**
     * Promotes the top three teams from one league to this league and relegates the bottom three teams
     * from this league to the other league.
     *
     * @param otherLeague the other league
     */
    public void promoteAndRelegate(FootballLeague otherLeague) {
        for (int i = 0; i < 3; i++) {
            Team promotedTeam = otherLeague.teams.get(0);
            otherLeague.teams.remove(promotedTeam);
            addTeam(promotedTeam);
            Team relegatedTeam = teams.get(3);
            teams.remove(relegatedTeam);
            otherLeague.addTeam(relegatedTeam);
        }
    }

    /**
     * Sorts the teams in the league by their number of points.
     */
    private void sortTeams() {
        Collections.sort(teams);
    }

    /**
     * Updates the points of each team in the league based on their number of wins, draws, and losses.
     */
    private void updatePoints() {
        for (Team team : teams) {
            team.updatePoints();
        }
    }


    /**
     * Prints the current league standings.
     */
    public void printStandings() {
        System.out.println("FootballLeague: " + id);
        int position = 1;
        for (Team team : teams) {
            System.out.println("\nRanking " + position);
            System.out.println(team);
            position++;
        }
    }
    @Override
    public String toString() {
        String output = "";
        output += "FootballLeague: " + this.id + "\n";
        Integer position = 1;
        for (Team team : this.teams) {
            output += "\nRanking " + position.toString() + "\n";
            output += team;
            position += 1;
        }
        return output;
    }
}
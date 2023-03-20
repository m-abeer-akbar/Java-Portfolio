package Portfolio.Practical_12;
public class Team implements Comparable<Team> {
    private String name;
    private int wins;
    private int draws;
    private int losses;
    private int points;

    public Team(String name) {
        this.name = name;
        this.wins = 0;
        this.draws = 0;
        this.losses = 0;
        this.points = 0;
    }

    /**
     * Returns the name of the team.
     * @return the name of the team
     */
    public String getName() {
        return name;
    }

    /**
     * Increments the number of wins of the team by 1.
     */
    public void increaseWins() {
        wins++;
    }

    /**
     * Increments the number of draws of the team by 1.
     */
    public void increaseDraws() {
        draws++;
    }

    /**
     * Increments the number of losses of the team by 1.
     */
    public void increaseLosses() {
        losses++;
    }

    /**
     * Returns the number of wins of the team.
     * @return the number of wins of the team
     */
    public int getWins() {
        return wins;
    }

    /**
     * Returns the number of draws of the team.
     * @return the number of draws of the team
     */
    public int getDraws() {
        return draws;
    }

    /**
     * Returns the number of losses of the team.
     * @return the number of losses of the team
     */
    public int getLosses() {
        return losses;
    }

    /**
     * Updates the points of the team based on their number of wins, draws, and losses.
     * 3 points are awarded for a win, 1 point for a draw, and 0 points for a loss.
     */
    public void updatePoints() {
        points = wins * 3 + draws;
    }

    /**
     * Returns the number of points of the team.
     * @return the number of points of the team
     */
    public int getPoints() {
        return points;
    }

    /**
     * Compares this team to another team based on their number of points.
     * @param other the other team
     * @return a negative integer if this team has fewer points, zero if both teams have the same number of points,
     * or a positive integer if this team has more points
     */
    @Override
    public int compareTo(Team other) {
        return other.points - points;
    }

    /**
     * Returns a string representation of the team including their name, number of wins, draws, losses, and points.
     * @return a string representation of the team
     */
    @Override
    public String toString() {
        return "Team: " + name + "\nWins: " + wins + "\nDraws: " + draws + "\nLosses: " + losses + "\nPoints: " + points;
    }
}
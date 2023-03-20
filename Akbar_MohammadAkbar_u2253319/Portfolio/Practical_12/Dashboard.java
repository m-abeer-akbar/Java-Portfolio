package Portfolio.Practical_12;
import java.util.Scanner;

public class Dashboard {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Create two football leagues
        FootballLeague premierLeague = new FootballLeague("Premier League");
        FootballLeague championship = new FootballLeague("Championship");

        // Create some teams to assign them later to the Premier League
        Team Liverpool = new Team("Liverpool");
        Team Manchester_City = new Team("Manchester City");
        Team Leicester_City = new Team("Leicester City");
        Team Chelsea = new Team("Chelsea");
        Team Manchester_United = new Team("Manchester United");
        Team Tottenham = new Team("Tottenham");

        // Create some teams to assign them later to the Championship
        Team Leeds_United = new Team("Leeds United");
        Team West_Bromwich_Albion = new Team("West Bromwich Albion");
        Team Fulham = new Team("Fulham");
        Team Brentford = new Team("Brentford");
        Team Nottingham_Forest = new Team("Nottingham Forest");
        Team Huddersfield_Town = new Team("Huddersfield Town");

        // Add some teams to the premier league
        premierLeague.addTeam(Liverpool);
        premierLeague.addTeam(Manchester_City);
        premierLeague.addTeam(Leicester_City);
        premierLeague.addTeam(Chelsea);
        premierLeague.addTeam(Manchester_United);
        premierLeague.addTeam(Tottenham);

        // Add some teams to the championship
        championship.addTeam(Leeds_United);
        championship.addTeam(West_Bromwich_Albion);
        championship.addTeam(Fulham);
        championship.addTeam(Brentford);
        championship.addTeam(Nottingham_Forest);
        championship.addTeam(Huddersfield_Town);

        // Play some matches
        premierLeague.determineMatchOutcomeRandomly(Liverpool,Manchester_City);
        premierLeague.determineMatchOutcomeRandomly(Leicester_City,Chelsea);
        premierLeague.determineMatchOutcomeRandomly(Manchester_United,Tottenham);

        // Relegation
        premierLeague.promoteAndRelegate(championship);
        System.out.println("\n\n-AFTER RELEGATION-\n\n");
        System.out.println(premierLeague);
        System.out.println(championship);




    }
}

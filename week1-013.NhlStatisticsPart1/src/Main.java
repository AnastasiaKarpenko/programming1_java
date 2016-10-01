
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals");
        System.out.println(" ");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println(" ");
        
        System.out.println("Top 25 by penalties");
        System.out.println(" ");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println(" ");
        
        System.out.println("Statistics of Sidney Crosby");
        System.out.println(" ");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println(" ");
        
        System.out.println("Print statistics of Philadelphia Flyers");
        System.out.println(" ");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        System.out.println(" ");
        
        System.out.println("Print the players in Anaheim Ducks ordered by points");
        System.out.println(" ");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
        System.out.println(" ");
        
    }
}

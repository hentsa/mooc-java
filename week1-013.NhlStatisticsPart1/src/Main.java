import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args)           {
        Scanner reader = new Scanner (System.in);
        
        System.out.println("Top ten players");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
       
        System.out.println(" ");
        
        System.out.println("Top 25 Players");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println(" ");
        System.out.println("Statistics of Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
       
        System.out.println(" ");
        System.out.println("Statistics of Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
       
        System.out.println(" ");
        System.out.println("Statistics of Anaheim Ducks ordered by points");
        
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
      
        
    }

    }


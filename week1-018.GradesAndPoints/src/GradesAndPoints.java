
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the points [0-60]: ");
        int points1 = Integer.parseInt(reader.nextLine());
        
        if (points1 <= 29) {
            System.out.println("Failed");
        } else if (points1>29 && points1 <35) {
            System.out.println("Grade: 1");
        } else if (points1 >34 && points1 < 40) {
            System.out.println("Grade: 2");
        } else if (points1 >39 && points1 < 45) {
            System.out.println("Grade: 3");
        } else if (points1 >44 && points1 < 50) {
            System.out.println("Grade: 4");
        } else {
            System.out.println("Grade: 5");
        } 
        
    }
}

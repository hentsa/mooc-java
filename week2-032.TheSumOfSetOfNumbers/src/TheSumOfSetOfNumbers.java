
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        
    int n = 0;
    int sum = 0;
    
    
    System.out.println("Until What? ");
    int number = Integer.parseInt(reader.nextLine());
    while (n<=number) {
        sum = sum + n;
        n++;
     }    
    System.out.println("Sum is " + sum);
    
    
    
    }
    }
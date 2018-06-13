
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int n = 0;
        int sum = 0;
        int result = 0;
       
        
        System.out.println("Type a number: ");
        int power = Integer.parseInt(reader.nextLine());
        
       while (n<=power) {
         Math.pow(2, n);
         result = (int)Math.pow(2, n);
         sum = sum + result;
         n++;
         
       }
        System.out.println("The result is " + sum);
    }
}

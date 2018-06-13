
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
       
        System.out.print("The bigger number of the two numbers given was: " + Math.max(number2, number1));
    }
}

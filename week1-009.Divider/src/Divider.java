
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

         System.out.print("Type a number: ");
        double number1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        double number2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Division:" + number1 + " / " + number2 + " = " + ((double)number1/number2));
    }
}

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int n = 1;
        int factorial = 1;
        
        System.out.println("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        
        while (n<=number1) {
          factorial *=n;
          n++;
         
        }
        System.out.println("Factorial is " + factorial);
    }
}



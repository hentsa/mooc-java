import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int i = name.length();
        int n= i -1;
        System.out.print("In reverse order: ");
        
        while (n>= 0) {
        
        System.out.print(name.charAt(n));
        i--;
        n--;
        
        
    }
        System.out.println("");
}
}


import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int i = text.length();
        int n= i -1;
        String sana = "";
        
        while (n>= 0) {
        
        sana+=text.charAt(n);
        n--;
        }
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        return sana;
    
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}

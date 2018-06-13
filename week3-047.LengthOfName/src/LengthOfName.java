
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        int i= calculateCharacters(name);
        System.out.println("Number of characters: " + i);
        // call your method from here
    }
    
// do here the method
     public static int calculateCharacters(String text) {
         int length = text.length();
         return length;
             
     }
}

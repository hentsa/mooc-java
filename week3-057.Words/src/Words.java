import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String name = "abc";
        
        while (name.length()> 0) {
        System.out.print("Type a word: ");
        name = reader.nextLine(); 
        
        words.add(name); 
        
    }
        System.out.println("You typed the following words:");
        for (String w : words) {
            System.out.println( w );
        }
       
        }
            
}

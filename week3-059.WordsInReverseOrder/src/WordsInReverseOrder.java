import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word = "abc";
        
        while (word.length()>0) {
            System.out.print("Type a word: ");
            word = reader.nextLine();
            words.add(word);
        }
        
        System.out.println("You typed the following words:");
        Collections.reverse(words);
        
        for (String w : words) {
            System.out.println(w);
        }
    }
}
        // create here an ArrayList
    

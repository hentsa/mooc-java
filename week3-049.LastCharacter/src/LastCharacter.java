import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a name: ");
        String name = reader.nextLine();
        System.out.println("Last character: " + lastCharacter(name));
    }
    
    public static char lastCharacter(String text) {
        int length=text.length();
        char last = text.charAt(length -1);
        return last;
        
    }
}



import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int i = 1;
        int n=0;
        
        while (n< name.length()) {
        System.out.println( i + ". character: " + name.charAt(n));
        i++;
        n++;
    }
    }
}

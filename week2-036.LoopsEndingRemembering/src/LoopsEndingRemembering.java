import java.util.Scanner;


public class LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        
        System.out.println("Type numbers: ");
        int number = 0;
        int sum = 0;
        int count = 0;
        double average=0;
        int odd=0;
        int even=0;
        
        while (number != -1) {
            number = Integer.parseInt(reader.nextLine());
            sum +=number;
            count++;
              if (number%2 !=0) {
                  odd++;
              }else{
                  even++;
              }
           
        }
        count = count -1;
        sum = sum +1;
        average=(double)sum/count;
        odd= odd-1;
          
        
          System.out.println("Thank you and see you later!"); 
          System.out.println("The sum is " + sum);
          System.out.println("How many numbers: " + count);
          System.out.println("Average: "+ average);
         System.out.println("Even numbers: " + even);
         System.out.println("Odd numbers: " + odd);
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        
    }
}

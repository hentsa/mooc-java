
public class Least {

    public static int least(int number1, int number2) {
        // write program code here
        // do not print anything inside the method
        // method needs a rturn in the end
        if (number1 == number2) {
            return number1;
            }   
        else {
            return(Math.min(number1, number2));
        }
       
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}

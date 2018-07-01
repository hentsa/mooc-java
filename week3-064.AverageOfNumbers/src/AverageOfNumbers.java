
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static double sum(ArrayList<Integer> list) {
        double summa = 0;
        
        
        for (double a : list) {
            summa = summa +a;
        }
        return summa;
    }
    

    public static double average(ArrayList<Integer> list) {
        int size = list.size();
        double average =sum(list)/size; 
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
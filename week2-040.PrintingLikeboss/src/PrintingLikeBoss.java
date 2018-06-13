public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i=0;
        while(i<amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int w=0;
        while (w<amount) {
            System.out.print(" ");
            w++;
        }
        // 40.1
    }

    public static void printTriangle(int size) {
        int i=1;
        int w=size-1;
        
        while(i<=size) {
          printWhitespaces(w);
          printStars(size-w);
          w--;
          i++;  
       
        }
        
       
        // 40.2
    }

    public static void xmasTree(int height) {
        int i=1;
        int w=height-1;
        int n=0;
        while(n<height) {
          printWhitespaces(w);
          printStars(i);
          w--;
          i=i+2;
          n++;
    }
       i=3;
       w=height-2;
         int m=0;
        while (m<2) {
           printWhitespaces(w);
           printStars(i);
            m++;
         
        }
             
    }
     public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        //printTriangle(3);
        //System.out.println("---");
        //xmasTree(5);
        //System.out.println("---");
        xmasTree(10);
    }
}

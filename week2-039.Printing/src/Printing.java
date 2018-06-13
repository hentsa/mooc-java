public class Printing {

    public static void printStars(int amount) {
        int i=0;
        while (i<amount) {
            i++;
        System.out.print("*");
        }
        System.out.println("");
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times        
    }
    
    
        public static void printSquare(int sideSize) {
        int i=0;
        while (i<sideSize) {
           printStars(sideSize);
            i++;
            
        }
            System.out.println("");
        // 39.2
    }

    public static void printRectangle(int width, int height) {
        
        int n=0;
        while ( n<height) {
            printStars(width);
     
            n++;
        }
        System.out.println("");
        // 39.3
    }

    public static void printTriangle(int size) {
       
       int i=1;
        while (i<=size) {

            printStars(i);
           i++;
       
        }
        
        System.out.print("");
       
        // 39.4
    }

       public static void main(String[] args) {
        //printStars(5);
       // printStars(3);
        //printStars(9);
        //printSquare(6);
      //printRectangle(6,3);
      printTriangle(4);
       
        
  
    }
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

       printStars(3);
       System.out.println("\n---");  // printing --- to separate the figures
       printSquare(4);
       System.out.println("\n---");
       // printRectangle(5, 6);
        //System.out.println("\n---");
        //printTriangle(3);
        //System.out.println("\n---");
    }



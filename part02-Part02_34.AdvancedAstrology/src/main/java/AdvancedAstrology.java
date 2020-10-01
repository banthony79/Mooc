
public class AdvancedAstrology {

   public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
   }


    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++){
            printStars(i);  
            for (int j = size; j >= i; i++) { 
                printSpaces(j);
            } 
              
        }
    }
    public static void christmasTree(int height) {
       printTriangle(height);
        System.out.println("***");
        System.out.println("***");
       
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

       // printTriangle(5);
        //System.out.println("---");
        //christmasTree(4);
        //System.out.println("---");
        //christmasTree(10);
        
        printTriangle(4); 
    }
}

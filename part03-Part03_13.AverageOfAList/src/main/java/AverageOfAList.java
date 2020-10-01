
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Double> numList = new ArrayList<>(); 
        
        double inputNumber = 0; 
        while (true) {
        if (inputNumber ==  -1) {
            break; 
        } else {
        inputNumber = Double.valueOf(scanner.nextLine());
        numList.add(inputNumber);     
        }
        }
        
        numList.remove(numList.size() -1); 
    
        double sum = 0; 
        for (Double num: numList) {
            sum = sum + num; 
        }
        
        //for (Double num: numList) {
        //   System.out.println(num);
        //}
        
       // System.out.println("size of List " + numList.size());
        
        double avg = (sum/numList.size()); 
        
      
        System.out.println("Average: " + avg); 
    }
    
    //5
//22
//-11
//-140
//-18
//-1
}

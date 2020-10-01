
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0; 
        ArrayList<Integer> numbers = new ArrayList<>(); 
        for (int i = 0; i < 1000; i++) {
            inputNumber = Integer.valueOf(scanner.nextLine());
            numbers.add(inputNumber); 
            if (inputNumber == 9999) {
                smallestNumber(numbers); 
                break; 
            }
        }       
    }
    
    
    public static void smallestNumber(ArrayList<Integer> numList) {
        int smallestNumber = numList.get(0);int indexNumber = 0; 
        for (int i = 0; i < numList.size(); i++) {   
            if (numList.get(i) < smallestNumber) {
                smallestNumber = numList.get(i); 
                indexNumber = i; 
                
            }
        
            }
       
        System.out.println("Smallest number: " + smallestNumber);
        System.out.println("Found at index: " + indexNumber);
    
    }
    
    
    }


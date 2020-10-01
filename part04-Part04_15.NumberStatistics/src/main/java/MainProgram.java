
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Statistics totalSum = new Statistics();
        Statistics evenNumber = new Statistics(); 
        Statistics oddNumber = new Statistics(); 
        
        
        Scanner scanner = new Scanner(System.in);
        int number = 0; int sumOfOddNumbers = 0; 
        int sumOfEvenNumbers = 0; 
        System.out.println("Enter numbers:");
        while(true) {
          number = Integer.valueOf(scanner.nextLine());
          if (number == -1) {
              break; 
          }
          
          totalSum.addNumber(number);
          
          if (number % 2 == 0) {
             evenNumber.addNumber(number);  
          } else {
             oddNumber.addNumber(number);
          }
          
        }
        
        System.out.println("Sum: " + totalSum.sum());
        System.out.println("Sum of even numbers: " + evenNumber.sum());
        System.out.println("Sum of odd numbers: " + oddNumber.sum());
    }
}

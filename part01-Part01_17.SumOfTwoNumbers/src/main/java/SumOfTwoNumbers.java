
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine()); 
        
        System.out.println("The sum of the numbers is "+ (num1 + num2));

        //Give the first number:
//8
//Give the second number:
//3
//The sum of the numbers is 11// Write your program here

    }
}

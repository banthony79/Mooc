
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextInt());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextInt());
        System.out.println("Give the third number:");
        int num3 = Integer.valueOf(scanner.nextInt());
        double sum = num1 + num2 + num3;  
        double average = sum /3; 
        System.out.println("The average is " + average);

    }
}

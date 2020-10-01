
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String stringInput = scan.nextLine(); 
        System.out.println("Give an integer:");
        int intInput = Integer.valueOf(scan.nextLine()); 
        System.out.println ("Give a double:");
        double doubleInput = Double.valueOf(scan.nextLine()); 
        System.out.println("Give a boolean:");
        boolean booleanInput = Boolean.valueOf(scan.nextLine()); 
        System.out.println("You gave the string " + stringInput);
        System.out.println("You gave the integer " + intInput);
        System.out.println("You gave the double " + doubleInput);
        System.out.println("You gave the boolean " + booleanInput);
        
        
        // Write your program here

        
//Give a string:
//Oops!
//Give an integer:
//-4
//Give a double:
//3200.1
//Give a boolean:
//false
//You gave the string Oops!
//You gave the integer -4
//You gave the double 3200.1
//You gave the boolean false
    }
}

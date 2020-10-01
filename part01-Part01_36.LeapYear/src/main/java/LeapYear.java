
import java.util.Scanner;

public class LeapYear {
    
    //A year is a leap year if it is divisible by 4. However, if the 
    //year is divisible by 100, then it is a leap year only when it is also divisible by 400.
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("The year is a leap year");
            } else {
                System.out.println("The year is not a leap year");
            }
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}


import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int amount = Integer.valueOf(scan.nextLine()); 
        if (amount < 5000) {
            System.out.println("No tax!");
        } else if (amount > 4999 && amount <= 25000){
            amount = amount - 5000; 
            double taxes = 100 + (amount * .08); 
            System.out.println("Tax: " + taxes);
        } else if (amount > 25000 && amount <= 55000) {
            amount = amount - 25000; 
            double taxes = 1700 + (amount * .1); 
            System.out.println("Tax: " + taxes);
        } else if (amount > 55000 && amount <= 200000) {
            amount = amount - 55000;
            double taxes = 4700 + (amount * .12);
            System.out.println("Tax: " + taxes);
        } else if (amount > 200000 && amount <= 1000000) {
            amount = amount - 200000; 
            double taxes = 22100 + (amount * .15);
            System.out.println("Tax: " + taxes);
        } else if (amount > 1000000) {
            amount = amount - 1000000; 
            double taxes = 142100 + (amount * .17);
            System.out.println("Tax: " + taxes);
        
        }
        

    }
}

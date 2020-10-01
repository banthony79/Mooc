
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AgeOfTheOldest {

     public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<>(); 
        Scanner reader = new Scanner(System.in);
int sum = 0;
int count = 0;

while (true) {
    String input = reader.nextLine();
    if (input.equals("")) {
        break;
    }

    String[] parts = input.split(",");
    int age = Integer.valueOf(parts[1]); 
    ages.add(age); 
}


      
            
    System.out.println("Age of the oldest: " + Collections.max(ages));
          
        
        }
       

    }
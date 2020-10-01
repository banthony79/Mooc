
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0; 
        while(true) {
            count++; 
            String thing = scanner.nextLine();
            
            if (thing.equals("end")) {
              break;   
            }
            
           
        }
        
        System.out.println(count - 1);
    }
}

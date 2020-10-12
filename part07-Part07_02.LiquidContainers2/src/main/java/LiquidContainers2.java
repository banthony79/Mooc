
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
 
    Scanner scan = new Scanner(System.in);
    
        Container container = new Container(); 
        Container secondContainer = new Container(); 
        

        while (true) {
            
            System.out.println("First: " + container);
            System.out.println("Second: " + secondContainer);
            
            String [] word = new String[1]; 
            String input = scan.nextLine(); 
            if (input.equals("quit")) {
                break; 
            }
            word = input.split(" "); 
            int num = Integer.valueOf(word[1]); 
            String selection = word[0].toLowerCase(); 
            
            if (selection.equals("add") && num > 0) {
                container.add(num);
            }
       
            
            if (selection.equals("move") && num > 0) { 
               int contents = container.contains(); 
                if (contents >= num) {
                container.remove(num); 
                secondContainer.add(num); 
                } else {
                    container.remove(contents);
                    secondContainer.add(contents); 
                }
            }
    
            
            if (selection.equals("remove") && num > 0) {
                secondContainer.remove(num);
            }
             
        }
    }
}

    
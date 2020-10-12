
import java.util.Scanner;

public class LiquidContainers {
    
   
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contents = 0; 
        int secondContents = 0; 

        while (true) {
            
            System.out.println("First: " + contents + "/" + "100");
            System.out.println("Second: " + secondContents + "/" + "100");
            
            String [] word = new String[1]; 
            String input = scan.nextLine(); 
            if (input.equals("quit")) {
                break; 
            }
            word = input.split(" "); 
            int num = Integer.valueOf(word[1]); 
            String selection = word[0].toLowerCase(); 
            
            if (selection.equals("add") && num > 0) {
                if (contents + num <= 100) {
              contents = contents + num; 
                } else {
                    contents = 100; 
                }
            }
            
            if (selection.equals("move") && num > 0) {
                if (secondContents + num <= 100  && contents > 0) {
                    //if (contents - num < 0) {
                   //     secondContents = contents; 
                    //}
                    secondContents = secondContents + num; 
                    if (contents - num > 0) {
                    contents = contents - num;
                    
                    } else {
                        secondContents = contents; 
                        contents = 0; 
                        
                    }
                    
                } else {
                    secondContents = 100; 
                }
            }
            
            if (selection.equals("remove") && num > 0) {
                if (secondContents - num > 0) {
                    secondContents = secondContents - num; 
                } else {
                    secondContents = 0; 
                }
            }
             
            }

        }
    }



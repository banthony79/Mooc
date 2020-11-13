
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class UserInterface {
    
    private Scanner scanner; 
    private BirdDatabase directory; 
    
    
    public UserInterface(Scanner scanner, BirdDatabase directory) {
       
        this.scanner = scanner; 
        this.directory = directory; 
    
    }
    
    public void start() {
        
        boolean quit = false;
        
        while(!quit) {
            System.out.println("?"); 
            String choice = scanner.nextLine();   
            switch(choice) {
                case "Add":
                    add(); 
                    break; 
                    
                case "Observation":
                    observation(); 
                    break;
                    
                case "All":
                    directory.listBirds();
                    break; 
                    
                case "One":
                    one(); 
                    break; 
                    
                case "Quit":
                    quit = true; 
                    break; 
                    
                
                
            }
            
        }
        
    }
    
    public void add() {
        System.out.println("Name:");
        String input = scanner.nextLine();
        System.out.println("Name in Latin:");
        String bird = scanner.nextLine(); 
        directory.addBird(input, bird);
        
    }
    
    
    public void observation() {
       System.out.println("Bird?");
       String bird = scanner.nextLine(); 
       Bird foundBird = directory.findBird(bird);    
       if (foundBird != null) {
           foundBird.observe(); 
       } else {
   System.out.println("Not a bird!"); 
       }
    }
    
    
    public void one() {
        System.out.println("Bird?");
        String bird = scanner.nextLine(); 
        Bird foundBird = directory.findBird(bird);
        
        if (foundBird != null) {
            System.out.println(foundBird);
        }
    }
    
    
    
}
    
    

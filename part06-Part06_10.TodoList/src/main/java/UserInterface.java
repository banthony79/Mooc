
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
    
    private TodoList list; 
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner; 
        this.list = list; 
    }
    
    public void start() {
        boolean quit = false;  
        while(!quit) {
            System.out.println("Command:");
            String command = scanner.nextLine(); 
            
            switch(command) {
               
                case "add": {
                    add(); 
                    break;
                }
                case "list": {
                    list(); 
                    break; 
                }
                case "remove": {
                    remove(); 
                    break; 
                }
                case "stop": {
                    quit = true;   
                }
            }
           
        }
        
        
}
    
    public void add() {
        System.out.println("To add:");
        String add = scanner.nextLine(); 
        list.add(add); 
    }
    
    public void list() {
       list.print();
    }
    
    public void remove() {
        System.out.println("Which one is removed?");
        int choice = Integer.valueOf(scanner.nextLine()); 
        list.remove(choice);
    }
    
    
    
    
    
}

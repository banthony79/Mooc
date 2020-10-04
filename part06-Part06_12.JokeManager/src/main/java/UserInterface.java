
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
    
    
    private JokeManager manager; 
    private Scanner scanner; 
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager; 
        this.scanner = scanner;
        
    }
    
    public void start() {
        
        boolean quit = false; 
        while(!quit) {
        menu();
        String choice = scanner.nextLine(); 
        switch(choice) {
            case "1":
                addJoke(); 
                break;
            case "2":
                drawJoke();
                break;
            case "3":
                listJokes();
                break;
            case "X":
                quit = true; 
                 
        } 
        }
    }
    
    public void menu() {
        System.out.println("Commands");
        System.out.println("1 - add a joke " + "\n" + "2 - draw a joke" + "\n" + "3 - list jokes" + "\n" + "X - stop"); 
    }
    
    private void addJoke()  {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine(); 
        manager.addJoke(joke);
    }
    
    private void drawJoke() {
        String drawnJoke = manager.drawJoke(); 
        System.out.println(drawnJoke);
    }
    
    private void listJokes() {
        System.out.println("Printing the jokes.");
        manager.printJokes();
    }
    
    
    
}

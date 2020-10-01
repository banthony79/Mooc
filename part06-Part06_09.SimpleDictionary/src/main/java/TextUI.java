
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
public class TextUI {
    
    private Scanner scanner; 
    private SimpleDictionary dictionary; 
    
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner; 
        this.dictionary = dictionary; 
    }
    
    public void start() {
        
        while(true) {
        System.out.println("Command:");
        String command = scanner.nextLine(); 
        if (command.equals("end")) {
            end();
            break; 
        } else if (command.equals("add")) {
            add(); 
        } else if (command.equals("search")) {
            search(); 
        } else {
            unknown(); 
        }
    }
        
    }
    
    
    private void search() {
        System.out.println("To be translated:");
        String searchWord = scanner.nextLine(); 
        if(wordSearch(searchWord)) {
            System.out.println("Translation: " + dictionary.getDictionary().get(searchWord)); 
        } else {
            System.out.println("Word " + searchWord + " was not found"); 
        }
        
    }
    
    private boolean wordSearch(String word) {
        if (dictionary.getDictionary().containsKey(word)) {
            return true; 
        }
    return false; }
    
    
    private void add() {
       System.out.println("Word:");
       String word = scanner.nextLine(); 
        if (word.equals("end")) {
            end();  
        }
        System.out.println("Translation:");
        String translation = scanner.nextLine(); 
        dictionary.add(word, translation);
        
        
    }
    
    private void end() {
        System.out.println("Bye bye!");
    }
    
    private void unknown() {
        System.out.println("Unknown command");
       
    }
    
}

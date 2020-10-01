
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class Suitcase {
    
    private ArrayList<Item> contents; 
    private int maxWeight; 
    
    
    public Suitcase(int weight) {
        this.contents = new ArrayList<>(); 
        this.maxWeight = weight; 
    }
    
    
    public void addItem(Item item) {
        if (totalWeightCheck(item) <= this.maxWeight) {
        contents.add(item); }
    }
    
    public int totalWeight() {
        int sum = 0; 
        for (Item item: contents) {
            sum+=item.getWeight(); 
        } 
    return sum; }
    
    
     public int totalWeightCheck(Item item) {
        int sum = 0; 
        sum = totalWeight() + item.getWeight(); 
    return sum; }
     
     public String toString() {
         if (getCount() == 1) {
             return getCount() + " item (" + totalWeight() + " kg )"; 
         }
         if (getCount() == 0) {
             return "no items (0 kg)"; 
         }
         return getCount() + " items (" + totalWeight() + " kg )"; 
         
         
     }
     
     public int getCount() {
         return contents.size();      
        
     }
     
     public void printItems() {
         for (Item item: contents) {
             System.out.println(item);
         }
     }
     
     public Item heaviestItem() {
         int heaviest = 0; Item heaviestItem = null;  
          for (Item item: contents) {
              if (item.getWeight() > heaviest) {
                  heaviest = item.getWeight(); 
                  heaviestItem = item; 
                  
             }
          }
          
          if (getCount() == 0) {
              return null; 
          }
    
     return heaviestItem; }
    
    
   
}


//for (String word: elements) {
          //  if (word.length() > longest) {
            //    longest = word.length(); 
              //  longestString = word; 

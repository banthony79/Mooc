
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
public class Package {
    
    private ArrayList<Gift> contents;
    
    
    public Package() {
       this.contents = new ArrayList<>(); 
    }
    
    
    public void addGift(Gift gift) { 
        contents.add(gift);
        
    }
    
    
    public int totalWeight() {
        int sum = 0; 
        for (Gift gift: contents) {
            sum+=gift.getWeight(); 
        } 
    return sum; }
    
    
    
    
}

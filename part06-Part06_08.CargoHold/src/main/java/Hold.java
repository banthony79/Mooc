
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
public class Hold {
    
    private ArrayList<Suitcase> cargoHold; 
    private int maxWeight; 
    
    public Hold(int weight) {
        this.cargoHold = new ArrayList<>(); 
        this.maxWeight = weight; 
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeightCheck(suitcase)) {
            cargoHold.add(suitcase); 
        }
    }
    
    public int totalWeight() {
        int weight= 0; 
        for (Suitcase suitcase: cargoHold) {
            weight+=suitcase.totalWeight(); 
        }
    return weight; }
    
    public boolean totalWeightCheck(Suitcase suitcase) {
       int totalWeight = totalWeight() + suitcase.totalWeight(); 
       if (totalWeight <= maxWeight) {
    return true; }
    return false; 
    }
    
    public String toString() {
         if (getCount() == 1) {
             return getCount() + " suitcase (" + totalWeight() + " kg )"; 
         }
         return getCount() + " suitcases (" + totalWeight() + " kg )"; 
     }
    
    public int getCount() {
        return cargoHold.size(); 
    }
    
    public void printItems() {
        for (Suitcase suitcase: cargoHold) {
            suitcase.printItems();
        }
    }
    
}

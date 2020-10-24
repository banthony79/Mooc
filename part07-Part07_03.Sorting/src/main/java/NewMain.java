/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class NewMain {
    
   public static int indexOfSmallestFrom(int [] table, int index) {
    int min = table[index];
    int indexFrom = index; 
    for (int i = index; i < table.length; i++) {
        if (table[i] < min) { 
            min = table[i];
               indexFrom = i;
        }
    }
return indexFrom; }
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] array = {-1, 3, 1, 7, 4, 1, 2, 4, 3}; 
        
       System.out.println(indexOfSmallestFrom(array, 2)); 
    }
    
}

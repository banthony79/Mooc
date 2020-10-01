
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
public class Stack {
    
    private ArrayList <String> stackList;
    
    public Stack () {
        this.stackList = new ArrayList<>(); 
    }
    
    public boolean isEmpty() {
        if (stackList.isEmpty()) {
            return true; 
        }
    return false; 
    }
    
   public void add(String value) {
       stackList.add(value);
   }
   
   public ArrayList<String> values(){
       return this.stackList; 
       
   }
   
   public String take() {
       String str = stackList.get(stackList.size() - 1); 
       stackList.remove(stackList.size() -1); 
  return str; 
   }
   
   
    
   
   
    
    
}

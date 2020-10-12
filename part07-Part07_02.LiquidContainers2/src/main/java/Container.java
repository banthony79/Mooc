/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class Container {
    
  private int contents; 
  
 public Container() {
     this.contents = 0; 
 }
   
  public int contains() {
     return contents;  
  }
  
  public void add(int amount) {
      int total = this.contents + amount; 
     
      if (aboveZero(amount)) {
          if (!above100(total)) {
     this.contents = total; 
      } else {
          this.contents = 100; 
          }
      }
  }
  
  public void remove(int amount) {
      if (aboveZero(amount)) {
          if (aboveZero(this.contents - amount)) {
          this.contents = contents - amount; 
          } else {
              this.contents = 0; 
          }
      }
      
  }
  
  
  public String toString() {
      return this.contents + "/100"; 
  }
  
  
  private boolean aboveZero(int number) {
      if (number > 0) {
          return true; 
         
      }
  return false; 
  }
  
  private boolean above100(int number) {
      if (number > 100) {
          return true; 
      }
  return false; 
  }
  
}

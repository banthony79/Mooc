/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class Item {
    
  private String name; 
  private String ID; 
  
  public Item(String name, String ID) {
    this.name = name; 
    this.ID = ID; 
  }
  
  public String getName() {
    return this.name; 
  }
  
  public String getID() {
    return this.ID;
  }
  
  public boolean equals(String itemID) {
    if (this.ID.equals(itemID)) {
      return true; 
    }
 return false;  }

  
}
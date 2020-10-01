
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    
 
  
 
  
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in); 
    ArrayList <Item> itemList = new ArrayList<>(); 
    
    while(true) {
      
      System.out.println("Identifier? (empty will stop)"); 
      
      String itemID = scanner.nextLine(); 
      
      if (itemID.isEmpty()) {
        break; 
      }
        
        
      System.out.println("Name? (empty will stop)"); 
      
      String itemName = scanner.nextLine(); 
      
      if (itemName.isEmpty()) {
        break; 
      }
      
      
      if (!checkDuplicate(itemID, itemList)) {
        itemList.add(new Item(itemName, itemID)); 
      }
      
    }
    
    System.out.println("==Items==");
    for (int i = 0; i < itemList.size(); i++) {
        Item item = itemList.get(i); 
        System.out.println(item.getID() + ": " + item.getName()); 
    }
    
    }
    
  
  
	public static boolean checkDuplicate(String ID, ArrayList <Item> list) {
      for (int i = 0; i < list.size(); i++) {
          Item checkedItem = list.get(i); 
          if (checkedItem.equals(ID)) {
          return true; 
        }
      }
   return false;  }
    
    
    
  }
  
  
    
  
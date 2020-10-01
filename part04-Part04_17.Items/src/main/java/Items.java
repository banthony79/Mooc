
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Item newItem; String itemName = ""; 
        
        while (true) {
            
            itemName = scanner.nextLine(); 
            
            if (itemName.equals("")) {
                break; 
            }
            
            newItem = new Item(itemName); 
            items.add(newItem); 
            
        }
        
        for (Item item: items) {
            System.out.println(item);
        }

    }
}

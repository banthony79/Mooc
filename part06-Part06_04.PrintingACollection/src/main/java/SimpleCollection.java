
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
   public boolean overOne() {
       if (this.elements.size() > 1) {
           return true; 
       }
  return false;
   }
    
    
    
    public String toString() {
        String statement = "The collection " + this.name + " has " + elements.size() + " element";
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty."; 
        }
        
    if (overOne()) {
        System.out.println(statement + "s:");
    } else {
        System.out.println(statement + ":");
    }
    String phrase = "";
   
        for (int i = 0; i < elements.size(); i++) {
            if (i  != elements.size() - 1) {
        phrase = phrase + elements.get(i) + "\n"; 
        } else {
        phrase = phrase + elements.get(i); 
     
        }
    
    }
  return phrase;
    }
    
        
}



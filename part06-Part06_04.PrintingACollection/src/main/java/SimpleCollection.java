
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
    String print = "";
String element = "";
int i = 0;
if (this.elements.isEmpty()) {
return print + "The collection " + this.name + " is empty.";
}
for (String string: elements) {
element = element + string.trim() + "\n";
i++;
}
if (i==1) {
return print + "The collection " + this.name + " has " + i + " element:\n" + element.trim();
}
return print + "The collection " + this.name + " has " + i + " elements:\n" + element.trim();
 
}
}

// return printOutput + "\n" +
            //"on the ride:\n" + peopleOnRide;
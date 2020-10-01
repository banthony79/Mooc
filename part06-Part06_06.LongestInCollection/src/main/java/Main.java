
public class Main {

    public static void main(String[] args) {


        // Try out your class here
        SimpleCollection c = new SimpleCollection("characters");
        System.out.println("Pisin: " + c.longest());
        
        c.add("long");
        c.add("longer");
        c.add("short");
        
        System.out.println("Longest: " + c.longest());

        
    }
}

//ComparisonFailure: When the strings "long", "longer", ja "short" 
//have been added to the collection, the longest method should 
//return the string "longer". Now the method returned: short expected:<[longer]> but was:<[short]>
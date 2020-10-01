import java.util.ArrayList; 
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine(); 
        //lily, age: 3 years
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            
            while(fileScanner.hasNextLine()) {
                String input = fileScanner.nextLine(); 
                String [] parts = input.split(","); 
                int age = Integer.valueOf(parts[1]);
                String name = parts[0]; 
                if (age != 1) {
                names.add(name + ", age: " + age + " years"); 
                } else {
                names.add(name + ", age: " + age + " year");     
                }
                
            }
            
        } catch (Exception e) {
            System.out.println("Error.");
        }
        
        for (String person: names) {
            System.out.println(person);
        }

    }
}

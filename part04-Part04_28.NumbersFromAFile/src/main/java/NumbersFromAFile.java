
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList; 

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> numbers = new ArrayList<>(); 
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()) {
                int number = Integer.valueOf(fileScanner.nextLine());
                numbers.add(number); 
            }
            
        } catch (Exception e) {
                System.out.println("Error:" + e.getMessage());
                }
        
        int count = 0; 
        for (Integer number: numbers) {
            if (number >= lowerBound && number <= upperBound) {
                count++; 
                
            }
        }
        
        System.out.println("Numbers: " + count);

    }
    
    
    
}
    
    
 



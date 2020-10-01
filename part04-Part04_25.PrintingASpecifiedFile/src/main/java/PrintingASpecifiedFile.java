
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
      
       
        String fileChoice = scanner.nextLine(); 
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileChoice))) {
            while(fileScanner.hasNextLine()) {
                String words = fileScanner.nextLine(); 
                System.out.println(words);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
                

    }
}

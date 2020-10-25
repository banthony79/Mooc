
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Grades report = new Grades(); 
        
        UserInput ui = new UserInput(scanner, report); 
        
        ui.start();
    }
}

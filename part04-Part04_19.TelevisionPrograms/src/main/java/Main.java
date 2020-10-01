import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String movieName = null; int movieDuration = 0; 
        
        while(true) {
            
           
            
            System.out.println("Name:");
            movieName = scanner.nextLine();
             if (movieName.equals("")) {
                break; 
            }
            System.out.println("Duration:");
            movieDuration = Integer.valueOf(scanner.nextLine()); 
            
            programs.add(new TelevisionProgram(movieName, movieDuration)); 
            
        }
        
        System.out.println("Program's maximum duration?");
        int max = Integer.valueOf(scanner.nextLine()); 
        
        for (TelevisionProgram program: programs) {
            if (program.getDuration() <= max) {
                System.out.println(program); 
            }
        }

    }
}

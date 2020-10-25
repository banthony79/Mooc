
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class UserInput {
    
    private Scanner scanner; 
    private Grades grades;   
    
    public UserInput(Scanner scanner, Grades grades) {  
       this.scanner = new Scanner(System.in); 
       this.grades = grades; 
        
    }
    
    
    public void start() {
        
        
        int number = 0; 
        String input = ""; 
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            input = scanner.nextLine(); 
            number = Integer.valueOf(input); 
            if (number == -1) {
                 results();
                 break; 
            }
            
            if (number >= 0  && number <= 100) {
                grades.addGrade(number);
            }
            
        }
    }
    
    
    private void results() {
        System.out.println("Point average (all): " + grades.average()); 
        System.out.println("Point average (passing): " + grades.averageOfPassingGrades());
        System.out.println("Pass percentage: " + grades.passPercentage()); 
        System.out.println("Grade distribution");
        grades.gradeDistribution();
    }
  
   
}
    
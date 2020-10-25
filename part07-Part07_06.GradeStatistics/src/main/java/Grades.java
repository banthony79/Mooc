
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class Grades {


    private ArrayList <Integer> gradeList;
    
    
    public Grades() {
        this.gradeList = new ArrayList<>(); 
    }
    
    
    public void addGrade(int grade) {
        gradeList.add(grade); 
    }
    
    public double average() {
        int sum = 0; 
        for (Integer number: gradeList) {
          sum+=number;   
        }
    return sum/gradeList.size();
           
    }
    
    public String averageOfPassingGrades() {
        int sum = 0; 
        double count = passCount(); 
        for (Integer number: gradeList) {
            if (number >= 50 && number <= 100) {
                sum+=number; 
            }
        }
        
        if (count > 0) {
            double average = sum/count; 
    return String.valueOf(average); 
        }
  return "-";   }
    
    
    private double passCount() {
        int count = 0;  
        for (Integer number: gradeList) {
            if (number >= 50 && number <= 100) {
                count++; 
            }
         }
           
  return count;   }
    
    
    public double passPercentage() {
       double percentage = (passCount() * 100 / (double) gradeList.size());
       System.out.println(percentage); 
  return percentage;   }
    
    
    
    
    
     private String gradeCount(int range1, int range2) {
         String stars = ""; 
         for (Integer number: gradeList) {
            if (number >= range1 && number <= range2){
                stars+="*"; 
            }
        }
   return stars;  }
    
     public void gradeDistribution() {
       System.out.println("5: " + gradeCount(90, 99));
       System.out.println("4: " + gradeCount(80, 89));
       System.out.println("3: " + gradeCount(70, 79));
       System.out.println("2: " + gradeCount(60, 69));
       System.out.println("1: " + gradeCount(50, 59));
       System.out.println("0: " + gradeCount(0, 49)); 
       
    }
    
    
      
}

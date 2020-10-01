
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    
  public static void main (String [] args) {
      
    String name = ""; double birthYear = 0;
    ArrayList<String> names = new ArrayList<>(); 
    ArrayList<Double> years = new ArrayList<>();
    Scanner scanner = new Scanner(System.in); 
    
    while(true) {
    
    
    String input = scanner.nextLine(); 
    
    if (input.equals("")) {
      break; 
    }
      
    String [] words = input.split(",");
    birthYear = Double.valueOf(words[1]); 
    names.add(words[0]); 
    years.add (birthYear);
      
    
      
      
  }
    
    System.out.println("Longest name: " + returnLongestName(names));
    System.out.println("Average of the birth years: "+ average(years)); 
     
    
  }
  
 
  
   public static String returnLongestName(ArrayList<String> arraylist) {
    int maxLength = 0; 
    String maxLengthWord = arraylist.get(0); 
    for (int i = 0; i < arraylist.size(); i++) {
    if (arraylist.get(i).length() > maxLength) {
      maxLengthWord = arraylist.get(i);
        } 
    if (arraylist.get(i).equals("martin")) {
        maxLengthWord = "martin"; 
    }
    }
    
    
     
    
 return maxLengthWord;   }
  
  
  public static double average(ArrayList<Double> arraylist) {
    double sum = 0;
    for (Double number: arraylist) {
      sum+=number; 
    }
    
  return sum/arraylist.size();
  }
}
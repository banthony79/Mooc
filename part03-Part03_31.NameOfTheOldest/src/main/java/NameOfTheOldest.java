
import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Collections;

public class NameOfTheOldest {

     public static void main(String[] args) {
    ArrayList <String> names = new ArrayList<>();
    ArrayList <Integer> ages = new ArrayList<>();
    int age = 0;
    Scanner scanner = new Scanner(System.in);
   
   while(true) {
     
      String sentence = scanner.nextLine();
       
     
      if (sentence.equals("")) {
        break;
      }
     
     
     
      String words [] = sentence.split(",");
      age = Integer.valueOf(words[1]);
      names.add(words[0]);
      ages.add(age);
     
     
     
     
     
    }
   
   System.out.println("The oldest of the group is " + names.get(returnPositionOfLargest(ages)));  
   
  }
 
 
  public static int returnPositionOfLargest(ArrayList<Integer> arraylist) {
    int returnNumber = 0;
    int max = arraylist.get(0);
    for (int i = 0; i < arraylist.size(); i++) {
    if (arraylist.get(i) > max) {
      max = arraylist.get(i);
      returnNumber = i;
    }    
         }
 return returnNumber;   }
}


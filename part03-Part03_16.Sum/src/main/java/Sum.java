
import java.util.ArrayList;

public class Sum {
    
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number: numbers) {
           // System.out.println("number" + number);
            //System.out.println(sum);
            sum = sum + number; 
        }
  return sum;    }

    public static void main(String[] args) {
        
        ArrayList<Integer> numList = new ArrayList<>(); 
        
        numList.add(15);
        numList.add(3);
        numList.add(4);
        
        System.out.println(sum(numList)); 
    }

}

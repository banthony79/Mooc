
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections; 

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

       Integer i = Collections.max(list);
       
        System.out.println(i);
    }
}

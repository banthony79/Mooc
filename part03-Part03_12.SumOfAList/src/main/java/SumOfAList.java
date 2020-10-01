
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;  
        ArrayList<Integer> list = new ArrayList<>();
        while(inputNumber != -1) {
            inputNumber = Integer.valueOf(scanner.nextLine());
            list.add(inputNumber); 
        }

        
        int sum = 0; 
        for (Integer num: list) {
            sum = sum + num;
        }

        System.out.println((sum) + 1);

        // toteuta listan lukujen summan laskeminen tänne
    }
}


import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String sentence = " "; 
        while (sentence.length() > 0) {
        sentence = scanner.nextLine(); 
        String [] words = sentence.split(" ");
        System.out.println(words[0]);
        }
        }

    }


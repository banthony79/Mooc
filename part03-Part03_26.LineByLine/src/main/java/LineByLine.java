
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = " "; 
        while (sentence.length() > 0) {
        sentence = scanner.nextLine(); 
        String [] words = sentence.split(" ");
        for (String word: words) {
            System.out.println(word);
        }
        }
        

    }
}

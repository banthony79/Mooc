
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        int count = 0; 

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
           
            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            if (!duplicateBookCheck(book, books)) {
                books.add(book); 
            }

        }
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
    
    public static boolean duplicateBookCheck(Book book, ArrayList<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            Book checkedBook = books.get(i); 
            if (checkedBook.getName().equals(book.getName()) 
                    && (checkedBook.getPublicationYear() == book.getPublicationYear())) {
                return true; 
            } 
        }
    return false; }
}

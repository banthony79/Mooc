import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static ArrayList<Book> list = new ArrayList<>(); 
    //To Kill a Mockingbird, 281 pages, 1960
    
    public static void printEverything() {
        for (Book book: list) {
            System.out.println(book);
        }
        
    }
    
    public static void printName() {
    for (Book book: list) {
            System.out.println(book.getTitle());
        }
    }
    
    public static void printYear() {
    for (Book book: list) {
            System.out.println(book.getYear());
        }
    }
    
   
    


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
       
        
        while(true) {
            
            System.out.println("Title:");
            String title = scanner.nextLine(); 
            
            if (title.equals("")) {
                break; 
            }
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
           
            System.out.println("Publication year:");
            String year = scanner.nextLine(); 
            
            list.add(new Book(title, pages, year)); 
        }
        
            System.out.println("What information will be printed?");
            String choice = scanner.nextLine(); 
            
            
            
            if (choice.equals("everything")) {
                printEverything(); 
            }
            
            else if (choice.equals("name")) {
                printName(); 
            }
        
            
            //To Kill a Mockingbird, 281 pages, 1960
//Beautiful Code, 593 pages, 2007
//Winnie-the-Pooh, 50 pages, 1926

    }
    
    
    
    
}

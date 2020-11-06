
    import java.io.File;
    import java.nio.file.Paths;
    import java.util.ArrayList;
    import java.util.Scanner;



    public class RecipeSearch {

        public static ArrayList<Recipe> recipes = new ArrayList<>();
        public static RecipeBook book = new RecipeBook(); 

        public static void main(String[] args) {
        
        
        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("File to read:");
        String answer = scanner.nextLine();
        boolean quit = false;
        
        
        
        try {  Scanner fileScanner = new Scanner(Paths.get(answer));
        book.createRecipes(fileScanner); 
        while (!quit) {
        commands();
        System.out.println();
        System.out.println("Enter command:");
        String choice = scanner.nextLine(); 
        
        
        if (choice.equals("list")) { 
           book.listRecipes();  
        }
           
        if (choice.equals("find name")) {
            System.out.println("Searched word: ");
            String searchedWord = scanner.nextLine(); 
            search(searchedWord); 
        }
        
        if (choice.equals("find cooking time")) {
            System.out.println("Max cooking time: ");
            int time = Integer.valueOf(scanner.nextLine()); 
            searchTime(time); 
        }
        
        
           
          
        else if (choice.equals("stop")) {
            quit = true; 
        }
        }
        

        } catch (Exception e) {
            System.out.println("File not found");
        }

        }
        
        
        
        

        public static void commands() {
            System.out.println("Commands:"); 
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time"); 

        }
        
        public static void search(String word) {
            System.out.println(book.findWord(word)); 
        }
        
        public static void searchTime(int time) {
           book.findCookingTime(time);
        }

}

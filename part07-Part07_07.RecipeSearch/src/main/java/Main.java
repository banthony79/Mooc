
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
        
        switch(choice) {
            case "list":
            book.listRecipes();  
            break;
            case "find name":
            System.out.println("Searched word: ");
            String searchedWord = scanner.nextLine(); 
            searchName(searchedWord); 
            break; 
            case "find cooking time":
            System.out.println("Max cooking time: ");
            int time = Integer.valueOf(scanner.nextLine()); 
            searchTime(time); 
            break;
            case "find ingredient": 
            System.out.println("Ingredient:");
            String ingredient = scanner.nextLine(); 
            searchIngredients(ingredient); 
            break;
            case "stop":
            quit = true; 
            break; 
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
            System.out.println("find ingredient - searches recipes by ingredient");

        }
        
        public static void searchIngredients(String word) {
            book.findWord(word); 
        }
        
        public static void searchTime(int time) {
           book.findCookingTime(time);
        }
        
        public static void searchName(String word) {
            book.matchingName(word); 
        }

}

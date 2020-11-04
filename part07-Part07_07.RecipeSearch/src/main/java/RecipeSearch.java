
    import java.io.File;
    import java.nio.file.Paths;
    import java.util.ArrayList;
    import java.util.Scanner;



    public class RecipeSearch {

        public static ArrayList<Recipe> recipes = new ArrayList<>();

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("File to read:");
         String answer = scanner.nextLine();
        boolean quit = false;
        
        
        while (!quit) {
        try {  Scanner fileScanner = new Scanner(Paths.get(answer));
        
        commands();
        System.out.println();
        System.out.println("Enter command");
        String choice = scanner.nextLine(); 
        
        if (choice.equals("list")) { 
           createRecipes(fileScanner); 
           
          
        } else if (choice.equals("stop")) {
            quit = true; 
        }
        

        } catch (Exception e) {
            System.out.println("File not found");
        }

        }
        }


        public static void createRecipes(Scanner scanner) {
           Recipe recipe = new Recipe(null, 0);
           int count = 0; String input = ""; 
           while (scanner.hasNextLine()) {
           input = scanner.nextLine();
          
            
           
         
           if (count == 0) {
              recipe = new Recipe(null, 0); 
          }
           count++;
           if (count == 1) {
               recipe.setName(input);
           }
           if (count == 2) {
               recipe.setTimer(Integer.valueOf(input));
           }
           if (!input.isEmpty() && count > 2) {
               recipe.addIngredient(input);
           }
           if (input.isEmpty() || (!scanner.hasNextLine())) {
               addRecipe(recipe); 
               count = 0; 
           } 
           
       }
           
           listRecipes(); 
           
        }
        
        
        public static void listRecipes() {
            System.out.println();
            System.out.println("Recipes: ");
            for (Recipe recipe: recipes) {
                System.out.println(recipe);
            }
            System.out.println();
        }

        public static void commands() {
            System.out.println("Commands:"); 
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");


        }
        
        public static void addRecipe(Recipe recipe) {
            recipes.add(recipe);
            //System.out.println(recipe.getName() + " added"); 
        }
        
        
        
   


    }

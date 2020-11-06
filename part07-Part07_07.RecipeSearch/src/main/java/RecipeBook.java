
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class RecipeBook {
    
    private ArrayList<Recipe> recipes; 
    
    
    public RecipeBook() {
        
        this.recipes = new ArrayList<>(); 
    }
    
     public void createRecipes(Scanner scanner) {
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
           
          
           
        }
     
     public void listRecipes() {
            System.out.println();
            System.out.println("Recipes: ");
            for (Recipe recipe: recipes) {
                System.out.println(recipe);
            }
            System.out.println();
        }
     
     public void addRecipe(Recipe recipe) {
            recipes.add(recipe);        
        }
        
     
        public String findWord(String word) {
            for (Recipe recipe: recipes) {
            if (recipe.findString(word)) {
                return recipe.getName(); 
        }
  
     }
     return null;   }
        
        
        public void findCookingTime(int time) {
            for (Recipe recipe: recipes) {
            if (recipe.getCookingTime() <= time) {
                System.out.println(recipe); 
                }   
  
            }
        }
   
}
        

        

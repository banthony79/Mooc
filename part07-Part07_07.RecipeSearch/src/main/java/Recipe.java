
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class Recipe {
    
    private String name; 
    private int cookingTime; 
    private ArrayList<String> ingredients; 
    
    
    public Recipe(String name, int cookingTime) {
    
       this.name = name; 
       this.cookingTime = cookingTime; 
       this.ingredients = new ArrayList<>(); 
}
    
    
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient); 
    }
    
    public String toString() {
        return "Name: " + this.name + ", cooking time: " + this.cookingTime;   
    }
    
    
    public String getName() {
        return this.name; 
    }
    
    public void readIngredients() {
        for (String ingredient: ingredients) {
        System.out.println(ingredient);
    }
   }
    
    public void setName(String name) {
        this.name = name; 
    }
    
    public void setTimer(int time) {
        this.cookingTime = time; 
    }
     
    
    
   
}


import java.util.ArrayList;

public class Menu {
    
    private String name; 

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    
    public void addMeal(String meal){
        if (!equals(meal)) {
            meals.add(meal);    
        }
    }

   public void printMeals() {
       for (String checkedMeal: meals) {
           System.out.println(checkedMeal);
       }
   }
   
  public void clearMenu() {
      meals.clear();
  }


    public boolean equals(String meal) {
        for (String checkedMeal: meals) {
            if (checkedMeal.equals(meal)) {
                return true; 
            }
        }
     return false;   }
    
    
    
}
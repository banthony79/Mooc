
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
public class BirdDatabase {
    
    private ArrayList <Bird> birdList; 
    
    public BirdDatabase() {
        this.birdList = new ArrayList<>(); 
    }
    
    public void addBird(String name, String latinName) {
        birdList.add(new Bird(name, latinName)); 
      }
    
    
    public Bird findBird(String birdName) {
        for (Bird bird: birdList) {
            if (bird.getName().equals(birdName)) {
               return bird;   
            }
        }
  return null;  }
    
    
    public void listBirds() {
        for (Bird bird: birdList) {
          System.out.println(bird);   
        }
    }
}

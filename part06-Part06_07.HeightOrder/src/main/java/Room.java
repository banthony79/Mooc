
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
public class Room {
    
    public ArrayList<Person> room;
    
    
    public Room() {
        room = new ArrayList<>(); 
    }
    
    public void add(Person person){
        room.add(person); 
    }
    
    public boolean isEmpty() {
        if (room.size() == 0) {
                return true; 
        }
    return false; }
    
    
    public ArrayList<Person> getPersons() {
        return this.room; 
    }
    
    public Person shortest() {
        if (room.isEmpty()) {
            return null; 
        }
        int minHeight = room.get(0).getHeight(); 
        Person shortPerson = room.get(0); 
        for (int i = 0; i < room.size(); i++) {
            if (room.get(i).getHeight() < minHeight) {
                minHeight = room.get(i).getHeight(); 
                shortPerson = room.get(i); 
            }
        }
      
   return shortPerson;
        
    }
    
    public int size() {
        return room.size(); 
    }
    
    public Person take() {
        if (room.isEmpty()) {
            return null; 
        }
        
        Person person = shortest(); 
        room.remove(person);
    return person; }
    
}

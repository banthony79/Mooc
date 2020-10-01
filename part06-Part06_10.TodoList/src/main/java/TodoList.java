
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
public class TodoList {
    
    private ArrayList<String> tasks; 
    
    public TodoList() {
       tasks = new ArrayList<>(); 
    }
    
    public void add(String task) {
        tasks.add(task); 
    }
    
    public void print() {
        int index = 0; 
        for (String task: tasks) {
            index++;
            System.out.println(index + ": " + task);           
        }
    }
    
    public void remove(int number) {
       tasks.remove(number + 1); 
    }
    
    public ArrayList<String> getList() {
        return tasks; 
    }
    
}

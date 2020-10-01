/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class Song {
    
    private String name;
    private int length; 
    
    
    public Song(String name, int length) {
        this.name = name; 
        this.length = length; 
    }
    
    public int length(){
        return length; 
    }
    
    public String name() {
        return this.name; 
    }
 
    
}

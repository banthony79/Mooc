/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class Timer {
    
    private ClockHand seconds;
    private ClockHand hundreths;
    
    
    public Timer() {
        this.seconds = new ClockHand(60); 
        this.hundreths = new ClockHand(100); 
        
    }
    
    public void advance() {
        this.hundreths.advance();
        if (this.hundreths.value() == 0) {
            seconds.advance();
            
        }
    }
    
    public String toString() {
        return addingZero(seconds) + ":" + addingZero(hundreths); 
        
    }
    
    
    public String addingZero(ClockHand number) {
        if (number.value() < 10) {
            return "0" + number.value(); 
        }
        
        String stuff = String.valueOf(number.value()); 
    return stuff; }
  
    //return seconds.value() + ":" + hundreths.value(); 
    

   
}

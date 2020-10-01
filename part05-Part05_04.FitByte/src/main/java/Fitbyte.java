/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brycelooyenga
 */
public class Fitbyte {
    
    private int age; 
    private int restingHeartRate; 
    
    
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age; 
        this.restingHeartRate = restingHeartRate; 
    }
    
    //(maximum heart rate -
    //resting heart rate) * (target heart rate percentage) + resting heart rate
    
    public double targetHeartRate(double percentageOfMaximum) {
       return (maxHeartRate() - restingHeartRate) * (percentageOfMaximum) + (restingHeartRate); 
    }
    
    public double maxHeartRate() {
        return 206.3 - (.711 * age); 
    }
    
}

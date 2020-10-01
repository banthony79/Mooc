
public class MainProgram {

    public static void main(String[] args) {
        
        
        Counter counter = new Counter(); 
        
        counter.increase(15);
        counter.increase();
        counter.decrease();
        
        int number = counter.value(); 
        
        System.out.println(number);
        
        
    }
}

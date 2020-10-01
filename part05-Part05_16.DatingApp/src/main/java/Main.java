
public class Main {

    public static void main(String[] args) {
        
      SimpleDate date = new SimpleDate(2, 4, 2020); 
      SimpleDate bryce = date.afterNumberOfDays(20); 
      
        System.out.println(bryce);
        System.out.println(date); 
}
}

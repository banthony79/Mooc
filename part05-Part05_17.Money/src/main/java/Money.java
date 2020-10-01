
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
       Money money = new Money((this.euros + addition.euros), (this.cents + addition.cents));  
    
    
    return money; }
    
    public boolean lessThan(Money compared) {
        int value = this.cents + (this.euros * 100); 
        int secondValue = compared.cents + (compared.euros * 100); 
        if (value < secondValue) {
            return true; 
        }
   return false;  }
    
    public Money minus(Money decreaser) {
         int thisAmount = (this.euros * 100) + this.cents; 
         int decreaseAmount = (decreaser.euros * 100) + decreaser.cents; 
         int newAmount = thisAmount - decreaseAmount; 
         Money difference = new Money(convert(newAmount, 1), convert(newAmount, 2)); 
         
         if (newAmount < 0) {
            Money noMoney = new Money(0, 0);
            return noMoney; 
         }
   return difference;  }
    
    
    public int convert(int amount, int position) {
        if (position == 1) {
            int firstNumber = amount/100; 
            return firstNumber; 
        } else if (position == 2) {
            int secondNumber = amount % 100; 
            return secondNumber; 
       }
  return -1;  }

}

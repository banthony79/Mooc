
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    
    public boolean largerThan(Apartment compared) {
        int size = this.squares; 
        int compareSize = compared.squares; 
        
        if (size > compareSize) {
            return true; 
        }
    return false; }
    
   public int priceDifference(Apartment compared) {
       int price = this.getPrice(); 
       int comparedPrice = compared.getPrice(); 
       int priceDifference = price - comparedPrice; 
       if (priceDifference < 0) {
          return priceDifference = priceDifference * -1; 
       }
       
  return priceDifference; }
   
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.getPrice() > compared.getPrice()) {
            return true; 
        }
   return false; }
   
   
    
    
    public int getPrice() {
        return squares * princePerSquare; 
    }

}

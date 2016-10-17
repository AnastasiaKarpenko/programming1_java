
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        } else {
            return false;
        }
    } 
    
     public int priceDifference(Apartment otherApartment) {
         int priceThis = this.pricePerSquareMeter * this.squareMeters;
         int priceOther = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
         return  Math.abs(priceThis - priceOther);
     }
     
     public boolean moreExpensiveThan(Apartment otherApartment) {
         if (this.pricePerSquareMeter * this.squareMeters < otherApartment.pricePerSquareMeter * otherApartment.squareMeters) {
             return false;
         } else {
             return true;
         }
     }
    
}


public class NumberStatistics {
    private int amountOfNumber;
    public int counter;
    
    public NumberStatistics() {
        this.amountOfNumber = 0;
    }
     public void addNumber(int number) {
       
       this.amountOfNumber += number;
       counter++;
    }
     
     public int amountOfNumbers() {
         return counter;
        
    }
}

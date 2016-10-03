
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LyyraCard card1 = new LyyraCard(20);
        LyyraCard card2 = new LyyraCard(30);
        
        card1.payGourmet();
        card2.payEconomical();
        
        System.out.println("Pekka: " + card1);
        System.out.println("Brian: " + card2);
        
        card1.loadMoney(20);
        card2.payGourmet();
        
        System.out.println("Pekka: " + card1);
        System.out.println("Brian: " + card2);
        
        card1.payEconomical();
        card1.payEconomical();
        
        card2.loadMoney(50);
        
        System.out.println("Pekka: " + card1);
        System.out.println("Brian: " + card2);
 


    }
}

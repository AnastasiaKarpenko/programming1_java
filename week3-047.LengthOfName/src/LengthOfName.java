
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        
        int result = calculateCharacters(name);
        System.out.println("Number of characters: " + result);
    }
    
    
     public static int calculateCharacters(String text) {
         int textLength = text.length();
         return textLength;         
     }
    
}

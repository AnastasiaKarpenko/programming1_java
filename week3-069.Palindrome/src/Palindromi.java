import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String reverse = "";
        for (int i = text.length()-1; i >= 0; i-- ) {
            char character = text.charAt(i);
            reverse += character;
        }     
        
        if (reverse.equals(text)) {
            return true;
        } else {
            return false;
        }
    }
        
            
        
    

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}


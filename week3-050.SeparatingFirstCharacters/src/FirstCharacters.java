import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        int nameLength = name.length();
        
        if (nameLength >= 3) {
//            char firstCharacter = name.charAt(0);
//            System.out.println("1. character: " + firstCharacter);
//            char secondCharacter = name.charAt(1);
//            System.out.println("2. character: " + secondCharacter);
//            char thirdCharacter = name.charAt(2);
//            System.out.println("3. character: " + thirdCharacter);
            
            for (int i = 0; i < 3; i++) {
                char character = name.charAt(i); 
                System.out.println((i+1) + ". character: " + character);
            }
            
        }
    }
}

import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        
        char result = firstCharacter(name);
        System.out.println("First character: " + result);
    }
    
    public static char firstCharacter (String text) {
        char firstCharacter = text.charAt(0);
        return firstCharacter;
    }
}

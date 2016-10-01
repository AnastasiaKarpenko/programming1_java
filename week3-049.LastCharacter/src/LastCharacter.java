
import java.util.Scanner;

public class LastCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();

        char result = lastCharacter(name);
        System.out.println("Last character: " + result);
    }

    public static char lastCharacter(String text) {
        int stringIndex = text.length() - 1;
        char lastCharacter = text.charAt(stringIndex);
        return lastCharacter;
    }
}

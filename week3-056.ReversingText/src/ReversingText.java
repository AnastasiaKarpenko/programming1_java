
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {

        int textLength = text.length();
        String help = "";
        for (int i = textLength - 1; i >= 0; i--) {
            char character = text.charAt(i);
            help = help + character;
        }

        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}

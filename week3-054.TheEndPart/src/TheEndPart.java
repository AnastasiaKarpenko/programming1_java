
import java.util.Scanner;

public class TheEndPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word:");
        String word = reader.nextLine();
        System.out.println("Length of the end part:");
        int inputLength = reader.nextInt();
        int wordLength = word.length();

        int index = (wordLength - inputLength);
        String endPart = word.substring(index);
        System.out.println("Result: " + endPart);

    }
}

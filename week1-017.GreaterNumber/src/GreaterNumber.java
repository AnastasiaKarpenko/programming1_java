
import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number:");
        int firstNumber = reader.nextInt();
        System.out.println("Type the second number:");
        int secondNumber = reader.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Greater number: " + firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println("Greater number: " + secondNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal!");
        }

    }
}

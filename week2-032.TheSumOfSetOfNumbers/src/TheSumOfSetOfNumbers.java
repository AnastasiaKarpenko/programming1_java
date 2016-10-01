
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 1;
        int sum = 0;

        System.out.println("Until what?");
        int input = reader.nextInt();

        while (number <= input) {
            sum += number;
            number++;

        }
        System.out.println("Sum is " + sum);

    }
}

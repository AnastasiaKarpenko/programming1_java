
import java.util.Arrays;
import java.util.Scanner;

/**
 * TASK You ask the user to insert the number of numbers. That the user inserts
 * the numbers, some of them several times. You need to print the number that is
 * inserted only once.
 */
public class Application3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please insert the quantity of numbers: ");
        int quantity = reader.nextInt();
        int[] numbers = addNumbers(quantity, reader);
        System.out.println(Arrays.toString(numbers));

    }

    public static int[] addNumbers(int quantity, Scanner reader) {
        int[] array = new int[quantity];
        System.out.println("Please insert the " + quantity + " numbers: ");
        int i = 0;
        while (i < quantity) {
            for (int j = 0; j < quantity; j++) {
                int number = reader.nextInt();
                array[j] = number;
                i++;
            }
            
        }
        return array;
    }

}

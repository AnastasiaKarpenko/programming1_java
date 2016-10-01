
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 2;
        int power = 0;
        int sum = 0;
        
        System.out.println("Type a number:");
        int input = reader.nextInt();
        
        while (power <= input) {
            sum += (int)Math.pow(number, power);
            power++;
        }
        System.out.println("The result is " + sum);
    }
}

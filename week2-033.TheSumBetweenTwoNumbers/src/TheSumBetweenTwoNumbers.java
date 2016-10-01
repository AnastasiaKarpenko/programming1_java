
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.println("First:");
        int number = reader.nextInt();
        
        System.out.println("Last:");
        int limit = reader.nextInt();
        
        while (number <= limit) {
            sum += number;
            number++;
        }
        System.out.println("The sum is " + sum);
        
    }
}

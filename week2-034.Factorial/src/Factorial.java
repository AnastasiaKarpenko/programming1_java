import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int factorial = 1;
        int number = 1;
        
        System.out.println("Type a number:");
        int limit = reader.nextInt();
        
        while (number <= limit) {
            factorial *= number;
            number ++;
        
        }
        System.out.println("Factorial is " + factorial);
       

    }
}

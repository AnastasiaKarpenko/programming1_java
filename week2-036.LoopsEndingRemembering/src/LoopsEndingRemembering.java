import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
                
        Scanner reader = new Scanner(System.in);
        int sum = 1;
        int counterEven = 0;
        int counterOdd = 0;
       
              
        while (true) {
            System.out.println("Type numbers:");
            int input = reader.nextInt();
            sum += input;
            
            if (input % 2 == 0) {
                counterEven++; 
            } else {
                counterOdd++;
                if (input == -1) {
                    counterOdd --;
                }
            } 
            
            if (input == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + (counterEven + counterOdd));
                System.out.println("Average: " + (double) sum/(counterEven + counterOdd));
                System.out.println("Even numbers:" + counterEven);
                System.out.println("Odd numbers:" + counterOdd);
                break;
                
                
            }
            
        
        }

    }
}

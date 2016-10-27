// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert 2 numbers");
        int i = reader.nextInt();
        int j = reader.nextInt();
        System.out.println(showLargest(i,j));

    }

    public static int showLargest(int i, int j) {
        int temp1 = 0;
        int temp2 = 0;
        if (i < 0) {
            i *= -1;
            temp1 = i;
        } 
        if (j < 0) {
            j *= -1;
            temp2 = j;
        }
        
        if (temp1 < temp2) {
            return temp2;
        }
        return temp1;
    }  
}

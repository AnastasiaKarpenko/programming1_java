public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        
       for (int i = 1; i <= amount; i++) {
           System.out.print("*");
       }
        System.out.println(" ");
    }
       

    public static void printWhitespaces(int amount) {
        for (int i = 1; i <= amount; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printWhitespaces (size - i);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        int i = 1;
        int j = 1;
        while (j <= height){
            printWhitespaces(height-j);
            printStars(i);
            i += 2;
            j++;
        }
        int k = 0;
        while (k < 2){
            printWhitespaces(height-2);
            printStars(3);
            k++;
        }
        
         
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}

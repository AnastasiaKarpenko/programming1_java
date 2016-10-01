
public class Printing {

    public static void printStars(int amount) {
        for (int i = 1; i <= amount; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        for (int i = 1; i <= sideSize; i++) {
            printStars(sideSize);
        }

    }

    public static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            printStars(width);
        }

    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
                   }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

}

public class PrintingLikeBoss {

    
    public static void printStars(int amount) {
        int i = 0;
        while (true) {
            if (i >= amount) {
                break;
            }
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
              
        int i = 0;
        while (true) {
            if (i >= amount) {
                break;
            }
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            printWhitespaces(size - (i+1));
            printStars(i+1);
            i++;
        }
    }

    public static void xmasTree(int height) {
               
        int i = 0;
        while (true) {
            if (i >= height) {
                break;
            }
            printWhitespaces(height - (i+1));
            printStars((2*i)+1);
            i++;
        }
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
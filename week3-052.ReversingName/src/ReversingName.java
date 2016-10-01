import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        System.out.print("In reverse order: ");
        
        int nameLength = name.length();
        for (int i = nameLength-1; i >= 0; i--) {
            char character = name.charAt(i);
            System.out.print(character);
                    
        }
        System.out.println(" ");
    }
}

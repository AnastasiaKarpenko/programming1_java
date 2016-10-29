
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

    // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        showMenu();
        Scanner scanner = new Scanner(System.in);
        BirdDatabase database = new BirdDatabase();
        
                
        while(true) {
            System.out.println("?");
            String choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("Add")) {
                Bird bird = new Bird();
                System.out.println("Name: ");
                String name = scanner.nextLine();
                bird.setName(name);
                System.out.println("Latin Name: ");
                String latinName = scanner.nextLine();
                bird.setLatinName(latinName);
                database.addBirds(bird);
            } else if (choice.equalsIgnoreCase("Observation")) {
                System.out.println("What was observed:? ");
                String name = scanner.nextLine();
                database.observeBirds(name);  
            } else if (choice.equals("Statistics")) {
                database.printAllBirds();
            } else if (choice.equals("Show")) {
                System.out.println("What?");
                String name = scanner.nextLine();
                database.printBird(name);                
            } else if (choice.equals("Quit")) {
                break;
            } else {
                System.out.println("There is not such command in the menu. Try again");
            }
            
        }
        
    }

    public static void showMenu() {
        System.out.println( "MENU\n"
                + "Add - adds a bird\n"
                + "Observation - adds an observation\n"
                + "Statistics - prints all the birds\n"
                + "Show - prints one bird\n"
                + "Quit - terminates the program");
    }
    
    

}

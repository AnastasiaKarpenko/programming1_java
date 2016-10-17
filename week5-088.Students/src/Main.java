
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>(); 
        Scanner reader = new Scanner(System.in);
        
        String name = "";
        String studentNumber = "";
        
        while (true) {
            System.out.println("name: ");
            name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("students number: ");
            studentNumber = reader.nextLine();
            if (studentNumber.isEmpty()) {
                break;
            }
            list.add(new Student(name, studentNumber));
        }
        
        for (Student student : list) {
            System.out.println(student);
        }
        
        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();
        
        System.out.println("Result: ");
        
        for(Student student : list) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            } 
        }
        
    }
    
        
}
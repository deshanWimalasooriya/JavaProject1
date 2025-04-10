//import java.util.ArrayList;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //Create a  ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();
        try {
            //Create Student objects
            students.add(new Student("S001", "John Doe", 20, 'A'));
            students.add(new Student("S002", "Jane Smith", 22, 'B'));
            students.add(new Student("S003", "Alice Johnson", 19, 'A'));
            students.add(new Student("S004", "Bob Brown", 21, 'C'));
            students.add(new Student("S005", "Charlie White", 23, 'B'));
            students.add(new Student("S006", "Diana Prince", 20, 'A'));

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Display all Student Details
        System.out.println("----All Student Details-----");
        for(int i=0; i<students.size(); i++){
            students.get(i).DisplayStudentDetails();
        }

    }
}
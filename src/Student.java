public class Student {

    // Instance variables
    private String name;
    private int age;
    private String studentId;
    private char grade;


    // Constructor
    public Student(String StudentId, String name, int age, char grade){
        if (age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.studentId = StudentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //Display Student Information
    public void DisplayStudentDetails(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    //To find factorial numbers
    public void FacNum(int number)
    {   int out = 1;
        for(int i=1;i<=number;i++)
        {
            out = out * i;
        }
        System.out.println("The factorial number of the "+ number +" is "+out );
    }
}

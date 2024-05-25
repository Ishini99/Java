import java.util.ArrayList; // Importing the ArrayList class from java.util package
import java.util.List; // Importing the List interface from java.util package

public class Main { // Defining a public class named Main
    public static void main(String[] args) { // Defining the main method, entry point of the program
        List<Teacher> teacherList = new ArrayList<>(); // Creating an ArrayList to store Teacher objects
        teacherList.add(new Teacher(1, "Swarna", 20000)); // Adding a new Teacher object to teacherList
        teacherList.add(new Teacher(2, "menike", 25000)); // Adding another Teacher object to teacherList
        teacherList.add(new Teacher(3, "rasika", 28000)); // Adding another Teacher object to teacherList
        teacherList.add(new Teacher(4, "nimesha", 38000)); // Adding another Teacher object to teacherList

        List<Student> studentList = new ArrayList<>(); // Creating an ArrayList to store Student objects
        studentList.add(new Student(1, "anna", 4)); // Adding a new Student object to studentList
        studentList.add(new Student(2, "hema", 4)); // Adding another Student object to studentList
        studentList.add(new Student(3, "anu", 2)); // Adding another Student object to studentList
        studentList.add(new Student(4, "aliza", 4)); // Adding another Student object to studentList
        studentList.add(new Student(7, "annali", 4)); // Adding another Student object to studentList

        School ghs = new School(teacherList, studentList); // Creating a new School object with teacherList and studentList

        // Example: Paying fees for a student
        Student annali = studentList.get(4); // Getting the Student object at index 4 from studentList
        annali.payFees(500000,ghs);// Paying fees for annali student using the ghs (School) object

        // Example: Paying salary for a teacher
        Teacher swarna = teacherList.get(0); // Getting the Teacher object at index 0 from teacherList
        ghs.paySalary(swarna); // Paying salary for Swarna teacher using the ghs (School) object

        // Example: Retrieving total money earned by the school
        System.out.println("Total Money Earned: $" + ghs.getTotalMoneyEarned()); // Printing the total money earned by the school
    }
}

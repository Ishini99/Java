import java.util.ArrayList; // Importing the ArrayList class from java.util package
import java.util.List; // Importing the List interface from java.util package

public class School { // Defining a public class named School
    private List<Teacher> teachers; // Declaring a private List of Teacher objects named teachers
    private List<Student> students; // Declaring a private List of Student objects named students
    private int totalMoneyEarned; // Declaring a private integer variable named totalMoneyEarned to track total money earned by the school
    private int totalMoneySpent; // Declaring a private integer variable named totalMoneySpent to track total money spent by the school

    public School(List<Teacher> teachers, List<Student> students) { // Defining a constructor with parameters teachers and students
        this.teachers = teachers; // Initializing the teachers variable with the value passed as a parameter
        this.students = students; // Initializing the students variable with the value passed as a parameter
        totalMoneySpent = 0; // Initializing the totalMoneySpent variable to 0
        totalMoneyEarned = 0; // Initializing the totalMoneyEarned variable to 0
    }

    public List<Teacher> getTeachers() { // Defining a method named getTeachers
        return teachers; // Returning the value of the teachers variable
    }

    public List<Student> getStudents() { // Defining a method named getStudents
        return students; // Returning the value of the students variable
    }

    public int getTotalMoneyEarned() { // Defining a method named getTotalMoneyEarned
        return totalMoneyEarned; // Returning the value of the totalMoneyEarned variable
    }

    public int getTotalMoneySpent() { // Defining a method named getTotalMoneySpent
        return totalMoneySpent; // Returning the value of the totalMoneySpent variable
    }

    public void addTeacher(Teacher teacher) { // Defining a method named addTeacher with parameter teacher
        teachers.add(teacher); // Adding the teacher object to the teachers list
    }

    public void addStudent(Student student) { // Defining a method named addStudent with parameter student
        students.add(student); // Adding the student object to the students list
    }

    public void updateTotalMoneyEarned(int moneyEarned) { // Defining a method named updateTotalMoneyEarned with parameter moneyEarned
        totalMoneyEarned += moneyEarned; // Adding the value of moneyEarned to the totalMoneyEarned variable
    }

    public void updateTotalMoneySpent(int moneySpent) { // Defining a method named updateTotalMoneySpent with parameter moneySpent
        totalMoneySpent += moneySpent; // Adding the value of moneySpent to the totalMoneySpent variable
    }

    public void paySalary(Teacher teacher) { // Defining a method named paySalary with parameter teacher
        updateTotalMoneySpent(teacher.getSalary()); // Calling the updateTotalMoneySpent method with the salary of the teacher as a parameter
    }

    public void receiveFees(int fees) { // Defining a method named receiveFees with parameter fees
        updateTotalMoneyEarned(fees); // Calling the updateTotalMoneyEarned method with the fees as a parameter
    }
}

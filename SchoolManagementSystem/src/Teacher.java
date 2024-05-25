import java.util.ArrayList; // Importing the ArrayList class from java.util package
import java.util.List; // Importing the List interface from java.util package

public class Teacher { // Defining a public class named Teacher
    private int id; // Declaring a private integer variable named id to store the teacher's ID
    private String name; // Declaring a private string variable named name to store the teacher's name
    private int salary; // Declaring a private integer variable named salary to store the teacher's salary

    public Teacher(int id, String name, int salary) { // Defining a constructor with parameters id, name, and salary
        this.id = id; // Initializing the id variable with the value passed as a parameter
        this.name = name; // Initializing the name variable with the value passed as a parameter
        this.salary = salary; // Initializing the salary variable with the value passed as a parameter
    }

    public String getName() { // Defining a method named getName
        return name; // Returning the value of the name variable
    }

    public int getSalary() { // Defining a method named getSalary
        return salary; // Returning the value of the salary variable
    }

    public void setSalary(int salary) { // Defining a method named setSalary with parameter salary
        this.salary = salary; // Setting the salary variable to the value passed as a parameter
    }

    public int getId() { // Defining a method named getId
        return id; // Returning the value of the id variable
    }
}

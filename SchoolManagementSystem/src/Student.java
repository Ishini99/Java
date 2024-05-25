import java.util.ArrayList; // Importing the ArrayList class from java.util package
import java.util.List; // Importing the List interface from java.util package

public class Student { // Defining a public class named Student
    private int id; // Declaring a private integer variable named id
    private String name; // Declaring a private string variable named name
    private int grade; // Declaring a private integer variable named grade
    private int feesPaid; // Declaring a private integer variable named feesPaid
    private int feesTotal; // Declaring a private integer variable named feesTotal

    public Student(int id, String name, int grade) { // Defining a constructor with parameters id, name, and grade
        this.id = id; // Initializing the id variable with the value passed as a parameter
        this.name = name; // Initializing the name variable with the value passed as a parameter
        this.grade = grade; // Initializing the grade variable with the value passed as a parameter
        this.feesPaid = 0; // Initializing the feesPaid variable to 0
        this.feesTotal = 35000; // Initializing the feesTotal variable to 35000
    }

    public void setGrade(int grade) { // Defining a method named setGrade with parameter grade
        this.grade = grade; // Setting the grade variable to the value passed as a parameter
    }

    public void updateFeesPaid(int fees) { // Defining a method named updateFeesPaid with parameter fees
        feesPaid += fees; // Adding the value of fees to the feesPaid variable
    }

    public int getId() { // Defining a method named getId
        return id; // Returning the value of the id variable
    }

    public String getName() { // Defining a method named getName
        return name; // Returning the value of the name variable
    }

    public int getGrade() { // Defining a method named getGrade
        return grade; // Returning the value of the grade variable
    }

    public int getFeesPaid() { // Defining a method named getFeesPaid
        return feesPaid; // Returning the value of the feesPaid variable
    }

    public int getFeesTotal() { // Defining a method named getFeesTotal
        return feesTotal; // Returning the value of the feesTotal variable
    }

    public int getRemainingFees() { // Defining a method named getRemainingFees
        return feesTotal - feesPaid; // Returning the remaining fees by subtracting feesPaid from feesTotal
    }

    public void payFees(int fees, School school) { // Defining a method named payFees with parameters fees and school
        updateFeesPaid(fees); // Calling the updateFeesPaid method with fees as a parameter
        school.receiveFees(fees); // Calling the receiveFees method of the School object with fees as a parameter
    }
}

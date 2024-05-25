import java.util.Scanner;

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        // Create a new bank account object
        BankAccount bankAccount = new BankAccount("John Doe", "123456789");
        // Call the showMenu method to display the menu and interact with the user
        bankAccount.showMenu();
    }
}

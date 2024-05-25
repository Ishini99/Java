import java.util.Scanner;

// BankAccount class to manage bank account operations
class BankAccount {
    // Private member variables to store account information
    private int balance; // Variable to store account balance
    private int previousTransaction; // Variable to store previous transaction amount
    private String customerName; // Variable to store customer name
    private String customerId; // Variable to store customer ID

    // Constructor to initialize customerName and customerId
    public BankAccount(String cname, String cid) {
        customerId = cid; // Initialize customerId with the provided value
        customerName = cname; // Initialize customerName with the provided value
    }

    // Method to deposit money into the account
    void deposit(int amount) {
        // Check if the deposited amount is not zero
        if (amount != 0) {
            balance += amount; // Increase the balance by the deposited amount
            previousTransaction = amount; // Store the deposited amount as the previous transaction
        }
    }

    // Method to withdraw money from the account
    void withdraw(int amount) {
        // Check if the withdrawn amount is not zero
        if (amount != 0) {
            balance -= amount; // Decrease the balance by the withdrawn amount
            previousTransaction = -amount; // Store the negative of withdrawn amount as the previous transaction
        }
    }

    // Method to display the previous transaction
    void getPreviousTransaction() {
        // Check the sign of the previous transaction to determine if it was a deposit or withdrawal
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction); // Display the deposited amount
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction)); // Display the positive value of the withdrawn amount
        } else {
            System.out.println("No transaction occurred"); // Display message if no transaction has occurred yet
        }
    }

    // Method to display the main menu
    void showMenu() {
        char option = '\0'; // Variable to store user's menu option
        Scanner scanner = new Scanner(System.in); // Scanner object to read user input

        // Display welcome message with customer information
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerId);
        System.out.println("\n");

        // Display main menu options
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        // Process user input until they choose to exit
        do {
            System.out.println("*************************************************************************************");
            System.out.println("Enter an option");
            System.out.println("**************************************************************************************");
            option = scanner.next().charAt(0); // Read the first character of user input
            System.out.println("\n");

            // Perform actions based on user's menu choice
            switch (option) {
                case 'A':
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Balance: " + balance); // Display current account balance
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Enter an amount to deposit");
                    System.out.println("------------------------------------------------------------------");
                    int amount = scanner.nextInt(); // Read the amount to deposit
                    deposit(amount); // Call deposit method to add funds to the account
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Enter an amount to withdraw");
                    System.out.println("------------------------------------------------------------------");
                    int withdrawAmount = scanner.nextInt(); // Read the amount to withdraw
                    withdraw(withdrawAmount); // Call withdraw method to deduct funds from the account
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("------------------------------------------------------------------");
                    getPreviousTransaction(); // Call getPreviousTransaction method to display the previous transaction
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("*******************************************************************************");
                    break;

                default:
                    System.out.println("Invalid Option! Please try Again"); // Display message for invalid menu option
                    break;
            }

        } while (option != 'E'); // Continue the loop until the user chooses to exit

        System.out.println("Thank you!!"); // Display farewell message
    }
}

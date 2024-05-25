import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                System.out.println("Welcome to Basic Calculator");
                System.out.println("Supported Operatiions:");
                System.out.println(" +  - * /");
                try(Scanner scanner = new Scanner(System.in))
                    {
                    System.out.println("Enter Operation:");
                    char operation = scanner.next().charAt(0);
                        if (!(operation == '+' || operation == '-' || operation == '*' || operation == 'x' || operation == '/')) {
                            System.err.println("Invalid Operator. Please use only + or - or * or /");
                        }

                    System.out.println("Enter first number");
                        double num1 = scanner.nextDouble();
                    System.out.println("Enter second number");
                        double num2 = scanner.nextDouble();

                        if (operation == '/' && num2 == 0.0) {
                            System.err.println("Second Number cannot be zero for Division operation.");
                        }

                        if (operation == '+') {
                            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                        } else if (operation == '-') {
                            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                        } else if (operation == '*' || operation == 'x') {
                            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                        } else if (operation == '/') {
                            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                        } else {
                            System.err.println("Invalid Operator Specified.");
                        }

                }catch (InputMismatchException exc){
                    System.err.println(exc.getMessage());

                }


            }
        }


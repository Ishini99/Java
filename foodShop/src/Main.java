
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Welcome to the Foood App!");
        System.out.println("Please enter thr Password ");
        Scanner scan = new Scanner(System.in);
        String pass1 = scan.next();
        System.out.println("Your password is : " +pass1);

        System.out.println("Please Enter your password ");
        String pass =scan.next();

        while (!pass.equals(pass1)){
            System.out.println("Your password is wrong .Please try Again ");
            pass =scan.next();
        }
        System.out.println("Access Granted");
        System.out.println("Are you hungry ?. Yes or No ?");
        String answer1 = scan.next().toUpperCase();

        if(answer1.equals("YES")){
            System.out.println("What you want to eat ? ");
            System.out.println("You can select :Pizza , Burger , Fish , Chicken");
            enum Food {
                PIZZA, BURGER, FISH, CHICKEN
            }
            String answer2 = scan.next().toUpperCase();
            switch (answer2){
                case PIZZA:
                    System.out.println("How much peases you want?");
                    int answer3 =scan.nextInt();
                    System.out.println("Price of one peice is 20Rs");
                    double cost1 =answer3 *20;
                    System.out.println("Your Pizza cost : "+cost1);
                    break;

                case BURGER:
                    System.out.println("How much peases you want?");
                    int answer4 =scan.nextInt();
                    System.out.println("Price of one  is 50Rs");
                    double cost2 =answer4 *50;
                    System.out.println("Your Burger cost : "+cost2);
                    break;

                case FISH:
                    System.out.println("How much peases you want?");
                    int answer5 =scan.nextInt();
                    System.out.println("Price of one peice is 20Rs");
                    double cost3 =answer5 *20;
                    System.out.println("Your Fish cost : "+cost3);
                    break;

                case CHICKEN:
                    System.out.println("How much peases you want?");
                    int answer6 =scan.nextInt();
                    System.out.println("Price of one peice  is 40Rs");
                    double cost4 =answer6 *40;
                    System.out.println("Your Chicken cost : "+cost4);
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;


            }
            scan.close();



        } else if (answer1.equals("NO")) {
            System.out.println("Okay.Have a Nice Day!");
            
        }else {
            System.out.println("Try Again");
        }


    }
}
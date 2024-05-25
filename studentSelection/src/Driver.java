import  java.util.Scanner;
public class Driver {
    public static void main(String[]args){
    System.out.println("enter the number of students:");
    Scanner scan = new Scanner(System.in);
    int numStudents = scan.nextInt();
    String[] student = new String[numStudents];
    int [] age = new int[numStudents];
    Scanner scanName = new Scanner(System.in);
    Scanner scanAge = new Scanner(System.in);

    for (int i=0;i<numStudents; i++){
        System.out.println("Enter name: ");
        student[i] = scanName.nextLine();
        System.out.println("Enter age: ");
        age[i] = scanAge.nextInt();
    }
for (int i =0; i<numStudents; i++){
    if (age[i] >=15){
        System.out.println(student[i]+ "can receive the vaccination ");
        System.out.println("The student is now "+age[i]);
    }
scan.close();
    scanAge.close();
    scanName.close();
}
    }
}

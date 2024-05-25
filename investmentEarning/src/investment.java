import java.util.Scanner;
import  java.text.*;
public class investment {
    public static void main(String[] args){
 Scanner scan =new Scanner(System.in);
 System.out.println("Enter your buying price: ");
 double buyingPrice =scan.nextDouble();
        double closingPrice =scan.nextDouble();
 int day =1;
 double ClosingPrice = 0.1;
 
 while (true){
     System.out.println("enter the closing price for day : " +day + "(any negative value to leave : ");
closingPrice  =scan.nextDouble();
if (closingPrice<0.0)break;
double earnings = closingPrice - buyingPrice;
if (earnings>0.0){
    System.out.println("After day "+day+ ", you earned "+earnings+" per share. " );
}
else if(earnings < 0.0){
         System.out.println("After day "+day+ ", you lost "+earnings+" per share. " );
}else{
         System.out.println("After day "+day+ ", you have not earned nothing per share. " );

     }

day +=1;
    }
 scan.close();
}
    }

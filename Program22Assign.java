import java.util.*;
public class Program22Assign {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       // Calculate Commission Percentage
       double CommissionAmount = 0;
       System.out.println("Enter the actual money earned from the sales.");
       if(sc.hasNextDouble()){
       CommissionAmount = sc.nextDouble();
       }
       else{
        sc.next();
        System.out.println("Error: Entered Commission Amount is not a Valid Numeric Digit.");
        sc.close();
        return;
       }
       // Taking Sales Volume 
       double SalesVolume = 0;
       System.out.println("Enter the gross price of items or service sold.");
       if(sc.hasNextDouble()){
        SalesVolume = sc.nextDouble();
       }
       else{
        sc.next();
        System.out.println("Error: Entered Sales Volume is not a Valid Numeric Digit.");
        sc.close();
        return;
       }
       if(SalesVolume<=0){
        System.out.println("Error: Sales amount must be greater than zero.");
        sc.close();
        return;
       }
       // Calculating Percentage
       double Percentage = (CommissionAmount / SalesVolume) * 100;
       System.out.println("Your Commission Percentage comes out to be : "+Percentage);
       sc.close();
    }
}

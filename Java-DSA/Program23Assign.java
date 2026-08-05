import java.util.*;
public class Program23Assign {
    public static void main(String[] args) {
        // Power In Java
        Scanner sc =new Scanner(System.in);
        double base = 0;
        System.out.println("Enter the base value.");
        if(sc.hasNextDouble())
        {
         base = sc.nextDouble();
        }
        else{
            sc.next();
            System.out.println("Error: Entered Base value is not a Valid Numeric Digit. ");
            sc.close();
            return;
        }
        double exponent = 0;
        System.out.println("Enter the exponent of the base value.");
        if(sc.hasNextDouble()){
            exponent = sc.nextDouble();
        }
        else{
           sc.next();
            System.out.println("Error: Entered exponent value is not a Valid Numeric Digit. ");
            sc.close();
            return; 
        }
        if(exponent == 0){
            System.out.println("The result coming is : 1");
            sc.close();
            return;
        }
        else {
            double result = Math.pow(base, exponent);
            System.out.println("The power of the base is coming out to be :"+result);
        }
        sc.close();
    }
}

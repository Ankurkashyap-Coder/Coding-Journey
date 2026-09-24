

import java.util.*;

public class Program27Assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Compound Interest Java Program
        double principal;
        System.out.println("Enter the initial sum of invested or Borrowed money.");
        if(sc.hasNextDouble()){
            principal = sc.nextDouble();
        }
        else{
            sc.next();
            System.out.println("Error: Entered Principal is not a valid numeric digit.");
            sc.close();
            return;
        }
        // Inputing Rate 
        double rate;
        System.out.println("Enter the rate applied on the amount.");
         if(sc.hasNextDouble()){
            rate = sc.nextDouble();
         }
         else{
            sc.next();
            System.out.println("Error: Entered rate is not a valid numeric digit.");
            sc.close();
            return;
         }
         // Inputing Time 
         double years;
         System.out.println("Enter the time (in years like 1 or 2 like this) for how much the rate applied.");
         if(sc.hasNextDouble()){
            years = sc.nextDouble();
         }
         else{
            sc.next();
            System.out.println("Error: Entered years is not a valid numeric digit.");
            sc.close();
            return;
         }
         // Inputing compounding Frequency
         double frequency;
         System.out.println("Enter the compounding frequency (number of times interest per year).");
         if(sc.hasNextDouble()){
         frequency = sc.nextDouble();
         }
         else{
            sc.next();
            System.out.println("Error: Entered frequency is not a valid numeric digit.");
            sc.close();
            return;
         }
         if(frequency > 0){
         // Calculating Compound Interest
         double totalAmount = principal * Math.pow((1 + (rate / (100 * frequency ))) , frequency * years );
         double interest = totalAmount - principal;
         System.out.println("Compound Interest is : "+ interest);
         }
         else{
            System.out.println("Error: Frequency must be greater than zero try again.");
            sc.close();
            return;
         }
         sc.close();
    }
}

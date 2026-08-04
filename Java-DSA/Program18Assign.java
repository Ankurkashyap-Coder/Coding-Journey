import java.util.*;
public class Program18Assign {
    public static void main(String[] args) {
      // Calculate Electricity Bill
      Scanner sc =new Scanner(System.in);
      double units;
      final double tax = 8;
      final double FIXED_PER_KW = 80;
      final double FIXED_PER_UNIT = 6.50;
      System.out.println("Enter the total units consumed by you.");  
      if(sc.hasNextDouble()){
        units = sc.nextDouble();
      }
      else{
        sc.next();
        System.out.println("Error: Entered units is not a Valid Numeric Digit.");
        sc.close();
        return;
      }
      double load;
      System.out.println("Enter the load or KWH taken by you at your home or working Place(Example: 2  or 5 ).");
      if(sc.hasNextDouble()){
           load = sc.nextDouble();
      }
      else{
        sc.next();
        System.out.println("Error: Entered Load is not a Valid Numeric Digit.");
        sc.close();
        return;
      }
      double EnergyCharge = units * FIXED_PER_UNIT;
      double FixedLoadCharge = load * FIXED_PER_KW;
      double Taxamount = EnergyCharge * (tax / 100);
      double TotalBill = EnergyCharge + FixedLoadCharge + Taxamount;
      System.out.println("Your Desired Bill for Electricity consumption is : "+TotalBill);
sc.close();
    }
    
}

import java.util.*;
public class Program24Assign {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       // Calculate Depreciation of Value 
       double initialValue = 0;
       System.out.println("Enter the starting cost of item.");
       if(sc.hasNextDouble()){
        initialValue = sc.nextDouble();
       }
       else{
        sc.next();
        System.out.println("Error: Entered initial cost is not a valid numeric digit.");
        sc.close();
        return;
       }
       double rate;
       System.out.println("Enter the rate between 0 to 100.");
       if(sc.hasNextDouble()){
        rate = sc.nextDouble();
       }
       else{
        sc.next();
        System.out.println("Error: Entered rate is not a valid numeric digit.");
        sc.close();
        return;
       }
       double time;
       System.out.println("Enter the time period for it.");
       if(sc.hasNextDouble()){
        time = sc.nextDouble();
       }
       else{
        sc.next();
        System.out.println("Error: Entered time is not a valid numeric digit.");
        sc.close();
        return;
       }
       if(initialValue >= 0 && time >= 0 && rate >= 0 && rate <= 100 ){
       // Calculation occur
       double DepreciationValue = Math.floor(initialValue * Math.pow((1 - (rate / 100.0)) , time));
       System.out.println("Your Depreciation final value is : "+DepreciationValue);
       }
       else{
        System.out.println("Some value from initial Value , rate and time is not Positive make it positive and try again.");
        sc.close();
        return;
       }
       sc.close();
    }
}

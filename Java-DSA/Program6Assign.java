import java.util.*;
public class Program6Assign {
    public static void main(String[] args) {
        //6. Input currency in rupees and output in USD.
       Scanner sc=new Scanner(System.in);
       final double USD_TO_INR=95.39;
       double rupees=0;
       System.out.println("Enter your Rupees amount whom you want to be in USD");
       if(sc.hasNextDouble()){
         rupees= sc.nextDouble();
       }
       else{
        System.out.println("Error: Your inputed number is not an Valid Numeric or Decimal Digit");
        sc.close();
        return;
       }
       // Main Logic: 1 USD = 95.39 Rupees Currently
       double RupeesTOusd= rupees / USD_TO_INR; //(Only workable if 1 USD is 95.39 if it changes we have to Update this!!)
       System.out.println("Your Rupees in USD is: "+RupeesTOusd);
       System.out.println("Happy Coding!");
       sc.close();
    }
}

import java.util.*;
public class Program3Assign {
    public static void main(String[] args) {
        //3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
       Scanner sc=new Scanner(System.in);
       double Principal=0;
       double rate=0;
       double time=0;
       //Taking input of Principal and checking whether it is Valid 
       System.out.println("Enter Principal amount for calculating Simple Interest");
       if(sc.hasNextDouble()){
        Principal= sc.nextDouble();
       }
       else{
        System.out.println("Error: Invalid numeric input for Principal.");
        sc.close();
        return;
       }
       //Taking Input of rate and checking if it is Valid 
       System.out.println("Enter the rate which apply in Simple Interest");
       if(sc.hasNextDouble()){
       rate=sc.nextDouble();
       }
       else{
        System.out.println("Error: Invalid numeric input.");
            sc.close();
            return;
       }
      //Taking input of time and checking whether it is Valid 
       System.out.println("Enter the time period for which the Rate apply to your Principal Amount");
       if(sc.hasNextDouble()){
       time=sc.nextDouble();
       }
       else{
        System.out.println("Error: Invalid numeric Input.");
        sc.close();
        return;
       }
       //Calculating Simple Interest 
       double calcSimpleInterest= (Principal*rate*time)/100;
       System.out.println("Your calculated Simple Interest is: "+calcSimpleInterest);
       System.out.println("Enjoy! Happy Coding");
       
       sc.close();
    }
}

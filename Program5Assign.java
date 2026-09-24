import java.util.*;
public class Program5Assign {
    public static void main(String[] args) {
        // 5. Take 2 numbers as input and print the largest number.
       Scanner sc= new Scanner(System.in);
       int num1=0;
       int num2=0;
       System.out.println("Enter first number:");
       if(sc.hasNextInt()){
         num1=sc.nextInt();
       }
       else{
        System.out.println("Error: Entered input is not an numeric digit");
        sc.close();
        return;
       }
       System.out.println("Enter the second Number: ");
       if(sc.hasNextInt()){
        num2=sc.nextInt();
       }
       else{
        System.out.println("Error: Entered input is not an numeric digit");
        sc.close();
        return;
       }
       //Calculating Largest Number using Ternary Operator
       int result= num1>num2 ? num1:num2;
       System.out.println("The largest number from these two numbers "+ num1 +" " + "and" + " " + num2 + " " +"is : "+result);
       System.out.println("Happy Coding!!");
       sc.close();
    }
}

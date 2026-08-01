import java.util.*;
public class Program7Assign {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int limit=0;
     int a=0;
     int b=1;
     int c=0;
     System.out.println("Enter the limit of Fibonacci Series You want : ");
     if(sc.hasNextInt()){
       limit= sc.nextInt();
       if(limit<=1){
        System.out.println("Your limit value is less update the value to at least 2 or above so that it works.");
        sc.close();
        return;
       }
       else{
       System.out.print("Fibonacci Series are : ");
       System.out.print(a+ " " +b+" ");
       // We run loop from 1 to limit - 1 because we print two digits before  
     for(int i=1;i<limit-1;i++){
        c=a+b;
        System.out.print(c+ " ");
        // Swapping Number : Because Main logic is we have to just sum the first number and second number and print it (Like 0 1 1 2 3 5)
        a=b;
        b=c;
     } 
       }
     }
     else{
        System.out.println("Error: Entered Limit is not a Valid Numeric digit!!");
        sc.close();
        return;
     } 
     System.out.println();
     System.out.println("Happy Coding!!"); 
     sc.close();
    }
}

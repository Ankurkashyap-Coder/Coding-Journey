import java.util.*;
public class Program15Assign {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Take integer inputs till the user enters 0 and print the sum of all numbers 
        int sum = 0;
        int num = 0;
        System.out.println("Enter the number  you want to be summed and enter 0 if want to display sum.");
        num= sc.nextInt();
        while(num!=0){
            
             sum += num;
             num =sc.nextInt();
        }
        System.out.println("Sum of all the numbers till user entered 0 is : "+sum);
        sc.close();
    }
}

import java.util.Scanner;

public class Program32Assign {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
         int num;
         System.out.println("Enter the number you want a factorial. ");
         if(sc.hasNextInt()){
            num = sc.nextInt();
         }
         else{
            sc.next();
            System.out.println("Error: Entered number is not a valid numeric digit.");
            sc.close();
            return;
         }
         if (num < 0) {
    System.out.println("Error: Factorial is not defined for negative numbers.");
    sc.close();
    return;
}
         long result = Factorial(num);
         System.out.println("Your desired output for the inputed factorial :"+result);
         sc.close();
    }
    static long Factorial(int num){
        long sum1 = 1;
        if(num == 0)
        {
            return 1;
        }
        else{
          for(int i=1;i<=num;i++){
            sum1 = sum1 * i;
          }
        }
        return sum1;
    }
}

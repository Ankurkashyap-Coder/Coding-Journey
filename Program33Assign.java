import java.util.*;
class Program33Assign
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Write a function to check if a given triplet is a Pythagorean triplet or not.
       double num1;
       System.out.println("Enter the numbers you want to check that it is a Pythagorean Triplet or not.");
       System.out.println("Enter the first number.");
       if(sc.hasNextDouble()){
        num1 = sc.nextDouble();
       }
       else {
        sc.next();
        System.out.println("Error: Entered number is not a valid numeric digit.");
        sc.close();
        return;
       }
       double num2;
       System.out.println("Enter the second number.");
       if(sc.hasNextDouble()){
        num2 = sc.nextDouble();
       }
       else{
        sc.next();
        System.out.println("Error: Entered number is not a valid numeric digit.");
        sc.close();
        return;
       }
       double num3;
       System.out.println("Enter the third number.");
       if(sc.hasNextDouble()){
        num3 = sc.nextDouble();
       }
       else{
        sc.next();
        System.out.println("Error: Entered number is not a valid numeric digit.");
        sc.close();
        return;
       }
       if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
    System.out.println("Error: Triangle side lengths must be positive numbers greater than zero.");
    sc.close();
    return;
}

       boolean result = pythagoreanTriplet(num1, num2 , num3);
       if(result){
        System.out.println("Enter numbers form the Pythagorean Triplet.");
       }
       else{
        System.out.println("Enter numbers do not form a Pythagorean Triplet.");
       }
       sc.close();
    }
    static boolean pythagoreanTriplet(double num1, double num2, double num3){
          if(num1 * num1 + num2 * num2 == num3 * num3 || num2 * num2 + num3 * num3 == num1 * num1 || num1 * num1 + num3 * num3 == num2 *num2){
            return true;
          }
          else{
            return false;
          }
    }
}
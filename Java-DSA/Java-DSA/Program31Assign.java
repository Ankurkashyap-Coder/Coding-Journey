import java.util.Scanner;

public class Program31Assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        int num1;
        int num2;
        int num3;
        System.out.println("Enter the first one from three numbers.");
        if(sc.hasNextInt()){
            num1 = sc.nextInt();
        }
        else{
            sc.next();
            System.out.println("Error: Entered number is not a valid numeric digit.");
            sc.close();
            return;
        }
        System.out.println("Enter the second one from three numbers.");
        if(sc.hasNextInt()){
            num2 = sc.nextInt();
        }
        else{
            sc.next();
            System.out.println("Error: Entered number is not a valid numeric digit.");
            sc.close();
            return;
        }
        System.out.println("Enter the third one from three numbers.");
        if(sc.hasNextInt()){
            num3 = sc.nextInt();
        }
        else{
            sc.next();
            System.out.println("Error: Entered number is not a valid numeric digit.");
            sc.close();
            return;
        }

        int result1 = minimum(num1 , num2 , num3);
        int result2 = maximum(num1 , num2, num3);
        System.out.println("Minimum number among the three input is : "+result1);
        System.out.println("Maximum number among the three input is : " +result2);
        sc.close();
    }
    // Function for Calculating Minimum of three inputed numbers
    static int minimum(int num1 , int num2, int num3)
    {
        int result1 = num1 > num2 ? num2 : num1;
        int finalresult = result1 > num3 ? num3 : result1;
        return finalresult;
    }
    // Function for Calculating Maximum of three inputed numbers
    static int maximum(int num1 , int num2, int num3)
    {
        int result1 = num1 < num2 ? num2 : num1;
        int finalresult = result1 < num3 ? num3 : result1;
        return finalresult;
    }
}

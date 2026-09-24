import java.util.*;
public class Program13Assign {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num =sc.nextInt();
        int result = subtractProductAndSum(num);
        System.out.println("Your desired output is : "+result);
        sc.close();
    }
    public static int subtractProductAndSum(int n) {
        int result;
        int multi = 1;
        int sum = 0;
        // For Loop for extracting digits
        while(n>0){
           int digit = n % 10;
           multi *=digit;
           sum +=digit;
           n /=10;
        } // Result of subtration and Multiplication of digits
        result = multi - sum;
        return result;
}

}
    


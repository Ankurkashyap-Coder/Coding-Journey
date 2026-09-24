import java.util.*;
public class Program17Assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Factorial Program In Java
        int num;
        System.out.println("Enter the number whom you want the Factorial between 0 to 20.");
        if(sc.hasNextInt())
        {
            num = sc.nextInt();
        }
        else{
            sc.next();
            System.out.println("Error: Entered number is not a Valid Numeric Digit.");
            sc.close();
            return;
        }
        if(num < 0){
            System.out.println("Factorial of negative number is not allowed.");
            sc.close();
            return;
        }
        if(num == 0){
            System.out.println("Factorial of inputed number is : 1");
        }
        else {
            long factorial = 1;
            for(int i=1;i<=num;i++){
                factorial = factorial * i;
            }
            System.out.println("Factorial of inputed number is : "+factorial);
     
        }
        sc.close();
    }
}

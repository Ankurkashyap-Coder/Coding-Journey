import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number for sum");
        //Let's check whether number is valid or not may be some user write five in spite of "5"
        if(!sc.hasNextDouble()){
            System.out.println("Enter number is not valid");
            sc.close();
            return;
        }
        double num1=sc.nextDouble();
        System.out.println("Enter second number for sum");
        //Checking second number validity
        if(!sc.hasNextDouble()){
            System.out.println("Enter number is not valid");
            sc.close();
            return;
        }
        double num2=sc.nextDouble();
        double sum= calculatesum(num1, num2);
        System.out.println("The sum of two number is : "+sum);
        sc.close();
    }
    static double calculatesum(double num1, double num2){
        return num1 + num2;
    }
}

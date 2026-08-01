import java.util.*;
public class Program4Assign {
    public static void main(String[] args) {
        // 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Using if conditions)
        Scanner sc= new Scanner(System.in);
        double num1=0;
        double num2=0;
        System.out.println("Enter First number");
        if(sc.hasNextDouble()){
            num1=sc.nextDouble();
        }
        else{
            System.out.println("Invalid: Enter a Valid numeric Value");
            sc.close();
            return;
        }
        //Taki g and checking second Input
        System.out.println("Enter Second number");
        if(sc.hasNextDouble()){
            num2=sc.nextDouble();
        }
        else{
            System.out.println("Invalid: Enter a Valid numeric Value");
            sc.close();
            return;
        }
        //Now lets take input which operator user want to do the operation
        System.out.println("Enter the operator which you want to use to do operation with numbers");
        System.out.println("Menu: \n 1. For Addition \n 2. For Subtraction \n 3. For Multiplication \n 4. For Division \n 5. For Modulus" );
        int operator=sc.nextInt();
        if(operator==1){
            double result= num1+num2;
            System.out.println("Your Desired operation (+) is: "+result);
            System.out.println("Happy Coding!");
        }
        if(operator==2){
            double result=num1-num2;
            System.out.println("Your Desired operation (-) is: "+result);
            System.out.println("Happy Coding!");
        }
        if(operator==3){
            double result= num1*num2;
            System.out.println("Your Desiredoperation (*) is: "+result);
            System.out.println("Happy Coding!");
        }
        if(operator==4){
            if(num1>num2){
                if(num2==0){
                    System.out.println("Second number don't be zero");
                } else{
            double result= num1/num2;
         System.out.println("Your Desiredoperation (/) is: "+result);
            System.out.println("Happy Coding!");
                }
        }else{
            if(num1==0){
                System.out.println("First number don't be zero");
            }
            double result1 =num2/num1;
            System.out.println("Your Desiredoperation (/) is: "+result1);
            System.out.println("Happy Coding!");
        }
        }
        if(operator==5){
            if(num1>num2){
                if(num2==0){
                    System.out.println("Second number don't be zero");
                } else{
            double result= num1%num2;
         System.out.println("Your Desiredoperation (%) is: "+result);
            System.out.println("Happy Coding!");
                }
        }else{
            if(num1==0){
                System.out.println("First number don't be zero");
            } else{
            double result1 =num2%num1;
            System.out.println("Your Desiredoperation (%) is: "+result1);
            System.out.println("Happy Coding!");
            }
        }
        }
        sc.close();
    }
}

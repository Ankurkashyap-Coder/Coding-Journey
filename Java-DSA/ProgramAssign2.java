import java.util.*;
public class ProgramAssign2 {
    public static void main(String[] args) {
      //Program to check whether a number is even or odd
      Scanner ob=new Scanner(System.in);
      System.out.println("Enter the number to check whether the number is even or odd");
      if(!ob.hasNextInt()) {
        System.out.println("Not a valid Number enter the valid number");
      }
      else{
        int num=ob.nextInt();
        if(num%2==0){
            System.out.println("Entered number "+num + " " + "is a Even Number.");
        }
        else{
            System.out.println("Entered number "+num + " " + "is a Odd Number.");
        }
      }
       ob.close();
    }
    
}

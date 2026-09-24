import java.util.Scanner;

public class Program16Assign {
    public static void main(String[] args) {
        // Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter the numbers to give you the largest of them and if you wnat to stop enter zero.");
        if(sc.hasNextInt()){
             num= sc.nextInt();
        }
        else{
            sc.next();
            System.out.println("Error: Entered number is not a Valid Numeric Digit.");
            sc.close();
            return;
        }
        int result = num;
        
        while(num!=0){
        if(num > result){
            result = num;
            
        }
        if(sc.hasNextInt()){
            num = sc.nextInt();
        }
        else{
           sc.next();
            System.out.println("Error: Entered number is not a Valid Numeric Digit.");
            sc.close();
            return; 
        }
    }
    System.out.print("Greatest of all these inputed numbers is : "+ result);
    sc.close();
}
}


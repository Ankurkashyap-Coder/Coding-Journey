import java.util.Scanner;

public class Program19Assign {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Calculate Average Of N Numbers
        
        double num;
        System.out.println("Enter the numbers whom average you want.");
        if(sc.hasNextDouble()){
            num = sc.nextDouble();
        }
        else{
            sc.next();
            System.out.println("Error: Entered number is not a Valid Numeric Digit.");
            sc.close();
            return;
        }
        double sum = 0;
        double count = 0;
        while(num !=0){
            sum +=num;
            count ++;
        
        if(sc.hasNextDouble()){
            num =sc.nextDouble();
        }
        else{
           sc.next();
            System.out.println("Error: Entered number is not a Valid Numeric Digit.");
            sc.close();
            return; 
        }
    }
    if(count == 0){
        System.out.println("You have not entered any number so no answer is coming try by entering some numbers.");
        sc.close();
        return;
    }
     double average = sum / count;
        System.out.println("Your Desired output for the averages of number is : "+average);
          sc.close();
    }
    
}



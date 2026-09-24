import java.util.*;
public class Program20Assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Calculate Discount Of Product
        double CP;
        double Discount;
        System.out.println("Enter the Cost prise of Item.");
        if(sc.hasNextDouble()){
          CP = sc.nextDouble();
        }
        else{
            sc.next();
            System.out.println("Error: Entered CP is not a Valid Numeric digit.");
            sc.close();
            return;
        }
        System.out.println("Enter the discount in number not include percentage(%) sign.");
        if(sc.hasNextDouble()){
            Discount= sc.nextDouble();
        }
        else{
            sc.next();
            System.out.println("Error: Entered discount is not a Valid numeric Digit.");
            sc.close();
            return;
        }
        double SP = CP - ((Discount / 100) * CP);
        System.out.println("Your current Price of item after discount is : "+SP);
        sc.close();
    }
}

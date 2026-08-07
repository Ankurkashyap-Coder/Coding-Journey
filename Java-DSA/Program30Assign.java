import java.util.Scanner;

public class Program30Assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Future Investment Value
        double principalvalue;
        System.out.println("Enter the initial sum of money you invest right now.");
        if(sc.hasNextDouble()){
            principalvalue = sc.nextDouble();
        }
        else {
            sc.next();
            System.out.println("Error: Entered principal value is not a valid numeric digit.");
            sc.close();
            return;
        }
        double interest;
        System.out.println("Enter the annual growth in percentage rate.");
        if(sc.hasNextDouble()){
            interest = sc.nextDouble();
        }
        else{
            sc.next();
            System.out.println("Error: Entered interest is not a valid numeric digit.");
            sc.close();
            return;
        }
        double years;
        System.out.println("Enter numbers of the years you want to leave money to be invested.");
        if(sc.hasNextDouble()){
            years = sc.nextDouble();
        }
        else {
            sc.next();
            System.out.println("Error: Entered years is not a valid numeric digit.");
            sc.close();
            return;
        }
        if (principalvalue < 0 || interest < 0 || years < 0) {
    System.out.println("Error: Principal value, interest rate, and years must be positive or zero.");
    sc.close();
    return;
}
        double futurevalue = principalvalue * Math.pow((1 + (interest / 100.0)) , years);
        System.out.println("The Future Value comes out to be : "+futurevalue);
        sc.close();
    }
}

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter Principal Amount");
        double principal=in.nextDouble();

        System.out.println("Enter Time period(years): ");
        float time=in.nextFloat();

        System.out.println("Enter Annual Interest Rate (%): ");
        float rate= in.nextFloat();

        double si=(principal* time* rate)/100;
        System.out.println("The calculated Simple Interest is: "+ si );

        in.close();
    }
}

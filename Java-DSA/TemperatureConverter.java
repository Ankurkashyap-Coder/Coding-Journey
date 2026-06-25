import java.util.Scanner;
public class TemperatureConverter
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         System.out.println("Enter temperature in Celcius:");
         float tempCelcius= in.nextFloat();

         //Formula: (C*(9/5))+32;
         // Use 5.0f instaed of 5 to avoid losing precision due to integer division rules!
         float TempFar= (tempCelcius*9/5.0f) + 32;

         System.out.println("Temperature in Fahrenheit: "+ TempFar);
         in.close();
    }
}
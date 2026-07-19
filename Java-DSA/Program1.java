import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter year to check whether year is Leap year or not");
        int year= ob.nextInt();
        boolean ans= checkLeap(year);
        System.out.println("The inputed year is : "+year+" " + ans);
        ob.close();
    }
    // Function to check whether year is Leap or not
    static boolean checkLeap(int year){
       return (year%4==0 && year%100!=0)||(year%400==0);
       //We check for divisibility by 100 because a solar year (the time it takes Earth to orbit the Sun)
       //  is not exactly 365.25 days. It is actually closer to 365.2422 days.
    }
}

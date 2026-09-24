import java.util.*;
public class Program25Assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Calculate Batting Average
        int totalruns;
        System.out.println("Enter the total runs scored by Batter.");
        if(sc.hasNextInt()){
            totalruns = sc.nextInt();
        }
        else{
            sc.next();
            System.out.println("Error: Entered runs is not a Valid Numeric Digits.");
            sc.close();
            return;
        }
        // Taking input how many times Batter out in the field
        int outs;
        System.out.println("Enter how many times batter out in the field.");
        if(sc.hasNextInt()){
            outs = sc.nextInt();
        }
        else{
             sc.next();
             System.out.println("Error: Entered number of times player out is not a Valid Numeric Digit.");
             sc.close();
             return;
        }
        // Calculating Batter Average
        if(outs == 0){
            System.out.println("Error: Out number should not be zero.");
            sc.close();
            return;
        }
        double average = (double) totalruns / outs;
        System.out.println("The batting average comes out to be : "+average);
        sc.close();
    }
}

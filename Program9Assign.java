import java.util.*;
public class Program9Assign {
    public static void main(String[] args) {
      // 9. To find Armstrong Number between two given number
      Scanner sc= new Scanner(System.in);
      int minLimit=0;
      int maxLimit=0;
      System.out.println("Enter the start Limit :");
      if(sc.hasNextInt()){
        minLimit=sc.nextInt();
      }  
      else{
        System.out.println("Error: Entered limit is not a Valid numeric Digit.");
        sc.close();
        return;
      }
      System.out.println("Enter your Maximum limit:");
      if(sc.hasNextInt()){
        maxLimit=sc.nextInt();
      }  
      else{
        System.out.println("Error: Entered limit is not a Valid numeric Digit.");
        sc.close();
        return;
      }
      System.out.println("ArmStrong Numbers between "+ minLimit + " " + " and "+ maxLimit + " are :");
      for(int i=minLimit;i<=maxLimit;i++){
        if(Armstrong(i)){
            System.out.print(i+" ");
        }
      }
      System.out.println();
      System.out.println("Happy Coding!!");
      sc.close();
    }
    static boolean Armstrong(int limit){
        int copy= limit;
        int digit=0;
        int sum=0;
        while(limit>0){
           digit= limit%10;
           sum+= Math.pow(digit, 3); 
           limit/=10;
        }
        if(copy==sum){
            return true;
        }
        else{
            return false;
        }
    }
}

import java.util.*;
public class Program21Assign {
    public static void main(String[] args) {
      // Calculate Distance Between Two Points
      Scanner sc = new Scanner(System.in);
      
      double x1 = 0;
      double x2 = 0;
      double y1 = 0;
      double y2 = 0;
      // For Point 1
      System.out.println("Enter the x coordinate for Point1 (x1). ");
      if(sc.hasNextDouble()){
         x1= sc.nextDouble();
      } 
      else{
        sc.next();
        System.out.println("Error : Entered point is not a Valid Numeric Digit.");
        sc.close();
        return;
      }
      System.out.println("Enter the y coordinate of Point1 (y1).");
      if(sc.hasNextDouble()){
         y1= sc.nextDouble();
      } 
      else{
        sc.next();
        System.out.println("Error : Entered point is not a Valid Numeric Digit.");
        sc.close();
        return;
      }
      // For Point 2  
      System.out.println("Enter the x coordinate of Point2 (x2).");
      if(sc.hasNextDouble()){
         x2= sc.nextDouble();
      } 
      else{
        sc.next();
        System.out.println("Error : Entered point is not a Valid Numeric Digit.");
        sc.close();
        return;
      }
      System.out.println("Enter the y coordinate of Point2 (y2).");
      if(sc.hasNextDouble()){
         y2= sc.nextDouble();
      } 
      else{
        sc.next();
        System.out.println("Error : Entered point is not a Valid Numeric Digit.");
        sc.close();
        return;
      }
      // Calculating Distance between two Points
      double length = Math.sqrt(Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1) , 2));
      System.out.println("Your Desired distance between two points is : "+length);
      sc.close();
    }
}

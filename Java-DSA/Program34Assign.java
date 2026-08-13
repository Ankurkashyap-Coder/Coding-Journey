import java.util.Arrays;
import java.util.Scanner;

public class Program34Assign {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Build Array from Permutation
        int length;
        System.out.println("Enter the size of array.");
        if(sc.hasNextInt()){
             length = sc.nextInt();
            
        }
        else{
            System.out.println("Error: Entered number is not a Valid Numeric Digit.");
            sc.close();
            return;
        }
        int[] arr = new int[length];
        System.out.println("Enter elements in array.");
        for (int i = 0; i <length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Desired answer is :"+  Arrays.toString(buildArray(arr)));
        sc.close();
    }
    
        
     static int[] buildArray(int[] nums) {
        int copy;
        int result;
       int[] arr = new int[nums.length];
       for(int i=0;i<nums.length;i++){
        copy = nums[i];
        result = nums[copy];
        arr[i] = result;
       } 
       return arr;
    }
    
}
    


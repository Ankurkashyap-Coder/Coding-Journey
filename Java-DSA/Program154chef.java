import java.util.Scanner;

public class  Program154chef{
    public static void main(String[] args) {
        // https://www.codechef.com/practice/course/arrays/ARRAYS/problems/LARGESECOND
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
        int t = scanner.nextInt();

        while (t-- > 0) {
            System.out.println("Enter the size of array");
            int n = scanner.nextInt();
            int[] a = new int[n];
            System.out.println("Enter the elements in array");
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
           int max = 0;
           int min = 0;
           for(int j=0;j<n-1;j++){
            if(a[j] > max){
                max = a[j];
            }
               }
               for(int k = 0;k<n;k++){
                   if(a[k] > min && a[k] != max){
                       min = a[k];
                   }
               }
               System.out.println("The maximum sum of two distinct number in array is : ");
                      System.out.println(max + min);
           }
            
        scanner.close();
    }
}

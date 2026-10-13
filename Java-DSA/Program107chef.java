import java.util.*;
import java.math.BigInteger;

class Program107chef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/FCTRL2?tab=statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            
            for (int i = 0; i < T; i++) {
                System.out.println("Enter the number whom factorial you want (between 1 to 100");
                int n = sc.nextInt();
                BigInteger factorial = BigInteger.ONE;
                
                
                for (int j = 2; j <= n; j++) {
                    factorial = factorial.multiply(BigInteger.valueOf(j));
                }
                
                System.out.println(factorial);
            }
        }
        sc.close();
    }
}
import java.util.*;
import java.math.BigInteger;


class Program138chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
         // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/FLOW018
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    System.out.println("Enter the number whom factorial you want ");
		    for(int i=0;i<T;i++){
		        
		        int N = sc.nextInt();
		        System.out.println("The factorail is : ");
		       BigInteger result = BigInteger.ONE;
		        while(N > 0){
		            result = result.multiply(BigInteger.valueOf(N));
		            N--;
		        }
		        System.out.println(result);
		    }
		}
           sc.close();
	}
}

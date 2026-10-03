import java.util.*;


class Program87chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/MONOPOLY2
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of test case user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the Profit of first company A");
		        int P = sc.nextInt();
                System.out.println("Enter the Profit of first company B");
		        int Q = sc.nextInt();
                System.out.println("Enter the Profit of first company C");
		        int R = sc.nextInt();
                System.out.println("Enter the Profit of first company D");
		        int S = sc.nextInt();
		        
		        
		        
		        if((P+Q+R) < S || (P+Q+S) < R || (P+R+S) < Q || (Q+R+S) < P)
		        {
		           System.out.println("YES"); 
		        }
		        else{
		            System.out.println("NO");
		        }
		    }
		}
          sc.close();
	}
}

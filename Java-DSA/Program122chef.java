import java.util.*;


class Program122chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/WTRMIXING?tab=statement
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the initial temperature of Bath tub");
		        int A = sc.nextInt();
                System.out.println("Enter the desired temperature of Bath tub");
		        int B  = sc.nextInt();
                System.out.println("Enter the amount of Hot Water");
		        int X = sc.nextInt();
                System.out.println("Enter the amount of Cold Water");
		        int Y = sc.nextInt();
		         System.out.println("The chef get the desired temperature for Bath : ");
		        if((A - Y) <= B && B <= (A + X)){
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

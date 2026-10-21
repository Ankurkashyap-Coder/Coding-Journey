import java.util.*;


class Program125chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHEFEREN?tab=statement
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the number of episode");
		        int N = sc.nextInt();
                System.out.println("Duration of Episode in even indexes");
		        int A = sc.nextInt();
                System.out.println("Duration of Episode in odd indexes");
		        int B = sc.nextInt();
		        System.out.println("The total duration of episode is : ");
		        if( N %2 == 0){
		            int result = (N / 2) * A + (N / 2) * B;
		            System.out.println(result);
		        }
		        else{
		           int even = N / 2;
		           int odd =  1 + (N / 2);
		           int result = (even * A) + (odd * B);
		            System.out.println(result);
		        }
		    }
		}
          sc.close();
	}
}

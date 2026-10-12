import java.util.*;


class Program106chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/FINDSHOES
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        
                System.out.println("Enter the pair of shoes chef needed");
		        int N = sc.nextInt();
                System.out.println("Enter the number of left shoes chef have");
		        int M = sc.nextInt();
		        
                System.out.println("Chef need to buy the number of shoes is :");
		        if(M >= N){
		            System.out.println(N);
		        }
		        else{
		            System.out.println((N * 2) - M);
		        }
		    }
		}
           sc.close();
	}
}

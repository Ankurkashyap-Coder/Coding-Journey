import java.util.*;


class Program149chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/DPOLY
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i = 0; i < T; i++){
            System.out.println("Enter the number of input user want to take");
		        int N = sc.nextInt();
		        int[] A = new int[N];
		        System.out.println("Enter the inputs");
		        for(int j = 0; j < N; j++){
		            A[j] = sc.nextInt();
		        }
		        
		        int degree = 0;
		        for(int k = 0; k < N; k++){
		            if(A[k] != 0){
		                degree = k;
		            }
		        }
                System.out.println("The highest position of the polynomial series is :");
		        System.out.println(degree);
		    }
		}
		sc.close();
	}
}

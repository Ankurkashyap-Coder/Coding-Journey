import java.util.*;


class Program112chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to test");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the number of empty Bottles chef have :");
		        int N = sc.nextInt();
                System.out.println("Enter the capacity of each Bootle");
		        int X = sc.nextInt();
                System.out.println("Enter the amount of water have : ");
		        int K = sc.nextInt();
		        System.out.println("The maximum number of bottles chef can fill completely is :");
		        if(X > K){
		            System.out.println(0);
		        }
		        else if(K > N && K > X){
		            if( (N * X) < K){
		                System.out.println(N);
		            }
		            else{
		                System.out.println(K / X);
		            }
		        }
		        
		        }
		    }
		sc.close();

	}
}

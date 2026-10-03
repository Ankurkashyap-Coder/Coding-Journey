import java.util.*;


class Program85chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/TRUESCORE
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tasks user wants to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
                System.out.println("Enter the initial scores");
		        int A = sc.nextInt();
		        int B = sc.nextInt();
		        System.out.println("Enter the future scores");
		        int C = sc.nextInt();
		        int D = sc.nextInt();
		        
		        
		        if(C >= A && D >= B){
		            
		            System.out.println("POSSIBLE");
		            }
		        else{
		            System.out.println("IMPOSSIBLE");
		        }
		    }
		}
           sc.close();
	}
}

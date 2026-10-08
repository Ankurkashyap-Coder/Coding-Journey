import java.util.*;


class Program97chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHEFSCORE
		Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    
		    
		    for(int i=0;i<T;i++){
		        int sum = 0;
		        int count = -1;
                System.out.println("Enter the number of problems chef solved");
		        int N = sc.nextInt();
                System.out.println("Marks obtained in each program");
		        int X = sc.nextInt();
                System.out.println("Marks needed to qualify");
		        int Y = sc.nextInt();
		        
		        for(int j=0;j<N;j++){
		            sum += X;
		            
		            if(sum == Y || Y == 0){
		                count = 0;
		                
		            }
		        }
		       if(count == -1){
		           System.out.println("NO, not qualified");
		       }
		       else{
		           System.out.println("YES, Qualified");
		       }
		    }
		}
          sc.close();
	}
}

import java.util.*;


class Program151chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/PRB01
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        int count = 0;
                System.out.println("Enter the number given by Alice to solve the math problem whether the number is Prime or not");
		        int N = sc.nextInt();
		        
		        for(int j=1;j<N;j++){
		            if(N % j == 0){
		                count++;
		            }
		        }
		        if(count == 1){
		            System.out.println("yes");
		        }
		        else{
		            System.out.println("no");
		        }
		    }
		}
           sc.close();
	}
}

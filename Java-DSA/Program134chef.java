import java.util.*;


class Program134chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
         // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/PASSORFAIL
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the number of problems");
		        int N = sc.nextInt();
                System.out.println("Enter the number of problems chef correct");
		        int X = sc.nextInt();
                System.out.println("Enter the marks needed to pass");
		        int P = sc.nextInt();
		        
		        int totalmarks_correct = X * 3;
		        int totalmarks_incorrect = (N - X) * (-1);
		        int total = totalmarks_correct + totalmarks_incorrect;
		        if(total >= P){
		            System.out.println("PASS");
		        }
		        else{
		            System.out.println("FAIL");
		        }
		    }
		    sc.close();
		}

	}
}

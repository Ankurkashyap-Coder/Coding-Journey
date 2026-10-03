import java.util.*;


class Program88chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/TODOLIST
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		         int count = 0;
            System.out.println("Enter the number of problems chef have to add in to do list");
		    int N = sc.nextInt();
            System.out.println("Enter the rating of each code");
		    for(int j =0;j<N;j++){
		        int D  = sc.nextInt();
		        if(D >= 1000){
		            count++;
		        }
		    }
            System.out.println("Code greater than 1000 are : ");
		    System.out.println(count);
		}
		
		}
          sc.close(); 
	}
}

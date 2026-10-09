import java.util.*;


class Program98chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/JENGA?tab=statement
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        
            System.out.println("Enter number of peoples");
		    int N = sc.nextInt();
            System.out.println("Enter the number of tiles");
		    int X = sc.nextInt();
		    
		    if(X % N == 0){
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

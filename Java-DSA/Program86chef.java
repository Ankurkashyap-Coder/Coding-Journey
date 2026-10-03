import java.util.*;


class Program86chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/THREETOPICS
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first topic chef prepared");
		if(sc.hasNextInt()){
		    
		    int A = sc.nextInt();
            System.out.println("Enter the second topic chef prepared");
		    int B = sc.nextInt();
            System.out.println("Enter the third topic chef prepared");
		    int C = sc.nextInt();
            System.out.println("Enter the topic given to chef during contest");
		    int X = sc.nextInt();
		    
		    if(X==A || X==B || X==C){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
           sc.close();
	}
}

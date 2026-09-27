import java.util.*;


class Program63chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/BESTOFTWO
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of tests you want to check.");
		if(sc.hasNextInt()){
		    int t = sc.nextInt();
		    
		    for(int i=0;i<t;i++){
		        System.out.println("Enter the marks score by Chef in First Atttempt");
		        int X = sc.nextInt();
                System.out.println("Enter the marks scored by chef in Second attempt.");
		        int Y = sc.nextInt();
		        System.out.println("Best score is going to be the:");
		        if(X >= Y){
		            System.out.println(X);
		        }
		        else{
		            System.out.println(Y);
		        }
		    }
		}
        sc.close();
	}
}

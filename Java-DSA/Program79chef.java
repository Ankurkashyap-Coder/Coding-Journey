import java.util.*;


class Program79chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/EXPERT
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of tasks user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
                System.out.println("Enter the problems submitted by Munchy for Approved");
		        int X= sc.nextInt();
                System.out.println("Enter number of Problem Approved");
		        int Y =sc.nextInt();
		        
		        int result = ((Y * 100) / X);
		        if(result>=50){
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

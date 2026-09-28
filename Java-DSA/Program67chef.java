import java.util.*;


class Program67chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/AVGPROBLEM
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter how many test you want to do");
	  if(sc.hasNextInt()){
	      int t = sc.nextInt();
	      
	      for(int i=0;i<t;i++){
            System.out.println("Enter first number");
	          int A = sc.nextInt();
              System.out.println("Enter second number");
	          int B = sc.nextInt();
              System.out.println("Enter third number");
	          int C = sc.nextInt();
	          
              // KEPT IN MIND IF YOU WANT TO SAVE AVERAGE AS DECIMAL DIVIDE BY 2.0
	          double average = (A + B) / 2.0;	          
	          
	          if(average > C)
	          {
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

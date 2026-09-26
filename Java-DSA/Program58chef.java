import java.util.*;


class Program58chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/AUDIBLE
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test syou want to test.");
        if(sc.hasNextInt()){
		int t =sc.nextInt();
		
		for(int i=0;i<t;i++){
            System.out.println("Enter the Frequency nuumber to check whether it is audible or not.");
		     int X = sc.nextInt();
		     if(X>=67 && X<=45000){
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

import java.util.*;


class Program55chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/DONDRIVE
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test you want ot Perform.");
		if(sc.hasNextInt()){
		    int t = sc.nextInt();
		    if(t>=1 && t<=200){
		    for(int i=0;i<t;i++){
                System.out.println("Enter the value of x");
		         int x = sc.nextInt();
                 System.out.println("Enter the value of n");
		         int n = sc.nextInt();
		         
		         
		                 if(x>=n){
		                 int result = x - n;
		                 System.out.println(result);
		                 }
		             }
		         }
		    
		    
		}
		sc.close();

	}
}

import java.util.*;


class Program49chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/LUDO
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests you want ot check.");
		if(sc.hasNextInt()){
		    int t = sc.nextInt();
		    if(t>=1 && t<=6)
		    for(int i=0;i<t;i++){
		        System.out.println("Enter the number comes upon the dice.");
		        int x = sc.nextInt();
		        if(x>=1 && x<=6)
		        
		        {
		            if(x == 6){
		                System.out.println("YES");
		            }
		            else{
		                System.out.println("NO");
		            }
		        }
		    }
		}
        sc.close();

	}
}

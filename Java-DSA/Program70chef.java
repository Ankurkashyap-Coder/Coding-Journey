import java.util.*;


class Program70chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/JASSIGNMENTS
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of tests you want ot check");
		if(sc.hasNextInt()){
		    int t =sc.nextInt();
		    
		    for(int i=0;i<t;i++){
		        System.out.println("Enter the time at which chef started his assignment");
		        int X =sc.nextInt();
		        
		        if((10 - X) >= 3){
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

import java.util.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/MINPIZZA
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of tests user wants to check");
		if(sc.hasNextInt()){
		    int t =sc.nextInt();
		    
		    for(int i=0;i<t;i++){
                System.out.println("Enter the number of friends");
		        int N =sc.nextInt();
                System.out.println("Enter the number of slices needed");
		        int X = sc.nextInt();
		        
		        int count = 4;
		        while(count< (N * X))
		        {
		            count += 4;
		        }
		        int result = count / 4;
                System.out.println("Minimum Pizza to be ordered is : ");
		        System.out.println(result);
		    }
		}
          sc.close();
	}
}

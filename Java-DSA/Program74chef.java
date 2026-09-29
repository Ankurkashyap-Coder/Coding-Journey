import java.util.*;

class Program74chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CREDCOINS
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check.");
		if(sc.hasNextInt()){
		    int t = sc.nextInt();
		    for(int i=0;i<t;i++){
                System.out.println("Enter the number of CRED coins");
		    int X = sc.nextInt();
            System.out.println("Enter the number of Bills chef have to pay");
		    int Y = sc.nextInt();
		    
		    int result = (X * Y) / 100;
            System.out.println("Number of bags received by chef is:");
		    System.out.println(result);
		}
		}
         sc.close();
	}
}

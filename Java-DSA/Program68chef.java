import java.util.*;


class Program68chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SUBSCRIBE_
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of tests you want to check");
		if(sc.hasNextInt()){
		    int t = sc.nextInt();
		    
		    for(int i=0;i<t;i++){
		        System.out.println("Enter the number of members");
		        int N = sc.nextInt();
                System.out.println("Enter amount needed for subscription");
		        int X = sc.nextInt();
		        
		        double count = N / 6.0; // WE CAN ALSO ABLE TO DO (N + 5) / 6.0 THAT ALSO WORKS
		        if(N < 6){
		            System.out.println(X);
		        }
		        else{
		        int result = ((int)Math.ceil(count)) * X;
		        System.out.println(result);
		        }
		    }
		}
           sc.close();
	}
}

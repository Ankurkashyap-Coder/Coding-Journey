import java.util.*;

class Program110chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/BULLET
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T= sc.nextInt();
		    
		    for(int i=0;i<T;i++){
                System.out.println("Enter the number bullet pixel frame rate ");
		        int X = sc.nextInt();
                System.out.println("Enter the distance of Goomba from him");
		        int Y = sc.nextInt();
                System.out.println("Enter the desired time which he want after that bullet reach to Goomba ");
		        int Z = sc.nextInt();
		        
		        int result =  Z - (Y / X);
                System.out.println("The minimum time coming out is :");
		        if(result < 0 ){
		            System.out.println(0);
		        }
		        else{
		        System.out.println(result);
		        }
		    }
		}
        sc.close();
	}
}

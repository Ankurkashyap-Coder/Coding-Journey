import java.util.*;


class Program84chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/TRAVELFAST
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
                System.out.println("Enter the time taken by Bike");
		        int X =sc.nextInt();
                System.out.println("Enter the time taken by Car");
		        int Y = sc.nextInt();
		        
		        if(X < Y){
		            System.out.println("BIKE");
		        }
		        else if(X > Y){
		            System.out.println("CAR");
		        }
		        else{
		            System.out.println("SAME");
		        }
		    }
		}
             sc.close();
	}
}

import java.util.*;


class Program136chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/MOZZ
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the lower limit of number of sticks");
		        int X = sc.nextInt();
                System.out.println("Enter the number of sticks in single plate");
		        int Y = sc.nextInt();
                System.out.println("Enter the money received by chef");
		        int R = sc.nextInt();
		        
		        int extra = R / 30;
		        
		        int total_stick = X + extra;
                System.out.println("The maximum number of plates chef can order is : ");
		        if(total_stick % Y == 0){
		        System.out.println(total_stick / Y);
		        }
		        else{
		            System.out.println((total_stick / Y) + 1);
		        }
		    }
		}
            sc.close();
	}
}

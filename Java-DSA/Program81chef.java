import java.util.*;


class Program81chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SUGARCANE
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
                System.out.println("Enter the number of glasses of juice he sells.");
		        int N =sc.nextInt();
		        
		        int result = 50 * N;
                System.out.println("Profit he earns is :");
		        int final_result = result - (((result * 20) / 100) + ((result * 20) / 100) + ((result * 30) / 100));
		        System.out.println(final_result);
		    }
		}
         sc.close();
	}
}

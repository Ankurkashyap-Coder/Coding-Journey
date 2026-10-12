import java.util.*;


class Program105chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/BATH
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
                System.out.println("Enter the total amount of water present in the geyser");
		        int X = sc.nextInt();
                System.out.println("Enter the capacity of the Bucket");
		        int Y = sc.nextInt();
		        
                System.out.println("Maximum Number of persons able to take Bath");
		        if((Y * 2) > X){
		            System.out.println(0);
		        }
		         else {
		            System.out.println(X / (Y * 2));
		        }
		    }
		}
		sc.close();

	}
}

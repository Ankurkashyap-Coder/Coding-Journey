import java.util.*;


class Program17chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/PRESENTS
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
            System.out.println("Enter the number of gifts chef have to buy");
		    for(int i=0;i<T;i++){
		        
		        long N = sc.nextLong();
		        
                System.out.println("The number of coins chef need to give to purchase the item is : ");
		        System.out.println(N - (N / 5));
		        
		    }
		}
          sc.close();
	}
}

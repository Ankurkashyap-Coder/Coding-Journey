import java.util.*;


class Program117chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
         // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/FILLCANDIES
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i = 0;i<T;i++){
		        System.out.println("Enter the number of candies chef have");
		        int N = sc.nextInt(); // Number of Candies
                System.out.println("Enter the number of pockets present in each bag");
		        int K = sc.nextInt(); // Number of Pockets
                System.out.println("Enter the candies hold by each pocket");
		        int M = sc.nextInt(); // Number of Candies hold by each pocket
		        
		        int temp = K * M;
                System.out.println("Number of Bags needed is : ");
		        if(N % temp == 0){
		            System.out.println(N / temp);
		        }
		        else{
		            System.out.println((N / temp) + 1);
		        }
		    }
		}
            sc.close();
	}
}

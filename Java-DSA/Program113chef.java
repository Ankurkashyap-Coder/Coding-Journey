import java.util.*;


class Program113chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user wan to check");
		if(sc.hasNextInt())
		{
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the number of candies chef have.");
		        int N = sc.nextInt();
                System.out.println("Enter the number of friends in which chef have to distribute candies.");
		        int M = sc.nextInt();
		        System.out.println("Chef able to distribute is :");
		        if(N % M != 0){
		            System.out.println("NO");
		        }
		        else if((N / M) % 2 == 0)
		        {
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		    } 
		}
          sc.close();
	}
}

import java.util.*;


class Program80chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/HELIUM3
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tasks user wants to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i= 0 ;i<T;i++){
		        System.out.println("Enter the number units Power required");
		        int A = sc.nextInt();
                System.out.println("Enter the required number of years");
		        int B = sc.nextInt();
                System.out.println("Enter the grams of Helium 3 ");
		        int X = sc.nextInt();
                System.out.println("Enter the Helim 3 found in Moon");
		        int Y = sc.nextInt();
		        
		        if((X * Y) >= (A * B))
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

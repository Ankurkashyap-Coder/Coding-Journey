import java.util.*;


class Program123chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/WGHTS
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the weight of Object Chef have");
		        int W = sc.nextInt();
                System.out.println("Enter the first weight chef have");
		        int X = sc.nextInt();
                System.out.println("Enter the second weight chef have");
		        int Y = sc.nextInt();
                System.out.println("Enter the third weight chef have");
		        int Z = sc.nextInt();
		        
                System.out.println("Chef able to find the weight of object through combinations ? ");
		        if(W == X || W == Y || W == Z || (X + Y) == W || (X + Z) == W || (Y + Z) == W || (X + Y + Z) == W){
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

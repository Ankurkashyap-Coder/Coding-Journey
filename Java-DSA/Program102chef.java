import java.util.*;


class Program102chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/MOVIE2X
		Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the total length of the movie");
		if(sc.hasNextInt()){
		    
		    int X = sc.nextInt();
            System.out.println("Enter the time after which movie movies from Boring to Interesting mode");
		    int Y = sc.nextInt();
		    
            System.out.println("The total time he spend to watch movie is : ");
		    System.out.println(X - (Y / 2));
		    
		}
             sc.close();
	}
}

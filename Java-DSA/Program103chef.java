import java.util.*;


class Program103chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/POLTHIEF
		Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the initial location of Police man");
		        int X = sc.nextInt();
                System.out.println("Enter the initial location of thief");
		        int Y = sc.nextInt();
		        
		        int guess = X > Y ? (X - Y) : (Y - X);
                System.out.println("The distance between thief and Police is : ");
		        if(X == Y){
		            System.out.println(0);
		        }
		        else{
		            System.out.println(guess);
		        }
		    }
		}
        sc.close();
	}
}

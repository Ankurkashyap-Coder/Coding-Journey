import java.util.*;


class Program104chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/FLIPCARDS
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the number of cards on table");
		        int N = sc.nextInt();
                System.out.println("Enter the cards that facing up");
		        int X = sc.nextInt();
		        
		        int down = N - X;
		        
		        int up = X;
		        System.out.println("Minimum number of flip needed is : ");
		        if(X == 0){
		            System.out.println(0);
		        }
		        else if(up < down){
		            System.out.println(up);
		        }
		        else{
		            System.out.println(down);
		        }
		}
		
		}
          sc.close();
	}
}

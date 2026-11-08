import java.util.*;


class Program135chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHEFRACES
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the first category chef participate");
		        int X = sc.nextInt();
                System.out.println("Enter the second category chef participate");
		        int Y = sc.nextInt();
                System.out.println("Enter the first category opponent participate");
		        int A = sc.nextInt();
                System.out.println("Enter the category second in whiich opponent participate");
		        int B = sc.nextInt();
		        
                System.out.println("Number of gold medals chef wins is : ");
		        if((X == A || X == B ) && (Y == A || Y == B)){
		            System.out.println("0");
		        }
		        else if((X == A || X == B ) || (Y == A || Y == B)){
		            System.out.println("1");
		        }
		        else{
		            System.out.println("2");
		        }
		    }
		}
         sc.close();
	}
}

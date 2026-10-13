import java.util.*;


class Program108chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/TRANSFORM
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		   
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the number of mushroom eaten by person");
		        int X = sc.nextInt();
		        if(X % 3 == 0){
		            System.out.println("NORMAL");
		        }
		        if(X % 3 == 2){
		            System.out.println("SMALL");
		        }
		        if(X % 3 == 1){
		            System.out.println("HUGE");
		        }
		            
		    }
		}
    sc.close();
	}
}

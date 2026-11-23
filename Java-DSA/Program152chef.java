import java.util.*;


class Program152chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/WATERCOOLER2
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the coin for rent the water cooler");
		        int X = sc.nextInt();
                System.out.println("Enter the coin need to purchase the water cooler");
		        int Y = sc.nextInt();
		        System.out.println("Chef able to rent the cooler for :");
		        if(X == Y){
		            System.out.println(0);
		        }
		        else if(Y > X){
		            if(Y % X !=0){
		                System.out.println(Y / X);
		            }
		            else{
		                System.out.println((Y / X) - 1);
		            }
		        }
		        else{
		            System.out.println("0");
		        }
		    }
		}
          sc.close();
	}
}

import java.util.*;


class Program120chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/VALENTINE
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the amount of money chef have.");
		        int X = sc.nextInt();
                System.out.println("Enter the cost of Chocolate");
		        int Y = sc.nextInt();
		        if(Y!=0){
		        int result = X / Y;
                System.out.println("The number of chocolates chef able to buy is : ");
		        System.out.println(result);
                }
                else{
                    System.out.println("Cost of Chocolate should not be zero");
                }
		    }
		}
              sc.close();
	}
}

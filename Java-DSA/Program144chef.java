import java.util.*;

class Program144chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SALE
		Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the price of first item");
		        int A = sc.nextInt();
                System.out.println("Enter the price of second item");
		        int B = sc.nextInt();
                System.out.println("Enter the price of third item");
		        int C = sc.nextInt();
		        
		        int min;
		        System.out.println("Total amount chef need to pay is :");
		        if(A <= B && A <= C){
		            min = A;
		        }
		        else if(B <= A && B <= C){
		            min = B;
		        }
		        else{
		            min = C;
		        }
		        System.out.println((A + B + C) - min);
		    }
		}
              sc.close();
	}
}

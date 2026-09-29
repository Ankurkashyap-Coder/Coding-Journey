import java.util.*;


class Program76chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SALESEASON
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int t =sc.nextInt();
		    
		    for(int i=0;i<t;i++){
                System.out.println("Enter the price amount");
		        int X = sc.nextInt();
                System.out.println("Price after Discount is : ");
		        if(X<=100){
		            System.out.println(X);
		        }
		        if(X>100 && X<=1000){
		            System.out.println(X - 25);
		        }
		        if(X>1000 && X<= 5000){
		            System.out.println(X - 100);
		        }
		        if(X > 5000){
		            System.out.println(X - 500);
		        }
		    }
		}
       sc.close();
	}
}

import java.util.*;


class Program62chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/REACHTARGET
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of tests you want ot check.");
		if(sc.hasNextInt()){
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++){
            System.out.println("Enter the target got by Team B");
		    int X = sc.nextInt();
            System.out.println("Enter the number of runs scored by Team B");
		    int Y = sc.nextInt();
		    
		    System.out.println(X - Y);
		}
		}
           sc.close();
	}
}

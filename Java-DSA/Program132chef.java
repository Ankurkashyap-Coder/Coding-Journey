import java.util.*;


class Program132chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/DECINC
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number whom to increment or decrement");
		if(sc.hasNextInt())
		{
            
		    int N = sc.nextInt();
            System.out.println("The original number is : " + N);
		    System.out.println("The number after increment or Decrement by 1 is ");
		    if(N % 4 != 0){
		        System.out.println(N - 1);
		    }
		    else{
		        System.out.println( N + 1);
		    }
		}
           sc.close();
           
	}
}

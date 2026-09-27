import java.util.*;


class Program64chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the number of 2000 notes you have.");
       if(sc.hasNextInt()){
           int N =sc.nextInt();
           
           int total_amount = N * 2000;
           int result = total_amount / 500;
           System.out.println("The total number of 500 notes that you have are:");
           System.out.println(result);
       }
        sc.close();
	}
}

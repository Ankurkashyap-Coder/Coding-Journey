import java.util.*;


class Program114chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the number whom square root you want");
		        int N = sc.nextInt();
		        System.out.println("The square root of number is : ");
		        double result = Math.sqrt(N);
		        System.out.println((int)result);
		    }
		}
            sc.close();
	}
}

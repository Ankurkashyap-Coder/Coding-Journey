import java.util.*;


class Program100chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the first score");
		        int A = sc.nextInt();
                System.out.println("Enter the second Score");
		        int B = sc.nextInt();
                System.out.println("Enter the third score");
		        int C = sc.nextInt();
		        
		        int result = ( A > B) ? A : B;
		        int resultFinal = result > C ? result : C;
                System.out.println("The Final result is : ");
		        System.out.println(resultFinal);
		    }
		}
          sc.close();
	}
}

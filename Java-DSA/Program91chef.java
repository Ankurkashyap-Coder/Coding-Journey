import java.util.*;


class Program91chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/FLOW007
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
                System.out.println("Enter the number you want the reverse of");
		        int N = sc.nextInt();
		        int reverse = 0;
		        while(N>0){
		            int digits = N % 10;
		             reverse = digits + (reverse * 10);
		            N /=10;
		        }
                System.out.println("The reverse of the number is : ");
		        System.out.println(reverse);
		    }
		}
          sc.close();
	}
}

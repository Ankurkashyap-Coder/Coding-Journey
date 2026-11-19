import java.util.*;


class Program145chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/MINFLIPS
	   Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of tests user want to check");
	   if(sc.hasNextInt()){
	       
	       int T = sc.nextInt();
	       
	       for(int i=0;i<T;i++){
	           int sum =0 ;
               System.out.println("Enter the number of input want to take");
	           int N = sc.nextInt();
	           
	           System.out.println("Enter the integer to check how many flips");
	           for(int j=0;j<N;j++){
	               
	               sum += sc.nextInt();
	               
	           }
               System.out.println("The number of flips needed is :");
	           if(N % 2 != 0){
	               System.out.println(-1);
	           }
	           else{
	               System.out.println(Math.abs(sum / 2));
	           }
	       }
	   }
           sc.close();
	}
}

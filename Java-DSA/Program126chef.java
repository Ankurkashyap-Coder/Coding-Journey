import java.util.*;


class Program126chef
{
	public static void main (String[] args) throws java.lang.Exception
	{ // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/MINCOINS
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the Amount to be paid");
		        int X = sc.nextInt();
		        System.out.println("The number of denomination of 5 or 10 chef need to pay is :");
		       if (X % 10 == 0) {
              System.out.println(X / 10);
                 } else if (X % 10 == 5) {
                      System.out.println((X / 10) + 1);
                 } else {
                   System.out.println(-1); 
         }
		    }
		}
        sc.close();
	}
}

import java.util.*;


class Program110chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/C_RATING
	       Scanner sc = new Scanner(System.in);
           System.out.println("Enter the number of tests user want to check");
	       if(sc.hasNextInt()){
	           
	           int T = sc.nextInt();
	           
	           for(int i=0;i<T;i++){
	               System.out.println("Enter the current rating of X");
	               int X = sc.nextInt();
                   System.out.println("Enter the current rating of opponent");
	               int Y = sc.nextInt();
	               int count = 0;
	              
                   System.out.println("Minimum contest X need to participate so that it surpass the opponent is : ");
	              if(X == Y){
	                  System.out.println(0);
	              }
	              else{
	                  while(X < Y){
	                  X += 8;
	                  count++;
	              }
	              System.out.println(count);
	              
	              }
	              }
	            }
	       sc.close();

	}
}

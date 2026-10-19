import java.util.*;


class Program119chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHESSDIST
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the number of tests user wnat to check");
             if(sc.hasNextInt()){
                 
                 int T = sc.nextInt();
                 for(int i=0;i<T;i++){
                     System.out.println("Enter the point 1 X1 value");
                     int X1 = sc.nextInt();
                     System.out.println("Enter the point 1 Y1 Value");
                     int Y1 = sc.nextInt();
                     System.out.println("Enter the point 2 X2 value");
                     int X2 = sc.nextInt();
                     System.out.println("Enter the point 2 Y2 Value");
                     int Y2 = sc.nextInt();
                     System.out.println("The Max distance value between these points be : ");
                     int max = Math.max(Math.abs((X1 - X2)) , Math.abs((Y1 - Y2)));
                     System.out.println(max);
                 }
             }
         sc.close();
	}
}

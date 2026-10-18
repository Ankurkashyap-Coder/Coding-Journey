import java.util.*;


class Program118chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/XJUMP
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of test suser want to check");
          if(sc.hasNextInt());
          {
              
              int T = sc.nextInt();
              
              for(int i=0;i<T;i++){
                  System.out.println("Enter the number of stairs chef want to reach");
                  int X = sc.nextInt(); // From 0 stair to X stair
                  System.out.println("Enter the climbable step");
                  int Y = sc.nextInt(); // Climb Y or one step at a time
                  System.out.println("Minimum number of stairs he have to climb to reach at exactly at " + X + " stair");
                  if(X % Y == 0){
                      System.out.println(X / Y);
                  }
                  else{
                      int temp = (X / Y) + (X - (Y * (X / Y)));
                      System.out.println(temp);
                  }
                  
              }
          }
           sc.close();
	}
}

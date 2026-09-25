import java.util.*;


class Program52chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/DETSCORE
	  Scanner sc =new Scanner(System.in);
      System.out.println("Enter the number of tests you want to check");
	  if(sc.hasNextInt()){
	  int t =sc.nextInt();
	  
	  
	  for(int i=0;i<t;i++){
        System.out.println("Enter the Value of X between 10 to 200");
	      int X = sc.nextInt();
          System.out.println("Enter the Value of N between 0 to 10");
	      int N = sc.nextInt();
	      if(X>= 10 && X<=200){
	          if(N>=0 && N<=10){
	              if(X%10 == 0){
	                  System.out.println((X/10) * N);
	              }
	          }
	      }
	  }
}
sc.close();
	}
}

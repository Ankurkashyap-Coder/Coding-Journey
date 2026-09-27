import java.util.*;


class Program65chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/MINHEIGHT
	   Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of tests you want ot test");
	   if(sc.hasNextInt()){
	       int t = sc.nextInt();
	       for(int i = 0; i<t;i++){
            System.out.println("Enter the height of the chef");
	       int X = sc.nextInt();
           System.out.println("Enter the minimum height requirement");
	       int H = sc.nextInt();
	       
	       if((H - X) > 0){
	           System.out.println("NO");
	       }
	       else{
	           System.out.println("YES");
	       }
	   }
	   }
           sc.close();
	}
}

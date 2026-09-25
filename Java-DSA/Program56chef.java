import java.util.*;


class Program56chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/KITCHENTIME
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of test you eant to perform.");
		if(sc.hasNextInt()){
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++){
            System.out.println("Enter the what time it starts in integer like(1 to 12)");
		    int x =sc.nextInt();
            System.out.println("Enter at what time it end be in integer(1 to 12)");
		    int y= sc.nextInt();
		     if(x > y){
		         int result = x - y;
                 System.out.println("Number of hours he or she works is:");
		         System.out.println(result);
		     }
		     else{
		         int result = y - x;
                 System.out.println("Number of hours he or she works is:");
		         System.out.println(result);
		     }
		}
	}
	sc.close();
	}
}

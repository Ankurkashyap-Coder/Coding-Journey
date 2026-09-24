import java.util.*;


class Program48chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/BIRYANI
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests you want to make.");
		if(sc.hasNextInt()){
		    int t = sc.nextInt();
		    
		    for(int i=0;i<t;i++){
                System.out.println("Enter the nuber of week.");
		        int x = sc.nextInt();
                System.out.println("Enter the money chef invested per week.");
		        int y= sc.nextInt();
		        
                System.out.println("Total money he have to invest is:");
		        System.out.println(x * y);
		    }
		}
        sc.close();

	}
}

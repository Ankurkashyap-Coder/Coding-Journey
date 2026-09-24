import java.util.*;

class Program46chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/TAXSAVING
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number the tasks you want to check.");
	    if(sc.hasNextInt()){
	        int t = sc.nextInt();
	    
	    for(int i=0;i<t;i++){
            System.out.println("Enter the value of x.");
		int x = sc.nextInt();
        System.out.println("Enter the Value of Y.");
		int y = sc.nextInt();
		System.out.println(x - y); 
        
	}
	    }
	    sc.close();
}
}

import java.util.*;


class Program47chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/TOP10
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests you want to check.");
		if(sc.hasNextInt()){
            
		    int t = sc.nextInt();
		    
		    for(int i =0;i<t;i++){
                System.out.println("Enter the rank of the chef.");
		int rank = sc.nextInt();
		
		if(rank<=10)
		{
		    System.out.println("YES");
		}
		if(rank>10){
		    System.out.println("NO");
		}
}
	}
	sc.close();
	}
}

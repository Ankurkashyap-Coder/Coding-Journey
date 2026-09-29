import java.util.*;


class Program72chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/OFFICE
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of cases user want to check");
		if(sc.hasNextInt()){
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++){
		    
		    int result = 0;
            System.out.println("Enter the number of hours working in each day from Monday to thursday");
		    int X = sc.nextInt();
            System.out.println("Enter the number of hours works on Friday");
		    int Y =sc.nextInt();
		    
		    result = (4 * X) + Y;
            System.out.println("The result going to be:");
		    System.out.println(result);
		}
}
sc.close();
	}
}

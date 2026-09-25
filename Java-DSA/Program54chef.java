import java.util.*;


class Program54chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/OFFBY1
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Value of x and y");
		if(sc.hasNextInt()){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
            int result = ((x + y) * 10 ) + 1;
		    System.out.println(result);
		}
        sc.close();

	}
}

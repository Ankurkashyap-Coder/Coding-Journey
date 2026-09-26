import java.util.*;


class Program61chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/BNE_APT
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers of peoples in Bones and Blood");
		if(sc.hasNextInt()){
		int N =sc.nextInt();
		int M =sc.nextInt();
		System.out.println("Enter the numbers of treats handled by each person in Bones and Blood");
		int X =sc.nextInt();
		int Y =sc.nextInt();
		
		int treat1  = N * X;
		int treat2 = M * Y;
		
		int result = treat1 + treat2;
		System.out.println(result);
	}
	sc.close();
	}
}

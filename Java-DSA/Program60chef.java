import java.util.*;


class Program60chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/PUZHUNT
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of team members in the team to check whether the team is eligible to participate or not.");
        if(sc.hasNextInt()){
	    int N =sc.nextInt();
        if(N>=6 && N<=8){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
        sc.close();
	}
}

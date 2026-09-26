import java.util.*;


class Program57chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/IPLTRSH
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test user want ot test.");
		if(sc.hasNextInt()){
		    int t = sc.nextInt();
		    
		    for(int i=0;i<t;i++){
                System.out.println("Enter the number of Students.");
		        int N  = sc.nextInt();
                System.out.println("Enter the number of tickets available.");
		        int M = sc.nextInt();
		        if(N > M){
                    System.out.println("Number of students won't get the ticket.");
		        System.out.println(N - M);
                }
		        if(M == N){
                    System.out.println("Number of students and ticket number are equal so every student got the ticket. So, number of student not got the ticket is :");
		        System.out.println(0);
                }
                if(M>N){
                    System.out.println("Students number are greater than the ticket number.");
                }
		    }
		    
		}
          sc.close();
	}
}

import java.util.*;


class Program95chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        //https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/ELECTN
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    for(int p=0;p<T;p++){
		        int count = 0;
                System.out.println("Enter the number of people ages you want to check");
		        int N = sc.nextInt();
                System.out.println("Enter the minimum age user required to be eligible for vote");
		        int X = sc.nextInt();
		        for(int j=1;j<=N;j++){
		            System.out.println("Enter the age of person : " + j);
		            int i = sc.nextInt();
		            
		            if(i>=X){
		                count++;
		            }
		        }
                System.out.println("Number of person qualify to give vote is : ");
		        System.out.println(count);
		    }
		}
            sc.close();
	}
}

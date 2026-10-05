import java.util.*;


class Program90chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        //https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/NEARESTEXIT
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T =sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the seat number between 1 to 100 to get to know where the exit is nearer");
		        int X = sc.nextInt();
		        
		        if(X>=1 && X<=50){
		            System.out.println("LEFT");
		        }
		        if(X>50 && X<=100){
		            System.out.println("RIGHT");
		        }
		    }
		}
          sc.close();
	}
}

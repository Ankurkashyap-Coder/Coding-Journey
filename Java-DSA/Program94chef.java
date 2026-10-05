import java.util.*;


class Program94chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/QUALIFY
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
                System.out.println("Enter the points chef need to qualify the contest");
		        int X = sc.nextInt();
                System.out.println("Enter the number of easy problem he solved");
		        int A  =sc.nextInt();
                System.out.println("Enter the number of hard problem he solved");
		        int B = sc.nextInt();
		        
		        int result = (A * 1) + (B * 2);
		        if(result >= X){
		            System.out.println("Qualify");
		        }
		        else{
		            System.out.println("NotQualify");
		        }
		    }
		}
           sc.close();
	}
}

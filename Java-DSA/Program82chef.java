import java.util.*;


class Program82chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/NOTEBOOK
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T =sc.nextInt();
		    
		    for(int i=0;i<T;i++){
                System.out.println("Enter the pulp quatity");
		        int N = sc.nextInt();
		        
		        int result = (N * 1000) / 100;
                System.out.println("The number of Notebook that we able to make is : ");
		        System.out.println(result);
		    }
		}
         sc.close();
	}
}

import java.util.*;


class Program71chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/EXAMCHEF
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int t = sc.nextInt();
		    
		    for(int i=0;i<t;i++){
		        System.out.println("Enter the numbers of School");
		        int X = sc.nextInt();
                System.out.println("Enter the number of students");
		        int Y = sc.nextInt();
                System.out.println("Enter the number of students passed");
		        int Z = sc.nextInt();
		        
		        int total_students = X * Y;
		         double result = Math.ceil((Z * 100.0) / total_students);
		         
		         
		         if(result > 50){
		             System.out.println("YES");
		         }
		         else{
		             System.out.println("NO");
		         }
		        
		    }
		}
         sc.close();
	}
}

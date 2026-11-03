import java.util.*;


class Program133chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/AORB
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the time chef need to solve problem A");
		        int X = sc.nextInt();
                System.out.println("Enter the time chef need to solve B");
		        int Y = sc.nextInt();
		        
		        
		        int total1 = (500 - (X * 2)) + (1000 - ((Y + X) * 4));
		        
		        
		        int total2 = (1000 - (Y * 4)) + (500 - ((Y + X) * 2));
		           
		        System.out.println("The maximum number of points chef able to score is : ");
		        if(total1 <= total2){
		            System.out.println(total2);
		        }
		        else{
		            System.out.println(total1);
		        }
		}
		}
		sc.close();
	}
}

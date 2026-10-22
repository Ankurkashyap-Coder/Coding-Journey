import java.util.*;


class Program127chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SPCP2
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the number of Planes chef have");
		        int X = sc.nextInt();
                System.out.println("Enter the number of persons who want to travel in the same destination");
		        int N = sc.nextInt();
		        
		        int temp = N / 100;
		        System.out.println("Number of aircrafts need to be purchase is : ");
		         if(temp >= X)
		        {
		            if(N % 100 == 0){
		                
		            System.out.println((temp) - X);
		            }
		            else{
		                System.out.println((temp + 1) - X);
		            }
		        }
		        else{
		            System.out.println("0");
		        }
		    }
		}
          sc.close();
	}
}

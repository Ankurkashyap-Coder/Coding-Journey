import java.util.*;


class Program83chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHEFCAND
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
                System.out.println("Enter the number of childrens");
		        int N = sc.nextInt();
                System.out.println("Enter the number of candies chef have.");
		        int X = sc.nextInt();
		        if(N > X){
		        int need = N - X;
		        if(need % 4 ==0){
                    System.out.println("Number of packets of candies chef need to purchase is : ");
		            System.out.println((need / 4));
		        }
		        else{
		            System.out.println("Number of packets of candies chef need to purchase is : ");
		            System.out.println((need / 4) + 1);
		        }
		        }
		        if(N<=X){
                    System.out.println("Number of packets of candies chef need to purchase is : ");
		            System.out.println(0);
		        }
		    }
		}
         sc.close();
	}
}

import java.util.*;


class Program96chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    for(int i=0;i<T;i++){
                System.out.println("Enter the number of people going to travel");
		        int N = sc.nextInt();
		        
		        if(N<=4){
		            System.out.println(1);
		        }
                System.out.println("Number of cars required for going to the trip is : ");
		         if(N > 4){
		            if(N % 4 == 0){
		                System.out.println(N / 4);
		            }
		            else{
		                System.out.println((N + 3) / 4);
		            }
		        }
		    }
		}
           sc.close();
	}
}

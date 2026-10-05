import java.util.*;


class Program93chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of tasks user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
                System.out.println("Enter the nibbles of memory taken");
		        int N = sc.nextInt();
		        
		        double result = N / 4.0;
		        if(result%1 == 0){
		            System.out.println("Good");
		        }
		        else{
		            System.out.println("Not Good");
		        }
		    }
		}
             sc.close();
	}
}

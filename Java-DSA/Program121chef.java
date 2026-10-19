import java.util.*;


class Program121chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        
		        
                    System.out.println("Enter the score of serve of Alice");
		        int P = sc.nextInt();
                System.out.println("Enter the score of serve of Bob");
		        int Q = sc.nextInt();
		        
		        int temp = Q + P;
		        int rem = temp % 4 ;
		         if(rem == 0 || rem == 1){
		            System.out.println("Alice");
		        }
		      else{
		          System.out.println("Bob");
		      }
		        
		    
		    }
		}
           sc.close();
	}
}

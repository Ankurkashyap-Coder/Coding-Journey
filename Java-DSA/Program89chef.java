import java.util.*;


class Program89chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user wants to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T; i++){
		        System.out.println("Enter the first temperature");
		        int A = sc.nextInt();
                System.out.println("Enter the second temperature");
		        int B = sc.nextInt();
                System.out.println("Enter the third temperature");
		        int C = sc.nextInt();
		        
		        if(A<=B && C<=B){
		            System.out.println("Yes");
		        }
		        else{
		            System.out.println("No");
		        }
		    }
		}
         sc.close();
	}
}

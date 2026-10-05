import java.util.*;


class Program92chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
                System.out.println("Enter the valuation offer by investor 1");
		        int A = sc.nextInt();
                System.out.println("Enter the valuation offer by investor 2");
		        int B = sc.nextInt();
		        
		        int valuation1 = (A * 100) / 10;
		        int valuation2 = (B * 100) / 20;
		        
		        if(valuation1 > valuation2){
		            System.out.println("FIRST");
		        }
		        if(valuation2 > valuation1){
		            System.out.println("SECOND");
		        }
		        if(valuation1 == valuation2){
		            System.out.println("ANY");
		        }
		    }
		}
         sc.close();
	}
}

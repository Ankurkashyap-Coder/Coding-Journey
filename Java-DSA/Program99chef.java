import java.util.*;


class Program99chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the number of seat between 1 to 30");
		        int N = sc.nextInt();
		        
		        if(N>=1 && N<= 10){
		            System.out.println("Lower Double");
		        }
		        if(N >= 11 && N<=15){
		            System.out.println("Lower Single");
		        }
		        if(N>=16 && N<= 25){
		            System.out.println("Upper Double");
		        }
		        if(N >= 26 && N<=30){
		            System.out.println("Upper Single");
		        }
		    }
		}
          sc.close();
	}
}

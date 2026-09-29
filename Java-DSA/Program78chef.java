import java.util.*;


class Program78chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHEFGAMES
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int t =sc.nextInt();
		    
		    for(int i =0;i<t;i++){
                System.out.println("Enter the decision of each of four referees");
		        int R1 = sc.nextInt();
		        int R2 = sc.nextInt();
		        int R3 = sc.nextInt();
		        int R4 = sc.nextInt();
		        
		        if((R1 + R2 + R3 + R4) >= 1){
		            System.out.println("OUT");
		        }
		        else{
		            System.out.println("IN");
		        }
		    }
		}
          sc.close();
	}
}

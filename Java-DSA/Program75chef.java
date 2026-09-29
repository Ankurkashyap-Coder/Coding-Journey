import java.util.*;


class Program75chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/WATERFILLING
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to test");
		if(sc.hasNextInt()){
		    int t = sc.nextInt();
		    
		    for(int i=0;i<t;i++){
		        System.out.println("Enter 1 if Bottle 1 is full else 0");
		        int B1 = sc.nextInt();
                System.out.println("Enter 1 if Bottle 2 is full else 0");
		        int B2 = sc.nextInt();
                System.out.println("Enter 1 if Bottle 3 is full else 0");
		        int B3 = sc.nextInt();
		        
		        
		        if(B1 + B2 + B3 <= 1){
		            System.out.println("Water filling time");
		        }
		        else{
		            System.out.println("Not now");
		        }
		    }
		    
		}
		sc.close();

	}
}

 //  LOGIC THINK BY ME EARLIER 
 /*for(int i=0;i<t;i++){
		        int count = 0;
		        int B1 = sc.nextInt();
		        int B2 = sc.nextInt();
		        int B3 = sc.nextInt();
		        
		        if(B1 == 0){
		            count++;
		        }
		        if(B2 == 0){
		            count++;
		        }
		        if(B3 == 0){
		            count++;
		        }
		        if(count >=2){
		            System.out.println("Water filling time");
		        }
		        else{
		            System.out.println("Not now");
		    }
		    
		}
            */

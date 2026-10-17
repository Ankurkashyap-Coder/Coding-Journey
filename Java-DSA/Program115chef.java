import java.util.*;


class Program115chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the number of levels in the game");
		        int X = sc.nextInt();
                System.out.println("Enter the time for each level to complete");
		        int Y = sc.nextInt();
                System.out.println("Enter the time chef take as a break");
		        int Z = sc.nextInt();
		        
		       int playtime = X * Y;
		       
		       int breaks = X / 3;
               System.out.println("Total time chef take to complete the level is : ");
		       if(X%3 == 0){
		           breaks -= 1;
		       }
		        int TotalTime = playtime + (breaks * Z);
		        System.out.println(TotalTime);
		        
		    }
		}
            sc.close();
	}
}
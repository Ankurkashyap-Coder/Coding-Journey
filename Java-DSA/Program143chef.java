import java.util.*;


class Program143chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SINGLEUSE
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the health of Boss left");
		        int H = sc.nextInt();
                System.out.println("Enter the attack damage done by chef");
		        int X = sc.nextInt();
                System.out.println("Enter the amount of Damage done by special attack");
		        int Y = sc.nextInt();
		        
		        int health;
		        
		        System.out.println("Chef Beats the boss in the number of attack is :");
		  if(H <= Y){
		      System.out.println(1);
		  }
		  else{
		      health = H - Y;
		      int count = (int) Math.ceil((double) health / X );
		      System.out.println(count + 1);
		  }
		  }
		}
          sc.close();
	}
}

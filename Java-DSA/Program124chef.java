import java.util.*;


class Program124chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHEFAPPS?tab=statement
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests you want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the total memory of Chef's Phone");
		        int S = sc.nextInt();
                System.out.println("Enter the MB storage taken by first app");
		        int X = sc.nextInt();
                System.out.println("Enter the MB storage taken by third app");
		        int Y = sc.nextInt();
                System.out.println("Enter the free MB required to download third app");
		        int Z = sc.nextInt();
		        int free = S - (X + Y);
                System.out.println("The number of App chef need to uninstall to download third app is : ");
		        if((S -(X + Y)) >= Z){
		            System.out.println("0");
		        }
		        else if(Z <= (X + free) || Z <= (Y + free) ){
		            System.out.println("1");
		            
		        }
		            else{
		                System.out.println("2");
		            }
		        }
		    }
		
          sc.close();
	}
}

import java.util.*;


class Program130chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want ot check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the room number of chef");
		        int X = sc.nextInt();
                System.out.println("Enter the room number of Chefina");
		        int Y = sc.nextInt();
		        
		        int temp1 = (X + 9) / 10;
		        int temp2 = (Y + 9) / 10;
                System.out.println("The chef need to travel that number of floor.");
		        System.out.println(Math.abs(temp1 - temp2));
		    }
		}
         sc.close();
	}
}

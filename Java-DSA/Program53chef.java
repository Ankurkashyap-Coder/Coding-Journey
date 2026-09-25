import java.util.*;


class Program54chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of x");
		if(sc.hasNextInt()){
		    int X = sc.nextInt();
		    
		    if(X>=100 && X<=999){
		        if(X== 404){
		            System.out.println("NOT FOUND");
		        }
		        else{
		            System.out.println("FOUND");
		        }
		    }
		    
		}
		sc.close();

	}
}

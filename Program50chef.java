import java.util.*;


class Program50chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/PRACLIST
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of X and Y to check how many numbers present between them.");
		if(sc.hasNextInt()){
		    int x= sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(x>y){
		        System.out.println(x - y);
		    }
		    else if(y>x){
		        System.out.println(y - x);
		    }
		    else{
		        System.out.println(x - y);
		    }
		}
sc.close();
	}
}

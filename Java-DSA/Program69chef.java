import java.util.*;


class Program69chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/CHEFONDATE
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of tests you want to check");
        if(sc.hasNextInt()){
		int t = sc.nextInt();
		
		for(int i =0;i<t;i++){
            System.out.println("Enter the amount of money that chef have");
		    int X =sc.nextInt();
            System.out.println("Enter the amount of money needed by chef");
		    int Y =sc.nextInt();
		    
		    if((X - Y) < 0){
		        System.out.println("NO");
		    }
		    else{
		        System.out.println("YES");
		    }
		}
    }
           sc.close();
	}
}

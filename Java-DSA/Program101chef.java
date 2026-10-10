import java.util.*;


class Program101chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/MAXTASTE?tab=statement
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the taste of ingredient 1");
		        int a = sc.nextInt();
                System.out.println("Enter the taste of ingredient 2");
		        int b = sc.nextInt();
                System.out.println("Enter the taste of Ingredient 3");
		        int c = sc.nextInt();
                System.out.println("Enter the taste of Ingredient 4");
		        int d  = sc.nextInt();
		        
		        int guess1 = a > b ? a : b;
		        int guess2 = c > d ? c : d;
		        System.out.println("Max taste that is able to reach is : ");
		        System.out.println(guess1  +  guess2);
		}

	}
    sc.close();
}
}

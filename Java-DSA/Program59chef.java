import java.util.*;


class Program59chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/TIMELY
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of tests you want to check.");
		if(sc.hasNextInt()){
		    int t =sc.nextInt();
		    
		    for(int i=0;i<t;i++){
		        System.out.println("Enter the time before which chef left his home and move towards office.");
		        int X = sc.nextInt();
		        if((X- 30) >= 0){
                    
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		    }
		}
        sc.close();
	}
}

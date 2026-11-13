import java.io.*;

class Program139chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHEAT
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of tests user want to check");
		int T = Integer.parseInt(sc.readLine());
		
		for(int i=0;i<T;i++){
		    System.out.println("Enter the number of days in which you want to check the number of Tuesdays if first day is Monday");
		    int N = Integer.parseInt(sc.readLine());
		    System.out.println("Number of Tuesdays are : ");
		    if(N > 1 && N <= 8){
		        System.out.println(1);
		    }
		    else if(N > 8){
		       if(N % 7 >= 2)
		       System.out.println((N / 7) + 1);
		       else
		       System.out.println(N / 7);
		    }
		    else{
		        System.out.println(0);
		    }
		}
              sc.close();
	}
}

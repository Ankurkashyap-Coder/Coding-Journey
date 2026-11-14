
import java.io.*;
import java.util.StringTokenizer;

class Program140chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/T20MCH?tab=statement
        System.out.println("Enter the Runs scored by Team A" + "\n" + "Enter the over already played by Team B" + "\n" + "Enter the runs scored by team B all in single line.");
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		
		int R = Integer.parseInt(st.nextToken());
        
		int O = Integer.parseInt(st.nextToken());
        
		int C = Integer.parseInt(st.nextToken());
		
		int remaining_over = 20 - O;
		int max_runs = ((remaining_over * 6) * 6) + C;
		System.out.println("Is Tean B able to surpass the Team B ?");
		if(max_runs > R){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		sc.close();
	}
}

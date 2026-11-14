import java.util.*;
import java.io.*;

class Program141chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of tests you want to check:");
		int T = Integer.parseInt(sc.readLine().trim());
		
		for(int i = 0; i < T; i++){
		    System.out.println("Enter the number of items and the added value in a single line:");
		    StringTokenizer st = new StringTokenizer(sc.readLine());
		    
		    int N = Integer.parseInt(st.nextToken());
		    int K = Integer.parseInt(st.nextToken());
		    int count = 0;
		    
		    System.out.println("Enter the minions' values:");
		    st = new StringTokenizer(sc.readLine());
		    
		    for(int j = 0; j < N; j++){
		        int K1 = Integer.parseInt(st.nextToken());
		        if((K1 + K) % 7 == 0){
		            count++;
		        }
		    }
		    System.out.println("The Wolverine minions number is: " + count);
		}
	}
}

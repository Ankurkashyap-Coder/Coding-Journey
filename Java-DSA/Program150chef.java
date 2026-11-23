import java.util.*;


class Program150chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/RECENTCONT?tab=statement
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check ");
		if(sc.hasNextInt()){
		    
		    int T =sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the number of words you are taking to check whether it starts with START38 or not");
		        int N = sc.nextInt();
		        
		        String[] A = new String[N];
		        int count = 0;
                System.out.println("Enter the words as the input");
		        for(int j=0;j<N;j++){
		            
		           A[j] = sc.next(); 
		        }
		        String temp = "START38";
		        for(int k=0;k<N;k++){
		           if(A[k].equals(temp)){
		               count ++;
		           } 
		            
		        }
                System.out.println("The number of words are :");
		        System.out.println(count + " " + (N - count));
		    }
		}
      sc.close();
	}
}

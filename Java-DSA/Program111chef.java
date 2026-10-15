import java.util.*;


class Program11chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/DNASTRAND
		Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    int T = sc.nextInt();
		    
		    
		    
		    for(int i=0;i<T;i++){
		        
		        System.out.println("Enter the length of string");
		        int N = sc.nextInt();
		        sc.nextLine();
                System.out.println("Enter the String");
		        String S = sc.nextLine();
		        
		        StringBuilder result = new StringBuilder();
		        for(int j=0;j<N;j++){
		            
		            char ch = S.charAt(j);
		            
		            if(ch == 'A'){
		                result.append('T');
		            }
		            else if(ch == 'T'){
		                result.append('A');
		            }
		            else if(ch == 'C'){
		                result.append('G');
		            }
		            else if(ch == 'G'){
		                result.append('C');
		            }
		        }
                System.out.println("The answer comes out to be is : ");
		        System.out.println(result.toString());
		    }
		}
          sc.close();
	}
}

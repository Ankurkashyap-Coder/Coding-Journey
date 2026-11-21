import java.util.*;


class Program146chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/READPAGES
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test suser want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the total number of pages book contain");
		        int N = sc.nextInt();
                System.out.println("Enter the number of pages chef readed in single day");
		        int X = sc.nextInt();
                System.out.println("Enter the days before that chef have to read the book");
		        int Y = sc.nextInt();
		        
		        
		        int counts = (N + X - 1) / X;
		        System.out.println("Is Chef able to finish the book in given days?");
		        if(counts <= Y){
		            
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

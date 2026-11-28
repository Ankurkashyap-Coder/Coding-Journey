import java.util.*;


class Program153chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/arrays/ARRAYS/problems/UWCOI20A
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the size of Array");
		        int N = sc.nextInt();
		        
		        int[] A = new int[N];
		        System.out.println("Enter the elements in Array");
		        for(int j=0;j<N;j++){
		            A[j] = sc.nextInt();
		        }
		        int max = A[0];
		        for(int k=0;k<N;k++){
		            if(A[k] > max){
		                max = A[k];
		            }
		        }
                System.out.println("The maximum element in the Array is :");
		        System.out.println(max);
		    }
		}
            sc.close();
	}
}

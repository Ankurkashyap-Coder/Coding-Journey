import java.util.*;



class Program73chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/AMR15A
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of soldiers.");
		if(sc.hasNextInt()){
		    int N = sc.nextInt();
		    int count1 = 0;
		    int count2 = 0;
		    int[] A = new int[N];
            System.out.println("Enter number of Weapons Soldier have");
		    for(int i=0;i<N;i++){
		        A[i] = sc.nextInt();
		    }
		    for(int i=0;i<N;i++){
		    if(A[i] % 2 == 0){
		        count1++;
		    }
		    else{
		        count2++;
		    }
		}
		   if(count1 <= count2){
		       System.out.println("NOT READY");
		   } 
		   else{
		       System.out.println("READY FOR BATTLE");
		   }
		}
		sc.close();
	}
}

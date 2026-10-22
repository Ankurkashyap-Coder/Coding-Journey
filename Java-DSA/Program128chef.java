import java.util.*;


class Program128chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        int count = 0;
                System.out.println("Enter the number of women whose eligibility to check");
		        int N = sc.nextInt();
		        
		        for(int j=0;j<N;j++){
		             System.out.println("Enter the age of womens");
		             int A = sc.nextInt();
		             if(A >= 10 && A <= 60){
		                 count++;
		             }
		        }
                System.out.println("The womens eligible for training is : ");
		        System.out.println(count);
		    }
		}
        sc.close();
	}
}

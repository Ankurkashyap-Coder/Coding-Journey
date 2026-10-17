import java.util.*;


class Program116chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/BLACKJACK
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("Enter the first number");
		        int A = sc.nextInt();
                System.out.println("Enter the second number");
		        int B = sc.nextInt();
		        
		        int temp = A + B;
		        int temp1 = 21 - temp;
		        if(temp1 >=1 && temp1 <= 10){
		            System.out.println("We need to add "+ temp1 + " as the third number to help chef win the game.");
		            System.out.println(temp1);
		        }
		        else{
                    
		            System.out.println(-1);
                    System.out.println("Not Posssible as we only able to add number between 1 to 10 and no number between them makes the summ 21.");
		        }
		    }
		}
            sc.close();
	}
}

import java.util.*;



class Program148chef
{
	public static void main (String[] args) throws java.lang.Exception
    {
	// https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/TLG
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rounds to be played");
		if(sc.hasNextInt()){
		    
		    int N = sc.nextInt();
		    int total1 = 0;
		    int total2 = 0;
		    int Current_lead = 0;
		    int max_lead = 0;
		    int winner = 0;
            
		    for(int i=0;i<N;i++){
		        System.out.println("Enter the score of first Player");
		         total1 += sc.nextInt();
                 System.out.println("Enter the score of second Player");
		         total2 += sc.nextInt();
		         
		        
		        Current_lead = Math.abs(total1 - total2);
		        if(Current_lead > max_lead){
		            max_lead = Current_lead;
		        
		        if(total1 > total2){
		            winner = 1;
		        }
		        else{
		            winner = 2;
		        }
		        }
		    }
		        
		            System.out.println("The winner and the lead that it have is :");
		            System.out.println(winner + " " + max_lead);
		       
		        
		}
    
             sc.close();
	}
}

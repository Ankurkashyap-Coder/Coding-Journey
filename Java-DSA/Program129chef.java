import java.util.*;


class Program129chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
		if(sc.hasNextInt()){
		    
		    int T = sc.nextInt();
		    
		    for(int i=0;i<T;i++){
		        System.out.println("The skill of Team 1");
		        int X = sc.nextInt();
                System.out.println("The skill of team 2");
		        int Y = sc.nextInt();
                System.out.println("The difference of the skills");
		        int D = sc.nextInt();
		        System.out.println("Is the game interesting ?");
		        if(Math.abs((X - Y)) <= D){
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

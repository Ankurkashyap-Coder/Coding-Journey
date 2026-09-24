import java.util.*;


class Program45chef
{
    //https://www.codechef.com/practice/course/basic-programming-concepts/DIFF500/problems/CLEARDAY
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int result= 7;
        System.out.println("Enter the rainy and Cloudy days.");
		String number = sc.nextLine();
		for(int i=0;i<number.length();i++){
		    char ch = number.charAt(i);
		    if(ch!= ' '){
		    result -= (ch - '0');
		}
		}
        System.out.println("Left days of week");
		System.out.println(result);
	sc.close();
}
}


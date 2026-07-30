import java.util.*;
public class Program4 {
    public static void main(String[]args){
   Scanner ob=new Scanner(System.in);
   System.out.println("Enter the first number for HCF");
   int num1=ob.nextInt(); 
   System.out.println("Enter the second Number for HCF");
   int num2=ob.nextInt();
   System.out.println("Enter the first number for LCM");
   int num3=ob.nextInt();
   System.out.println("Enter the second number for LCM");
   int num4=ob.nextInt();
   int answer=0;
   int answer1=0;
   int answer2=0;
   int answer3=0;
   
   int resultHCF= HCF(num1, num2, answer, answer1, answer2);
   int resultLCM= LCM(num3, num4, answer3);
   System.out.println("The HCF of the numbers" +" "+num1 +" "+ "and"+" " +num2+ " " + "are: "+ resultHCF);
   System.out.println("The HCF of the numbers" +" "+num3 +" "+ "and" + " " +num4+ " " + "are: "+ resultLCM);
   ob.close();
}
static int HCF(int num1, int num2, int answer, int answer1, int answer2){
   answer= num1>num2 ? num1:num2;
   for(int i=1;i<answer;i++){
    if(num1%i==0 && num2%i==0){
       answer1=i;
    }
    if(answer1>answer2){
       answer2=answer1;
    }
   }
   return answer2;
}
static int LCM(int num1, int num2, int answer1){
    for(int i=1;i<=(num1*num2);i++){
        answer1=num1*i;
        if(answer1%num2==0){
            
            break;
        }
        else{
            continue;
        }
    }
    return answer1;
}
}

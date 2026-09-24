import java.util.*;
public class Program5 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter x to break");
        while(true){
        String num=ob.next();
        if(num.equals("x")){
            break;
        }
            sum+=Integer.parseInt(num);
        }
        System.out.println("The result of all the numbers inputed by user is: "+sum);
        ob.close();
    }
}


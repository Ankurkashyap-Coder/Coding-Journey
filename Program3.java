import java.util.Scanner;
public class Program3
// Program to print table of a the given Number
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for which you want a table of :");
        //Checking whether inputed number is actually valid for giving a table or not
        if(!sc.hasNextInt()){
          System.out.println("Error: Enter number is not Valid!");
          sc.close();
          return;
        }
        int number=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number+" * "+i+" = "+(number*i));
        }
        sc.close();
    }
}

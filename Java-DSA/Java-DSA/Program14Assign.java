import java.util.*;
public class Program14Assign {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       // Input a number and print all the factors of that number.
       int num = 0;
       System.out.println("Enter the number whom factor you want to find.");
       if(sc.hasNextInt()){
          num = sc.nextInt();
       }
       else{
        sc.next();
        System.out.println("Error entered num is not a Valid Numeric Digit.");
        sc.close();;
        return;
       }
       // Main logic
       for(int i=1; i<= num /2; i++){
        if(num % i == 0){
            System.out.print(i + " ");
        }
       }
       System.out.print(num);
       sc.close();
    }
}

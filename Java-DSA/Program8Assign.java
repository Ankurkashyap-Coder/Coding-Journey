import java.util.*;
public class Program8Assign {
    public static void main(String[] args) {
      // 8. To find out whether the given String is Palindrome or not.
      Scanner sc= new Scanner(System.in); 
      String original=" ";
      System.out.println("Enter the input you want to check whether it is Palindrome or not :");
      if(sc.hasNextLine()){
        original=sc.nextLine();
      }
      else{
        System.out.println("Error: Your inputed number is not an Valid Numeric Digit");
        sc.close();
        return;
      }
      boolean result= Pallindrome(original);
      if(result){
      System.out.println("Entered string "+original+" "+ "is a Pallindrome.");
      }
      else{
        System.out.println("Entered string "+original+" "+ "is not a Pallindrome .");
      }
      sc.close();
    }
    static boolean Pallindrome(String original){
        String original1=original.toLowerCase();
        String reversedstring= "";
        for(int i=original1.length() - 1;i>=0;i--){
            reversedstring+=original1.charAt(i);
        }
        if(reversedstring.equals(original1)){
            return true;
        }
        else{
            return false;
        }
    }
}

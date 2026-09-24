import java.util.Scanner;

public class Program29Assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reverse A String In Java
        String original = "";
        System.out.println("Enter a string you want to be reversed not includes any numeric digits like (0-9).");
        if(sc.hasNextInt() || sc.hasNextDouble()){
            System.out.println("Error: You entered numbers please enter letters instead.");
            sc.close();
            return;
        }
        else{
             original = sc.nextLine();
        }
        // Reversing the string
        String reversed = "";
        for(int i=0;i<original.length();i++){
          reversed = original.charAt(i) + reversed;
        }
       System.out.println("Original string is : "+ original + " and the reversed would be : "+ reversed);
       sc.close();
        }
    }


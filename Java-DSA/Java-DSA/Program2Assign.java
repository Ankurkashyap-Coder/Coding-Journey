import java.util.*;
public class Program2Assign {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
       // 2. Take name as input and print a greeting message for that particular name.
        System.out.println("Enter your name to pop up the greeting message: ");
        if(!ob.hasNextLine()){
            System.out.println("Please enter a valid name:");
        }
        else{
        String name=ob.nextLine().trim();
        if(name.isEmpty()|| !name.matches("[a-zA-Z\\s]+")){
            System.out.println("Error: Please enter a valid name containing only letters.");
        }
        else{
        System.out.println("Celebrating growth, and hard work, and the exciting new chapter ahead. Cheer to the journey! "+name);
        ob.close();
    }
}
}
}

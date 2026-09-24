import java.util.Scanner;

public class Program26Assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // CGPA Java Program
        int subjects;
        System.out.println("Enter the numbers of subjects as per your university policy.");
        if(sc.hasNextInt()){
            subjects = sc.nextInt();
        }
        else{
            sc.next();
            System.out.println("Error: Entered numbers of subjects is not a valid numeric digit.");
            sc.close();
            return;
        }
        // Looping to add all the credits
        int num;
        int sum =0;
        if(subjects > 0){
        for(int i=1;i<=subjects;i++){
            System.out.println("Enter the "+ i + " subject Grade.");
             if(sc.hasNextInt()){
                num = sc.nextInt();
             }
             else {
                sc.next();
                System.out.println("Error: Entered Grade is not a valid Numeric Digit.");
                sc.close();
                return;
             }
             if (num < 0 || num > 10) {
         System.out.println("Error: Grade point must be between 0 and 10.");
         sc.close();
         return;
     }
             sum +=num;
        }
            
            double CGPA = (double) sum / subjects;
            System.out.println("Your CGPA comes out to be : "+CGPA);
           
        }
         sc.close();
}
}

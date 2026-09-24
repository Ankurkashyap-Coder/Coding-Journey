import java.util.*;
public class Program28Asign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Find Ncr & Npr
        // Finding NPR
        int choice;
        System.out.println("Menu : \n 1. NPR \n 2. NCR");
        System.out.println("Enter your choice.");
        if(sc.hasNextInt()){
            choice = sc.nextInt();
        }
        else{
            sc.next();
            System.out.println("Error: Please enter a valid numeric digit to find NCR and NPR. 1 for NPR and 2. For NCR");
            sc.close();
            return;
        }
        switch(choice){
        case 1: {
        int n;
        System.out.println("Enter the total number of items");
        if(sc.hasNextInt()){
            n = sc.nextInt();
        }
        else{
            sc.next();
            System.out.println("Error: Entered total number of items is not a valid numeric digits.");
            sc.close();
            return;
        }
        int r;
        System.out.println("Enter the total selected items.");
        if(sc.hasNextInt()){
            r = sc.nextInt();
        }
        else{
            sc.next();
            System.out.println("Error: Entered selected numbers of items is not a valid numeric digits.");
            sc.close();
            return;
        }
        if (n < 0 || r < 0 || r > n) {
    System.out.println("Error: Constraints violated! Ensure n >= 0, r >= 0, and r <= n.");
    sc.close();
    return;
}
        long total1 = 1;
        for(int i=1;i<=n;i++){
            total1 = total1 * i;
        }
        long total2 = 1;
        for(int i = 1 ; i<=(n - r); i++){
            total2 = total2 * i;
        }
        
        if(total2 > 0){
        double result = (double) total1 / total2;
      System.out.println("Your NPR comes out to be : "+ result);
    }
    break;
}
case 2 : {

    // Calculating NCR
    int n1;
    System.out.println("Enter the total numbers of items for NCR.");
    if(sc.hasNextInt()){
        n1 = sc.nextInt();
    }
    else{
        sc.next();
        System.out.println("Error: Entered total numbers of items is not a valid numeric digit.");
        sc.close();
        return;
    }
    int r1;
    System.out.println("Enter the items selected by you.");
    if(sc.hasNextInt()){
        r1 = sc.nextInt();
    }
    else{
        sc.next();
        System.out.println("Entered selected numbers of items is not a valid numeric digit.");
        sc.close();
        return;
    }
    long sum1 = 1;
    long sum2 = 1;
    long sum3 = 1;
    // Calculating n factorial 
    if (n1 < 0 || r1 < 0 || r1 > n1) {
    System.out.println("Error: Constraints violated! Ensure n >= 0, r >= 0, and r <= n.");
    sc.close();
    return;
}
    for(int i=1; i<=n1;i++){
        sum1 = sum1 * i;
    }
    // Calculating r factorial
    for(int i =1 ; i<=r1; i++)
    {
        sum2 = sum2 * i;
    }
    // Calculating n - r factorial
    for(int i =1; i<=(n1 -r1); i++){
        sum3 = sum3 * i;
    }
    double result3;
    result3 = (double) sum1 / (sum2 * sum3);
    System.out.println("Your result for NCR is : "+result3);
    
    break;
}
default:{
    System.out.println("Invalid choice.");
    sc.close();
    return;
}
   
}
 sc.close();
}
}

import java.util.Scanner;
public class Progarm43LecQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array.");
        if(sc.hasNextInt()){
            size = sc.nextInt();
        }
        else{
            sc.next();
            System.out.println("Error: Enterred size is not a Valid numeric digit.");
            sc.close();
            return;
        }
        //Taking Input from the user

        int[] arr = new int[size];
        System.out.println("Enter elements in Array");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("ORIGINAL ARRAY");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }

        // Applying BUBBLE SORT
        
        int temp;
        for(int i=0;i<size - 1;i++){ //  Be remember that when you are checking the condition it going to give an Array bound error bcz j+1 exceed the limit when i is 4 so we have to run the outer loop till (size - 1)
            for(int j=i;j>=0;j--)
            {
                // Condition for checking 1st index element with the second index element 

                if(arr[j] > arr[j+1]){

                    // Applying Swapping
                    
                 temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("ARRAY AFTER APPLYING BUBBLE SORT IS :");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}

import java.util.*;


class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            
            for (int i = 0; i < T; i++) {
                System.out.println("Enter the coordinate at which chef is standing");
                int A = sc.nextInt();
                System.out.println("Enter the coordinate at which chefina is standing");
                int B = sc.nextInt();
                System.out.println("Enter the coordinate chef increase or decrease.");
                int K = sc.nextInt();
                
                int diff = Math.abs(A - B);
                int steps = (diff + K - 1) / K; // Ceiling division
                
                System.out.println(steps);
            }
        }
        sc.close();
    }
}

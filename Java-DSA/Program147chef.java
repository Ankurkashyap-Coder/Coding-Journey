import java.util.*;


class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        //https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/DICEGAME2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tests user want to check");
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                System.out.println("Enter the six integer to check who win the game");
                int A1 = sc.nextInt();
                int A2 = sc.nextInt();
                int A3 = sc.nextInt();
                int B1 = sc.nextInt();
                int B2 = sc.nextInt();
                int B3 = sc.nextInt();

                // Sum of top 2 = Total sum of 3 - Minimum of the 3
                int min1 = Math.min(A1, Math.min(A2, A3));
                int total1 = (A1 + A2 + A3) - min1;

                int min2 = Math.min(B1, Math.min(B2, B3));
                int total2 = (B1 + B2 + B3) - min2;
                 
            
                if (total1 == total2) {
                    System.out.println("Tie");
                } else if (total1 > total2) {
                    System.out.println("Alice");
                } else {
                    System.out.println("Bob");
                }
            }
        }
        sc.close();
    }
}

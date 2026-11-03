import java.util.*;
public class Program131chef {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            

            int N = sc.nextInt();
           
            for(int i=0;i<N;i++){
                
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                int max = ((a > b) && (a > c)) ? a : ((b > a) && (b > c)) ? b : c ;
                int min = ((a < b) && (a < c)) ? a : ((b < a) && (b < c)) ? b : c ;

                int max2 = (a + b + c) - (max + min);
                System.out.println(max2);
            }
        }
        
        sc.close();
    }
}

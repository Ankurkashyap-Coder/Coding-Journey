public class Typecasting {
    public static void main(String[] args) {
        double preciseValue=456.78956;
         
        //Manual conversion down to an integer
        int truncatedValue= (int)(preciseValue);

        System.out.println("Original highly precise double: "+preciseValue);
        System.out.println("Truncated integer output (Decimal completely lost): "+ truncatedValue);
    }
    
}

public class ExpressionPromt {
    public static void main(String[] args) {
        byte a= 50;
        byte b= 40;

        //Even though 'a' and 'b' are bytes, their products exceeds byte limits.
        //Java automatically prompt it into 4 byte int
        int result= a * b;
        System.out.println("Expression promotion output value: " + result);
    }
    
}

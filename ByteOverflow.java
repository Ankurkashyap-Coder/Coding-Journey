public class ByteOverflow {
    public static void main(String[] args) {
        int oversizedValue= 259;

        //Forcing an oversized value to a 1- byte storage container(-128 to 127)
        byte result= (byte)(oversizedValue);
        // Under-the-hood Logic: 259%256 = 3
        System.out.println("Value forced into byte container: "+ result);
    }
    
}

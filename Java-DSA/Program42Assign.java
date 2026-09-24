import java.util.Arrays;

public class Program42Assign {
    public static void main(String[] args) {
         int[] nums = {1 , 2 , 3, 4};
         int[] index = {2 , 0 , 0 , 1};
         // Use Arrays.toString() to print the array contents
         System.out.println(Arrays.toString(createTargetArray(nums , index)));
    }
        
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int value;
        int pos;
        for(int i=0; i<nums.length; i++) {
           value = nums[i]; 
           pos = index[i];
           for(int j = i; j > pos; j--){
             target[j] = target[j - 1];
           }
           target[pos] = value; 
        } 
        return target;
    } 
}

public class Program36Assign {
   
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int result = 0;
        for(int i = 0;i<nums.length;i++){
            result += nums[i];
            arr[i] = result; 
        }
        return arr;
    }
}


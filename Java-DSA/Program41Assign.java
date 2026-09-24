public class Program41Assign {
    
    public static void main(String[] args) {
        
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int count = 0;
        int temp;
        for(int i=0;i<nums.length;i++)
        {
            count = 0;
            temp = nums[i];
          for(int j=0;j<nums.length;j++){
            if(temp > nums[j]){
                count++;
            }
          }
          arr[i] = count;  
        }
        return arr;
    }
}



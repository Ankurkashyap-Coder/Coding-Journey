public class Program40Assign {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 1 , 1 , 3};
        int result = numIdenticalPairs(arr);
        System.out.println("Your Desired number of Good pairs is : "+result);
        
    }
    public static int numIdenticalPairs(int[] nums) {
      int count = 0;
      int temp;
      for(int i=0;i<nums.length;i++){
        temp = nums[i];
        for(int j=i+1;j<nums.length;j++){
            if(temp == nums[j]){
                count++;
            }
        }
      }
      return count;  
    }
    
}


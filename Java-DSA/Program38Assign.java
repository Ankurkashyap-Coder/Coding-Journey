class Solution {
    public static void main(String[] args) {
        
    }
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        
        int copy = n;
        int temp = 0;
        for(int i=0;i<nums.length / 2;i++){
            arr[temp] = nums[i];
            arr[++temp] = nums[copy];
            ++temp;
            ++copy;
        }
        return arr;
    }
}
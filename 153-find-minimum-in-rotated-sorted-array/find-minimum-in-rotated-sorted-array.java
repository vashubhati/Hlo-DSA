class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int minimum ;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                minimum = nums[i];
                min = Math.min(min,minimum);
            }
        }
        return min;
    }
}
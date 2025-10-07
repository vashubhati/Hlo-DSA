class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2){
            return nums[0];
        }
        int count = 1;
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
            if(count>nums.length/2){
                return nums[i];
            }
        }
        return 0;
    }
}
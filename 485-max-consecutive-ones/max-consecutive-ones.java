class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive=0;
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                maxConsecutive+=1;
            }
            else{
                maxConsecutive = 0;
            }
             max = Math.max(maxConsecutive, max);
        }
       
        return max;
        
    }
}
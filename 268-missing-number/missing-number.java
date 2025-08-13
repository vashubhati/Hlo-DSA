class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int addition = 0;
        int sum = n*(n+1)/2;
        for (int i=0;i<n;i++){
             addition += nums[i];
        }
        int missingno = sum - addition;
        return missingno;
        
    }
}
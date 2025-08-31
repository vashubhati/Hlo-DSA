class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;

        for(int i = 0;i<nums.length;i++){
            right=Math.max(nums[i],right);
        }int ans = right;

        while(left<= right){
            int mid =left+(right-left)/2;

            if(canDivide(nums, mid, threshold)){
                ans = mid;
                right = mid-1;
            }
            else left = mid+1;
        }
        return ans;
    }
    private boolean canDivide(int[] nums, int divisor, int threshold){
        int sum=0;
        for(int num : nums){
            sum+= (num +divisor-1)/ divisor;

            if (sum>threshold) return false;

        }
        return true;
    }
}
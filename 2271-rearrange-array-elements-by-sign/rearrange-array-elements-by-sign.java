class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int postno = 0;
        int negno = 1;

        for (int i = 0;i<n;i++){
            if(nums[i]>0){
            result[postno]=nums[i];
                postno += 2;
            }
            else{
                result[negno]=nums[i];
                negno+=2;
            }
            }
            return result;
        
    }
}
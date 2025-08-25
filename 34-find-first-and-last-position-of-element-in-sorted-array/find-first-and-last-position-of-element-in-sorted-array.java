class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res[0] = i; // first occurrence
                break;
            }
        }
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                res[1] = i; // last occurrence
                break;
            }
        }
        
        return res;
    }
}

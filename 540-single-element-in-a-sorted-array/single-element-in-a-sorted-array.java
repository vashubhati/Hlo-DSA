class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        
        // If only one element in array
        if (n == 1) return nums[0];
        
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            } else {
                i++; // skip the duplicate
            }
        }
        
        // If not found in loop, last element must be the unique one
        return nums[n - 1];
    }
}

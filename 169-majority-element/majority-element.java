class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1; // We start with first element as candidate
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++; // same as candidate → add vote
            } else {
                count--; // different → remove vote
            }

            // If no votes left, choose new candidate
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }
        
        return candidate; // In given problem, majority always exists
    }
}

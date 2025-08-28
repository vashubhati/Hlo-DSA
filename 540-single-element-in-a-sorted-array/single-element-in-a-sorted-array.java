class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // Ensure mid is even (start of a pair)
            if (mid % 2 == 1) mid--;
            
            if (nums[mid] == nums[mid + 1]) {
                // unique element is on the right side
                low = mid + 2;
            } else {
                // unique element is on the left side (or mid itself)
                high = mid;
            }
        }
        
        return nums[low];
    }
}


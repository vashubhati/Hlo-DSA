class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        
        res[0] = findFirst(nums, target);
        res[1] = findLast(nums, target);
        
        return res;
    }
    
    // Find first occurrence using binary search
    private int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int index = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                index = mid;
                high = mid - 1; // keep searching left side
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return index;
    }
    
    // Find last occurrence using binary search
    private int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int index = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                index = mid;
                low = mid + 1; // keep searching right side
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return index;
    }
}

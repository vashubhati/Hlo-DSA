class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid element is greater than the rightmost element,
            // the minimum must be in the right half
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } 
            // Otherwise, the minimum is in the left half (including mid)
            else {
                high = mid;
            }
        }

        // At the end, low == high -> pointing to the minimum
        return nums[low];
    }
}

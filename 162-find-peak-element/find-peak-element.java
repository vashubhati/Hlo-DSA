class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // Peak lies in the left half (including mid)
                high = mid;
            } else {
                // Peak lies in the right half
                low = mid + 1;
            }
        }
        return low; // or high (both are same here)
    }
}

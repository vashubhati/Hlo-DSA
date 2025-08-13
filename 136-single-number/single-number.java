class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];  // found the unique number
            }
        }
        return nums[nums.length - 1]; // if not found earlier, it's the last element
    }
}
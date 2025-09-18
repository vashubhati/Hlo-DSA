class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // slow pointer (tracks unique elements)
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {   // found a new unique element
                i++;                   // move slow pointer
                nums[i] = nums[j];     // place the unique element at new position
            }
        }
        return i + 1; // length of unique elements
    }
}

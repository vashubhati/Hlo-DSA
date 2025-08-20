import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> mostel = new ArrayList<>();

        // Case: if fewer than 3 elements, just return unique ones
        if (n < 3) {
            for (int num : nums) {
                if (!mostel.contains(num)) {
                    mostel.add(num);
                }
            }
            return mostel;
        }

        for (int i = 0; i < n; i++) {
            int count = 1; // count nums[i] itself
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 3 && !mostel.contains(nums[i])) {
                mostel.add(nums[i]);
            }
        }

        return mostel;
    }
}

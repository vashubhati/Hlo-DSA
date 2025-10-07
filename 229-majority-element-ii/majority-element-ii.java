class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int count = 1;
        int n = nums.length;
        List<Integer> arr1 = new ArrayList<>();
        Arrays.sort(nums);

        if (n == 0) return arr1;
        if (n < 3) {  // return unique elements for arrays smaller than 3
            for (int num : nums) {
                if (!arr1.contains(num))
                    arr1.add(num);
            }
            return arr1;
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                // Reset count when current and next nums are different
                count = 1;
            }
            if (count > n / 3 && !arr1.contains(nums[i])) {  // add only if not already present
                arr1.add(nums[i]);
            }
        }

        return arr1;
    }
}

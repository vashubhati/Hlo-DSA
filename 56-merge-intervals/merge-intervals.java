import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        // Step 2: iterate through intervals
        for (int[] interval : intervals) {
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0]) {
                ans.add(interval); // add new interval
            } else {
                // merge with last interval
                ans.get(ans.size() - 1)[1] =
                    Math.max(ans.get(ans.size() - 1)[1], interval[1]);
            }
        }

        // Step 3: convert List<int[]> to int[][]
        return ans.toArray(new int[ans.size()][]);
    }
}

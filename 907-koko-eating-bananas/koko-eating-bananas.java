class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int p : piles) high = Math.max(high, p);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canEatAll(piles, h, mid)) {
                high = mid - 1;   // try slower
            } else {
                low = mid + 1;    // need faster
            }
        }
        return low; // minimum valid speed
    }

    private boolean canEatAll(int[] piles, int h, int k) {
        long hours = 0L;
        for (int p : piles) {
            // ceil(p / k) using integer math, promoted to long
            hours += ( (long)p + k - 1 ) / (long)k;
            if (hours > h) return false; // early stop, avoids overflow and saves time
        }
        return hours <= h;
    }
}


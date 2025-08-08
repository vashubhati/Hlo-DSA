class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; // Negative numbers are not palindromes

        int original = x;
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check for overflow before multiplication
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return false;
            }

            rev = (rev * 10) + digit;
            x = x / 10;
        }

        return rev == original;
    }
}

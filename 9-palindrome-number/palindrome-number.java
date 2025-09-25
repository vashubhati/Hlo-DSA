class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; // Negative numbers are not palindromes
        int original = x;
        int reverse = 0;
        while(x!=0){
            int digit = 0;
            digit = x%10;
            reverse = (reverse*10)+digit;
            x = x/10;
        }
        return reverse == original;

}
}

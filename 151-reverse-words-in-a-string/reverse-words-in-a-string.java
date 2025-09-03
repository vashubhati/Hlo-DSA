class Solution {
    public String reverseWords(String s) {
        // Step 1: Trim extra spaces and convert to char array
        char[] arr = s.trim().toCharArray();
        int n = arr.length;

        // Step 2: Reverse the whole string
        reverse(arr, 0, n - 1);

        int r = 0; // write pointer
        int l = 0; // start index of word
        int i = 0; // read pointer

        while (i < n) {
            // skip multiple spaces
            while (i < n && arr[i] == ' ') i++;

            if (i >= n) break;

            // mark word start
            l = r;

            // copy word
            while (i < n && arr[i] != ' ') {
                arr[r++] = arr[i++];
            }

            // reverse word
            reverse(arr, l, r - 1);

            // add single space after word
            if (r < n) {
                arr[r++] = ' ';
            }
        }

        // remove trailing space if exists
        if (r > 0 && arr[r - 1] == ' ') r--;

        return new String(arr, 0, r);
    }

    // helper method to reverse characters in range
    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}

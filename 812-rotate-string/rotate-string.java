class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        StringBuilder sb = new StringBuilder(s);

        for (int count = 0; count < s.length(); count++) {
            // ✅ check current rotation
            if (sb.toString().equals(goal)) {
                return true;
            }

            // ✅ rotate: move first char to end
            char temp = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(temp);
        }

        return false;
    }
}

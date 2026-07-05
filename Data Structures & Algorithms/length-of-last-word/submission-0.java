class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int i = 0;
        for (i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                len = 0;
            } else {
                if (s.charAt(i) != ' ') {
                    len++;
                }
            }
        }
        if (s.charAt(i) != ' ') {
            len++;
        }
        return len;
    }
}
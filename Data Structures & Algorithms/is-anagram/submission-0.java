class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArr = new char[s.length()];
        char[] tArr = new char[t.length()];
        sArr = s.toCharArray();
        tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        for (int i = 0; i < s.length(); i++) {
            if (sArr[i] != tArr[i]) {
                return false;
            }
        }
        return true;

    }
}

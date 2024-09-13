class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] arrChar = new int[26];

        for (int i = 0; i < s.length(); i++) {

            arrChar[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < t.length(); i++) {

            int tIndex = t.charAt(i) - 'a';
            int count = arrChar[tIndex];

            if (count <= 0) {
                return false;
            } else {
                arrChar[tIndex] -= 1;
            }
        }

        return true;

    }
}

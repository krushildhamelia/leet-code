import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reformat(String s) {
        List<Character> alphabets = new ArrayList<>();
        List<Character> digits = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                alphabets.add(s.charAt(i));
            } else {
                digits.add(s.charAt(i));
            }
        }

        int sizeDiff = Math.abs(alphabets.size() - digits.size());
        if (sizeDiff != 0 && sizeDiff != 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        if (alphabets.size() < digits.size()) {
            List tmp = alphabets;
            alphabets = digits;
            digits = tmp;
        }

        int i = 0, j = 0;
        while(i < alphabets.size() || j < digits.size()) {
            if (i < alphabets.size()) {
                sb.append(alphabets.get(i++));
            }
            if (j < digits.size()) {
                sb.append(digits.get(j++));
            }
        }
        return sb.toString();
    }
}
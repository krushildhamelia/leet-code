import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countVowelSubstrings(String word) {
        String vowels = "aeiou";
        int ans = 0, lastConsonant = -1;
        Map<Character, Integer> lastSeenVowels = new HashMap<Character, Integer>();
        for (char v : vowels.toCharArray()){
            lastSeenVowels.put(v, -2);
        }
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            if (!vowels.contains(String.valueOf(x))) {
                lastConsonant = i;
            } else {
                lastSeenVowels.put(x, i);
                int minLastSeen = i;
                for (int value : lastSeenVowels.values()) {
                    minLastSeen = Math.min(minLastSeen, value);
                }
                ans += Math.max(minLastSeen - lastConsonant, 0);
            }
        }
        return ans;
    }
}

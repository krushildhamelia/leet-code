class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int idxItr = 0;

        if (strs.length == 1) {
            return strs[0];
        }
        while(true) {
            boolean isEqual = true;
            for(int i = 0; i < strs.length - 1; i++) {
                if (idxItr < strs[i].length() && idxItr < strs[i+1].length()) {
                    isEqual = isEqual && strs[i].charAt(idxItr) == strs[i+1].charAt(idxItr);
                } else {
                    return sb.toString();
                }
            }
            if (!isEqual) {
                return sb.toString();
            } else {
                sb.append(strs[0].charAt(idxItr));
            }
            idxItr++;
        }
    }
}
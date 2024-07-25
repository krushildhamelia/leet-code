import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            counts.put(arr[i], count1s(arr[i]));
        }
        return Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> {
                    int compare = counts.get(a) - counts.get(b);
                    if (compare == 0) {
                        return a - b;
                    }
                    return compare;
                })
                .mapToInt(i -> i)
                .toArray();
    }

    private int count1s(int x) {
        int count1 = 0;
        while(x != 0)
        {
            int mod = x % 2;
            count1 = mod == 1 ? (count1+1) : count1;
            x = x / 2;
        }
        return count1;
    }
}
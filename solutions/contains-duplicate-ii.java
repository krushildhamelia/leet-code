import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numIndex = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            Integer leftMostIndex = numIndex.get(nums[i]);
            if (leftMostIndex == null) {
                numIndex.put(nums[i], i);
                continue;
            }
            if (Math.abs(leftMostIndex - i) <= k) {
                return true;
            } else {
                numIndex.put(nums[i], i);
            }
        }
        return false;
    }
}
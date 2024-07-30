import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numCounter = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            Integer count = numCounter.get(nums[i]);
            if (count == null) {
                numCounter.put(nums[i], 1);
            } else {
                return true;
            }
        }
        return false;
    }
}

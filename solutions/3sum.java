import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        // Set<String> elementSetStr = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = nums[i] * -1;

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                if (nums[j] + nums[k] > target) {
                    k--;
                } else if (nums[j] + nums[k] < target) {
                    j++;
                } else {

                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (k > 0 && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    j++;
                    k--;
                }
            }
        }
        return result;
    }
}

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {


        HashMap<Integer, Integer> elementsSet = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int remaining = target - nums[i];
            Integer index = elementsSet.get(nums[i]);

            if(index == null){
                elementsSet.put(remaining, i);
            }else{
                return new int[]{index,i};
            }
        }
        return new int[0];
    }
}

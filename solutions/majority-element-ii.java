class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int nBy3 = nums.length / 3;
        // int size = nums.length;
        // List<Integer> result = new ArrayList<>();

        // // [2,3,3,3,3,3,3,4,4,4,5] = 11 / 3 = 3 
        // for(int i = 0; i < size; i++) {
        //     int count = 1;
        //     int j = i;
        //     while((j < size-1) && nums[j] == nums[j+1]) {
        //         count++;
        //         j++;
        //     }
        //     if (count > nBy3) {
        //         result.add(nums[i]);
        //     }
        //     i = j;
        // }

        // return result;
        Map<Integer, Integer> counter = new HashMap<>();

        for(int num : nums) {
            // counter.put(num, counter.getOrDefault(num, 0) + 1));
            counter.compute(num, (k, v) -> v == null ? 1 : v+1);
        }

        List<Integer> result = new ArrayList<>();
        int nBy3 = nums.length / 3;
        for(Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() > nBy3) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
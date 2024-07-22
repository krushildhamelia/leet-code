class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];

        for(int i = 0; i < nums.length; i++) {
            int j = i;
            int sum = nums[j];
            while((j < nums.length - 1) && nums[j] < nums[j+1]) {
                sum += nums[j+1];
                j++;
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
class Solution {
    public int search(int[] nums, int target) {
        return searchIndex(0, nums.length - 1, target, nums);
    }

    public int searchIndex(int leftIndex, int rightIndex, int target, int[] nums) {

        if (leftIndex > rightIndex) {
            return -1;
        }

        int midIndex = (leftIndex + rightIndex) / 2;

        if (target == nums[midIndex]) {
            return midIndex;
        }

        if (nums[midIndex] <= nums[rightIndex]) {
            if (target > nums[midIndex] && target <= nums[rightIndex]) {
                return searchIndex(midIndex + 1, rightIndex, target, nums);
            } else {
                return searchIndex(leftIndex, midIndex - 1, target, nums);
            }
        } else {
            if (target < nums[midIndex] && target >= nums[leftIndex]) {
                return searchIndex(leftIndex, midIndex - 1, target, nums);
            } else {
                return searchIndex(midIndex + 1, rightIndex, target, nums);
            }
        }

    }
}

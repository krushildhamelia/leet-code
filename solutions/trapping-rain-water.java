class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;

        int trappedWater = 0;
        while(left < right) {

            while(left < right && height[left] <= height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                int waterThatCanBeStoredAtThisPoint = leftMax - height[left];
                trappedWater += (Math.max(waterThatCanBeStoredAtThisPoint, 0));
                left++;
            }

            while(left < right && height[right] < height[left]) {
                rightMax = Math.max(rightMax, height[right]);
                int waterThatCanBeStoredAtThisPoint = rightMax - height[right];
                trappedWater += (Math.max(waterThatCanBeStoredAtThisPoint, 0));
                right--;
            }
        }

        return trappedWater;
    }
}
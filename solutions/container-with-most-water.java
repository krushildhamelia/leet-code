class Solution {
    public int maxArea(int[] height) {
        int max = Math.min(height[0], height[1]);

        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            if (height[left] <= height[right]) {
                int localMax = height[left] * (right - left);
                max = Math.max(localMax, max);
                left++;
            } else {
                int localMax = height[right] * (right - left);
                max = Math.max(localMax, max);
                right--;
            }
        }
        return max;
    }
}
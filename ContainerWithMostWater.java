/**
 * TC : O(n) SC: O(1)
 * Approach : Take two pointer left and right, find the max water can be stored with that two index and compare with max to update it
 */
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        if(height.length == 0) return 0;
        int max = 0;
        while(left < right){
            if(height[left] < height[right]){
                max = Math.max(max,height[left]*(right-left));
                left++;
            }else {
                max = Math.max(max,height[right]*(right-left));
                right--;
            }
        }
        return max;
    }
}
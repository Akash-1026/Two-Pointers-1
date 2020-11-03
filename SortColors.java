/**
 * TC: O(n) SC: O(1)
 * Approach: take left right and mid pointer, when mid is 0 swap with left, if mid is 2 swap with right else increase mid if its 1.
 */
class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0) return;
        int left = 0, mid = 0, right = nums.length-1;
        while(mid <= right && left <= right){
            if(nums[mid] == 1){
                mid++;
            }else if(nums[mid] == 0){
                swap(nums,left,mid);
                left++;
                mid++;
            }else if(nums[mid] == 2){
                swap(nums,right,mid);
                right--;
            }
            
        }
    }
    private void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
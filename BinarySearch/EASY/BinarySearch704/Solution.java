class Solution {
    // TC: O(log2(n))
    public int binarySearch(int[] nums, int target, int left, int right) {
        if(left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2; // for overflow condition 

        if(nums[mid] == target) {
            return mid;
        } else if(nums[mid] < target) {
            return binarySearch(nums, target, mid+1, right);
        } else if(nums[mid] > target) {
            return binarySearch(nums, target, left, mid-1);
        } 
        return -1;
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        return binarySearch(nums, target, left, right);
    }
}
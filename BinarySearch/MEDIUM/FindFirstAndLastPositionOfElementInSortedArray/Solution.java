// Using Upper and Lower bound

class Solution {

    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums,target);
        int last = findLast(nums,target);
        if (first != -1 && last != -1) {
            return new int[]{first,last};
        }
        else{
            return new int[]{-1,-1};
        }
    }

    private int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target <= nums[mid]) {
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
            if (nums[mid] == target) {
                result = mid;// Update result whenever target is found.
            }
        }
        return result;
    }

    private int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
            if (nums[mid] == target) {
                result = mid;// Update result whenever target is found.
            }
        }
        return result;
    }
}
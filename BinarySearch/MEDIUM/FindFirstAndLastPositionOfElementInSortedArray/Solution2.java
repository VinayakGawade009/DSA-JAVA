// if asked to use normal binary search

class Solution {
    // TC: O(2*log2(n))
    public int firstOccurence(int[] nums, int target, int left, int right) {
        int first = -1;
        while(left <= right) {
            int mid = left + (right - left);
            if(nums[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return first;
    }
    
    public int lastOccurence(int[] nums, int target, int left, int right) {
        int last = -1;
        while(left <= right) {
            int mid = left + (right - left);
            if(nums[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return last;
    }

    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int first = firstOccurence(nums, target, left, right);
        int last = lastOccurence(nums, target, left, right);
        
        return new int[] {first, last};
    }
}
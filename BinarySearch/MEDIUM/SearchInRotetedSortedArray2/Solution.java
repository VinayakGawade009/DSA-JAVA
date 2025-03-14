class Solution { // array containing duplicates
    public boolean search(int[] nums, int target) {
        // TC: avg(log2(n)) & O(n/2) {worst case}
        
        int left = 0, right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return true;
            }

            if(nums[left] == nums[mid] && nums[right] == nums[mid]) { // for duplicates handeling
                left++;
                right--;
                continue;
            }


            if( nums[left] <= nums[mid]) { // checking if left half is sorted
                if(nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // checking if right half is sorted
                if(nums[right] >= target && target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }
}
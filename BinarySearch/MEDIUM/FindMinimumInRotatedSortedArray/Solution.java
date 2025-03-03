// brute force can be O(n) single for loop

class Solution {
    // TC: O(log2n)

    public int findMin(int[] nums) {

        int min = nums[0];
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[left] == nums[mid] && nums[right] == nums[mid]) { // if duplicates are exists in array
                min = Math.min(min, nums[left]);
                left++;
                right--;
                continue;
            }

            // Actual code {if duplicates don't exists}

            // if search space is already sorted then arr[left] always be the min element
            if(nums[left] <= nums[right]) { // checking if already provided array is not rotated {i.e. already sorted}
                min = Math.min(min, nums[left]);
                break;
            }

            if(nums[left] <= nums[mid]) {
                min = Math.min(min, nums[left]); // checking minimum element of left array
                left = mid + 1;
            } else {
                min = Math.min(min, nums[mid]); // checking minimum element of right array
                right = mid - 1;
            }
        }

        return min;
    }
}
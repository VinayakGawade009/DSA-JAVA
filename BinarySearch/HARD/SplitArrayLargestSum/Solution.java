// https://leetcode.com/problems/split-array-largest-sum/

class Solution {
    // Helper method to count how many subarrays we can make with maxSumAllowed
    private int countSubarrays(int[] nums, int maxAllowed) {
        int count = 1;
        long currSum = 0;
        for(int i = 0; i < nums.length; i++) {
            // If adding current number doesn't exceed max allowed, add it
            if(currSum + nums[i] <= maxAllowed) {
                currSum += nums[i];
            } else { // else start new subarray
                count++;
                currSum = nums[i];
            }
        }

        return count;
    }

    public int splitArray(int[] nums, int k) {
        // Initialize the search space:
        // - low: the largest number (min possible largest subarray sum)
        // - high: the sum of all numbers (max possible)
        int low = nums[0];
        int high = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > low) {
                low = nums[i];
            }
            high += nums[i];
        }
        // System.out.println(low);
        // System.out.println(high);

        // Binary Search on ans space i.e. low - high
        while(low <= high) {
            int mid = (low + high) / 2;

            int subarrays = countSubarrays(nums, mid);

            if(subarrays > k) { // Too many subarrays: increase max sum
                low = mid + 1;
            } else { // Valid or fewer subarrays: try to minimize more
                high = mid - 1;
            }
        }

        return low;
    }
}
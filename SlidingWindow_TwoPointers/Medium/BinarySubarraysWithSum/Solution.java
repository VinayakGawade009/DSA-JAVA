// https://leetcode.com/problems/binary-subarrays-with-sum/

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        // totalSubarrays(<= goal) - totalSubarrays(<= goal-1) = totalSubarrays(= goal)
        return numSubarrayWithLessOrEqualSum(nums, goal) - numSubarrayWithLessOrEqualSum(nums, goal - 1);

    }

    // Below function counts number of subarrays with sum less or equal to goal
    private int numSubarrayWithLessOrEqualSum(int[] nums, int goal) {
        if(goal < 0) return 0;
        int l = 0, r = 0, sum = 0, count = 0;

        while(r < nums.length) {
            sum += nums[r];

            while(sum > goal) {
                sum = sum - nums[l];
                l++;
            }

            count += (r - l + 1);

            r++;
        }

        return count;
    }

}
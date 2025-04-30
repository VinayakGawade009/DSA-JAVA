// https://leetcode.com/problems/max-consecutive-ones-iii/





// TC: O(N) SC: O(1)

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int zeros = 0;
        int maxLen = 0;
        int n = nums.length;
        while(right < n) {
            if(nums[right] == 0) zeros++;

            if(zeros > k) {
                if(nums[left] == 0) zeros--;
                left++;
            }

            if(zeros <= k) {
                int len = right - left + 1;
                maxLen = Math.max(maxLen, len);
            }

            right++;
        }

        return maxLen;
    }
}
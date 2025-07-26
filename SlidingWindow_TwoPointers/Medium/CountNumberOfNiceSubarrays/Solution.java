// https://leetcode.com/problems/count-number-of-nice-subarrays/

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // numberOfSubarrays(odd no's <= k) - numberOfSubarrays(odd no's <= k-1) = numberOfSubarrays(odd no's = k)
        return helper(nums, k) - helper(nums, k - 1);
    }

    private int helper(int[] nums, int k) {
        if(k < 0) return 0;

        int l = 0, r = 0, sum = 0, count = 0;

        while(r < nums.length) {
            sum += (nums[r] % 2);

            while(sum > k) {
                sum -= (nums[l] % 2);
                l++;
            }
            count += (r - l + 1); // counts subarrays with (odd no. <= k)
            r++;
        }

        return count;
    }

}
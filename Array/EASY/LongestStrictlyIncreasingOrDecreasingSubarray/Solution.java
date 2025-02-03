class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int longest = 1;
        int inc = 1;
        int dec = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                dec = 1;
                inc++;
                longest = Math.max(longest, inc);
            } else if(nums[i] < nums[i-1]) {
                inc = 1;
                dec++;
                longest = Math.max(longest, dec);
            } else {
                inc = 1;
                dec = 1;
            }
        }
        return longest;
    }
}
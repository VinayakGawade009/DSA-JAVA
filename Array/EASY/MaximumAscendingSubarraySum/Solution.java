class Solution {
    public int maxAscendingSum(int[] nums) {
        int asc = 1;
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] < nums[i+1]) {
                asc++;
                sum += nums[i+1];
                maxSum = Math.max(maxSum, sum);
            } else {
                asc = 1;
                maxSum = Math.max(maxSum, sum);
                sum = nums[i+1]; 
            }
        }
        return maxSum;
    }
}
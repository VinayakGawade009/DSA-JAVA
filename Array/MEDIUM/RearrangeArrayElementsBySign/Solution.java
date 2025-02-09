class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int pos = 0; 
        int neg = 0;

        for(int i=0; i<n; i++) {
            if(nums[i] > 0) {
                ans[pos*2] = nums[i];
                pos++;
            } else {
                ans[neg*2+1] = nums[i];
                neg++;
            }
        }

        return ans;
    }
}
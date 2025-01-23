class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int copy[] = new int[n+1];
        // for(int i=0; i<n; i++) {
        //     copy[nums[i]]++;
        // }
        // for(int i=0; i<copy.length; i++) {
        //     if(copy[i]==0) {
        //         return i;
        //     }
        // }
        // return -1;

        int n = nums.length;
        int totalSum = (n*(n+1))/2;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            // totalSum = totalSum + i + 1;
            sum+=nums[i];
        }
        return totalSum-sum;
    }
}
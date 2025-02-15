// Sliding window (increament right and if condition violates pop elements from left)

public class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            if(k<=1){
                return 0;
            }
            int n = nums.length;
            int product = 1;
            int left =0;
            int right = 0;
            int count =0;
              while(right<n){
                product = product * nums[right];
    
                while(product>=k){
                product /= nums[left];
                left++;
                }
                count += (right - left + 1);
                right++;
              }
            return count;
        }
}

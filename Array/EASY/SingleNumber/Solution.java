class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0; // A ^ 0 = A
        for(int num : nums) {
            ans ^= num; // XORing a value with itself gives zero (0) 
        }
        return ans;
    }
}
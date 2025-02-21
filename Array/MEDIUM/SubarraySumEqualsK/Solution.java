import java.util.HashMap;
class Solution {
    public int subarraySum(int[] nums, int k) {

        // for storing previous sums (for checking if sum - k exists)
        HashMap<Integer, Integer> preSum = new HashMap<>();

        // base condition for 1st subarray sum = k i.e. sum - k = 0
        preSum.put(0, 1);
        int sum = 0, count = 0;
        
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            int remove = sum - k;
            if(preSum.containsKey(remove)) {
                count += preSum.get(remove);
            }
            if(preSum.containsKey(sum)) {
                preSum.put(sum , preSum.get(sum) + 1);
            } else {
                preSum.put(sum, 1);
            }
        }

        return count;
    }
}
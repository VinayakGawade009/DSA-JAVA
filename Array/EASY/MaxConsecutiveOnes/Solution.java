class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr = 0;
        int next = 0;
        for(int num : nums) {
            if(num == 1) {
                next++;
            } else if(curr < next) {
                curr = next;
                next = 0;
            } else {
                next = 0;
            }
        }
        if(curr < next) {
            curr = next;
        }
        return curr;
    }
}
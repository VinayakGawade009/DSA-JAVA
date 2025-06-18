// https://leetcode.com/problems/jump-game-ii/


class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for(int i = 0; i < nums.length-1; i++) { // no need to chek last index for jump
            farthest = Math.max(farthest, i + nums[i]);

            if(i == currentEnd) { // farthest jump at current range is reached so add 1 to jump
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}
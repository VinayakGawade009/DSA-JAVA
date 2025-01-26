import java.util.*;

public class Solution {
    // Brute Force
    // public int[] twoSum(int[] nums, int target) {
    //     int result[] = new int[2];
    //     for(int i=0; i<nums.length; i++) {
    //         int x = nums[i];
    //         int y = target - x;
    //         for(int j=0; j<nums.length && j != i; j++) {
    //             if(y == nums[j]) {
    //                 result[0] = i;
    //                 result[1] = j;
    //                 return result;
    //             }
    //         }
    //     }
    //     return result;
    // }

    // Time: O(n)
    // Space: O(n)
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int curr = nums[i];
            int x = target - curr;
            if(map.containsKey(x)) {
                return new int[] { map.get(x), i};
            }
            map.put(curr, i);
        }
        return null;
    }
}
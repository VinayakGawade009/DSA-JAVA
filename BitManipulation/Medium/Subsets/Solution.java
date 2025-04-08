// https://leetcode.com/problems/subsets/description/


import java.util.List;
import java.util.ArrayList;


// TC:O(n * 2^n)
// SC:O(2^n * n)
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int subsets = 1 << n; // total 2^n subsets
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int num=0; num<subsets; num++) {
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<n; i++) {
                if((num & (1 << i)) != 0) { // check if ith bit is set
                    list.add(nums[i]);
                }
            }
            ans.add(list);
        }

        return ans;
    }
}

// Ex.
// nums = [1, 2, 3]
// n = 3 → 1 << 3 = 8 subsets (0 to 7)

// Binary:  0 0 0  → []
// Binary:  0 0 1  → [1]
// Binary:  0 1 0  → [2]
// Binary:  0 1 1  → [1, 2]
// Binary:  1 0 0  → [3]
// Binary:  1 0 1  → [1, 3]
// Binary:  1 1 0  → [2, 3]
// Binary:  1 1 1  → [1, 2, 3]

import java.util.*;

// TC: O(n * 2^n)

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int subset = 1 << n;

        Set<List<Integer>> ans =  new HashSet<>(); // Set eleminate duplicates

        for(int num=0; num<subset; num++) {
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<n; i++) {
                if((num & (1<<i)) != 0) {
                    list.add(nums[i]);
                }
            }
            ans.add(list);
        }

        return new ArrayList<>(ans);
    }
}
// for better handling of duplicates for generating subsets use of backtracking is better

import java.util.*;

// tc: O(2^n * n)

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort the array to bring duplicates together

        List<List<Integer>> ans =  new ArrayList<>();

        backtrack(0, new ArrayList<>(), ans, nums);

        return ans;
    }

    private void backtrack(int index, List<Integer> current, List<List<Integer>> ans, int[] nums) {
        ans.add(new ArrayList<>(current)); // Add the current subset to the result

        for(int i = index; i < nums.length; i++) {
            // Skip duplicates at the same recursive depth
            if(i > index && nums[i] == nums[i - 1]) continue;

            current.add(nums[i]); // Include nums[i] in the current subset
            backtrack(i + 1, current, ans, nums); // Recurse with the next index
            current.remove(current.size() - 1); // Backtrack: remove last element before next iteration
        }
    }
}


// Ex.
// int[] nums = {1, 2, 2};

// We first sort it → [1, 2, 2]

// Now, the subsets (in recursion tree style):

// Start from index 0 → []

//   Include 1 → [1]
//     Include 2 → [1, 2]
//       Include 2 again → [1, 2, 2]
//       Backtrack → [1, 2]
//     Skip second 2 (duplicate at same level) → Backtrack to [1]
  
//   Backtrack → []

//   Include first 2 → [2]
//     Include second 2 → [2, 2]
//     Backtrack → [2]
//   Skip second 2 → Backtrack to []

// ✅ Final Output:
// [[], [1], [1,2], [1,2,2], [2], [2,2]]
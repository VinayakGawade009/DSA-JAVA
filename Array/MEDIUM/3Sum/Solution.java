import java.util.*;

// 25ms (dry run is must)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array

        for(int i=0; i<nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
             
            while(j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if(total > 0) {
                    k--;
                } else if(total < 0) {
                    j++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while(nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
                }
            }

        }
        return result;
    }
}



// 31 ms (easy for understanding)
// import java.util.*;

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         Arrays.sort(nums); // Step 1: Sort the array

//         for (int i = 0; i < nums.length - 2; i++) {
//             if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate values

//             int left = i + 1, right = nums.length - 1;
//             while (left < right) {
//                 int sum = nums[i] + nums[left] + nums[right];

//                 if (sum == 0) {
//                     result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
//                     // Move pointers and skip duplicates
//                     while (left < right && nums[left] == nums[left + 1]) left++; 
//                     while (left < right && nums[right] == nums[right - 1]) right--;

//                     left++;
//                     right--;
//                 } else if (sum < 0) {
//                     left++; // Increase sum
//                 } else {
//                     right--; // Decrease sum
//                 }
//             }
//         }
//         return result;
//     }
// }
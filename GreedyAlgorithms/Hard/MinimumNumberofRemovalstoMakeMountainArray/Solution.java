// https://leetcode.com/problems/minimum-number-of-removals-to-make-mountain-array/submissions/1661765633/


class Solution { // TC: O(N2) SC: O(N)
    public int minimumMountainRemovals(int[] nums) {

        int n = nums.length;
        int[] lis = new int[n]; // Stores LIS(longest increasing subsequence) for each i
        int[] lds = new int[n]; // Stores LDS(longest decreasing subsequence) for each i

        // Compute LIS from left to right
        for (int i = 0; i < n; i++) {

            lis[i] = 1;

            for (int j = 0; j < i; j++) {

                if (nums[j] < nums[i]) {

                    lis[i] = Math.max(lis[i], lis[j] + 1);
                    
                }

            }

        }

        // Compute LDS from right to left
        for (int i = n - 1; i >= 0; i--) {

            lds[i] = 1;

            for (int j = n - 1; j > i; j--) {

                if (nums[j] < nums[i]) {

                    lds[i] = Math.max(lds[i], lds[j] + 1);

                }

            }
            
        }

        // Find max mountain lenght;
        int maxMountain = 0;
        for (int i = 1; i < n - 1; i++) {
            
            if(lds[i] > 1 && lis[i] > 1) {

                maxMountain = Math.max(maxMountain, lis[i] + lds[i] - 1); // -1 because we conpute peek 2 times in lis and lds

            }

        }

        return n - maxMountain; // return minimum removeCount
    }
}

// class Solution { // TC: O(nLogn) SC: O(N)
//     public int minimumMountainRemovals(int[] nums) {

//         int n = nums.length;
//         int[] lis = new int[n]; // Stores LIS(longest increasing subsequence) for each i
//         int[] lds = new int[n]; // Stores LDS(longest decreasing subsequence) for each i

//         // Compute LIS using patience sort idea
//         List<Integer> incr = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
            
//             int idx = binarySearch(incr, nums[i]);

//             if(idx == incr.size()) {
//                 incr.add(nums[i]);
//             } else {
//                 incr.set(idx, nums[i]);
//             }
            
//             lis[i] = idx + 1;
//         }

//         // Compute LDS by reversing and applying LIS logic
//         List<Integer> decr = new ArrayList<>();
//         for (int i = n - 1; i >= 0; i--) {

//             int idx = binarySearch(decr, nums[i]);

//             if(idx == decr.size()) {
//                 decr.add(nums[i]);
//             } else {
//                 decr.set(idx, nums[i]);
//             }
            
//             lds[i] = idx + 1;
//         }

//         // Find max mountain lenght (lis + lds - 1)
//         int maxMountain = 0;
//         for (int i = 1; i < n - 1; i++) {
            
//             if(lds[i] > 1 && lis[i] > 1) {

//                 maxMountain = Math.max(maxMountain, lis[i] + lds[i] - 1); // -1 because we conpute peek 2 times in lis and lds

//             }

//         }

//         return n - maxMountain; // return minimum removeCount
//     }

//     private int binarySearch(List<Integer> list, int target) {
//         int left = 0, right = list.size() - 1, ans = list.size();
//         while(left <= right) {
//             int mid = (left + right) / 2;
//             if(list.get(mid) >= target) {
//                 ans = mid;
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }
//         }

//         return ans;
//     }
// }
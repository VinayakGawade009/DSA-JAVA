import java.util.*;

class Solution {
    public int[][] merge(int[][] arr) { // with constant space complexity and nlogn tc
        int n = arr.length;
        
        // Step 1: Sort intervals by start time
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int index = 0; // Points to the last merged interval in arr
        
        // Step 2: Merge intervals in-place
        for (int i = 1; i < n; i++) {
            // If intervals overlap, merge them
            if (arr[i][0] <= arr[index][1]) {
                arr[index][1] = Math.max(arr[index][1], arr[i][1]);
            } else {
                // Move the non-overlapping interval forward
                index++;
                arr[index] = arr[i]; // Copy arr[i] to new position
            }
        }

        // Step 3: Copy the first (index + 1) elements as the result
        return Arrays.copyOf(arr, index + 1);
    }
}

import java.util.*;

class Solution {
    public int[][] merge(int[][] arr) { // TC: O(nlogn)+O(n)+O(n) = O(nlogn) & SC: O(n) {if all intervals are not overlapping i.e. worst case}
        int n = arr.length;

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0])); // Sorting: O(nlogn)

        List<int[]> ans = new ArrayList<>();

        for(int i=0; i<n; i++) { // Merging: O(n)
            if(ans.isEmpty() || arr[i][0] > ans.get(ans.size()-1)[1]) {
                ans.add(arr[i]);
            } 
            else {
                ans.get(ans.size()-1)[1] = Math.max(arr[i][1], ans.get(ans.size()-1)[1]);
            }
        }

        return ans.toArray(new int[ans.size()][]); // Converting List to Array: O(n)
    }
}
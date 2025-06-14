// https://leetcode.com/problems/non-overlapping-intervals/


import java.util.*;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int removeCount = 0;
        int chainEnd = intervals[0][1];
        for(int i = 1; i < intervals.length; i++) {
            if(chainEnd > intervals[i][0]) {
                removeCount++;
            } else {
                chainEnd = intervals[i][1];
            }
        }

        return removeCount;
    }
}
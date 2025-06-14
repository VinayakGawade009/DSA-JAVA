// https://leetcode.com/problems/maximum-length-of-pair-chain/solutions/6830745/greedy-sort-by-end-time-activity-selecti-uqnh/

import java.util.*;

class Solution {
    public int findLongestChain(int[][] pairs) {

        // Sort array about second item of pairs
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int length = 1;
        int chainEnd = pairs[0][1];

        for(int i=1; i<pairs.length; i++) {

            // A pair p2 = [c, d] follows a pair p1 = [a, b] if b < c.
            if(pairs[i][0] > chainEnd) {

                length++; // increase chain length
                chainEnd = pairs[i][1]; // update chain end

            }

        }

        return length;
    }
}
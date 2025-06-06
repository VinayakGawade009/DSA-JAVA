// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/union-of-two-arrays3538

import java.util.*;

class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer> set = new HashSet<>();
        int union = 0;
        
        for(int i=0; i<a.length; i++) {
            if(!set.contains(a[i])) {
                set.add(a[i]);
                union++;
            }
        }
        
        for(int i=0; i<b.length; i++) {
            if(!set.contains(b[i])) {
                set.add(b[i]);
                union++;
            }
        }
        
        return union;
    }
}
// https://leetcode.com/problems/assign-cookies/


import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        // If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content
        // hence sort both arrays for optimal solution
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // child pointer
        int j = 0; // cookie pointer
        int count = 0;

        while(i< g.length && j < s.length) {
            if(s[j] >= g[i]) {
                count++;
                i++; // increment only when cookie is assigned
            }
            j++;
        }

        return count;
    }
}
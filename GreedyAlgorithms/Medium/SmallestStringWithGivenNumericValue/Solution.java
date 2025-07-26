// https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/

class Solution {
    public String getSmallestString(int n, int k) {
        char ans[] = new char[n];
        k -= n; 

        for(int i = n - 1; i >= 0; i--) {
            if(k >= 25) {
                ans[i] = 'z'; // use max possible values at this position
                k -= 25;
            } else {
                ans[i] = (char) ('a' + k); // fill remaining  positions
                k = 0; // after this remaining position be all 'a'
            }
        }

        return new String(ans);
    }
}
// https://leetcode.com/problems/split-a-string-in-balanced-strings/

class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int maxBalancedStrings = 0;

        for(char ch : s.toCharArray()) {
            if(ch == 'L') count++;
            if(ch == 'R') count--;
            if(count == 0) maxBalancedStrings++;
        }

        return maxBalancedStrings;
    }
}
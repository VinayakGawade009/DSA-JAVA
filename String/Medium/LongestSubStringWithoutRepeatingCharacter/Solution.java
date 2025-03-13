import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>(); // (char, index)
        int left = 0;

        for(int right = 0; right < n; right++) {
            char curr = s.charAt(right);
            if(!charMap.containsKey(curr) || charMap.get(curr) < left) { // if char is repeated
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = charMap.get(curr) + 1;
            }
            charMap.put(curr, right); 
        }

        return maxLength;
    }
}
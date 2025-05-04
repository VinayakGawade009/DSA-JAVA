// https://leetcode.com/problems/roman-to-integer/



import java.util.Map;
import java.util.HashMap;


class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = s.length();
        int ans = map.get(s.charAt(n-1));
        for(int i=n-2; i>=0; i--) {
            if(s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
                ans -= 1;
                continue;
            }
            if(s.charAt(i) == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) {
                ans -= 10;
                continue;
            }
            if(s.charAt(i) == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
                ans -= 100;
                continue;
            }

            ans += map.get(s.charAt(i));
        }

        return ans;
    }
}
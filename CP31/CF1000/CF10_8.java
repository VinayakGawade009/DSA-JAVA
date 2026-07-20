// https://codeforces.com/problemset/problem/1791/D

import java.util.*;

public class CF10_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int[] f = new int[26];
            int distinct = 0;

            for(int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if(f[ch - 'a'] == 0) {
                    distinct++;
                }
                f[ch - 'a']++;
            }

            long ans = 0;
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                set.add(ch);
                f[ch - 'a']--;
                if(f[ch - 'a'] == 0) {
                    distinct--;
                }

                ans = Math.max(ans, set.size() + distinct);
            }

            System.out.println(ans);
        }
    }
}
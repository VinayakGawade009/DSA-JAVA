// https://codeforces.com/problemset/problem/1666/D

import java.util.*;

public class CF9_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-- > 0) {
            String s = sc.next();
            String t = sc.next();

            int[] neededFreq = new int[26];
            for(char ch : t.toCharArray()) {
                neededFreq[ch - 'A']++;
            }

            StringBuilder keptChars = new StringBuilder();

            // r -> l
            for(int i = s.length() - 1; i >= 0; i--) {
                char curr = s.charAt(i);

                if(neededFreq[curr - 'A'] > 0) {
                    keptChars.append(curr);
                    neededFreq[curr - 'A']--;
                }
            }
            
            keptChars.reverse();

            if(keptChars.toString().equals(t)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}

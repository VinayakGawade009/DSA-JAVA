// https://codeforces.com/problemset/problem/1606/A

import java.util.*;

public class CF9_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int n = s.length();

            int ab = 0;
            int ba = 0;
            for (int i = 0; i < n - 1; i++) {
                char curr = s.charAt(i);
                char next = s.charAt(i + 1);

                if (curr == 'a' && next == 'b') {
                    ab++;
                }
                if (curr == 'b' && next == 'a') {
                    ba++;
                }
            }

            StringBuilder sb = new StringBuilder(s);
            if (ab == ba) {
                System.out.println(s);
                continue;
            } else if (ab > ba) {
                int i = 0;
                while (sb.charAt(i) != 'a') {
                    i++;
                }
                sb.setCharAt(i, 'b');
            } else if (ba > ab) {
                int i = 0;
                while (sb.charAt(i) != 'b') {
                    i++;
                }
                sb.setCharAt(i, 'a');
            }

            System.out.println(sb.toString());
        }

        sc.close();
    }
}

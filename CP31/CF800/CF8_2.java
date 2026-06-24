// https://codeforces.com/problemset/problem/1901/A

import java.util.*;

public class CF8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int prev = 0;

            int ans = 1;
            for(int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if(i == n - 1) {
                    ans = Math.max(ans, Math.max((x - a) * 2, a - prev));
                    break;
                }
                ans = Math.max(ans, a - prev);
                prev = a;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

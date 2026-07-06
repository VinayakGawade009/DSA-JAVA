// https://codeforces.com/problemset/problem/1440/B

import java.util.*;

public class CF9_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long[] a = new long[n * k];
            for(int i = 0; i < n*k; i++) {
                a[i] = sc.nextLong();
            }

            int gap = n == 2 ? 2 : (n / 2) + 1;
            long ans = 0;
            int cnt = 0;
            for(int i = (n * k - 1) - (n / 2); i >= 0 && cnt < k; i -= gap) {
                ans += a[i];
                cnt++;
            }

            System.out.println(ans);
        }
    }
}
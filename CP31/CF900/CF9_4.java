// https://codeforces.com/problemset/problem/1875/A

import java.util.*;

public class CF9_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int[] x = new int[n];

            for(int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
            }

            long ans = b;

            for(int i = 0; i < n; i++) {
                ans += Math.min(x[i], a - 1);
            }

            System.out.println(ans);

        }
    }
}
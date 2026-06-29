// https://codeforces.com/problemset/problem/1807/D

import java.util.*;

public class CF9_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] a = new long[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if(i > 0) {
                    a[i] += a[i - 1];
                }
            }

            long sum = a[n - 1];

            for(int i = 0; i < q; i++) {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;
                long k = sc.nextLong();

                long currSum = sum;
                if(l == 0) {
                    currSum -= a[r];
                } else {
                    currSum -= a[r] - a[l - 1];
                }

                currSum += (r - l + 1) * k;

                if(currSum % 2 == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }
        }
    }
}
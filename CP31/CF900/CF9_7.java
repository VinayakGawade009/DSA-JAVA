// https://codeforces.com/problemset/problem/1850/D

import java.io.*;
import java.util.*;

public class CF9_7 {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            Long[] a = new Long[n];

            for(int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            int maxValid = 1;
            int curr = 1;
            for(int i = 1; i < n; i++) {
                if(a[i] - a[i - 1] <= k) {
                    curr++;
                    maxValid = Math.max(curr, maxValid);
                } else {
                    curr = 1;
                }
            }

            System.out.println(n - maxValid);
        }
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) {e.printStackTrace();}
            }

            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}

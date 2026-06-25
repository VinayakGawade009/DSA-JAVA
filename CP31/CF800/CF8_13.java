// https://codeforces.com/problemset/problem/1859/A

import java.util.*;

public class CF8_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];

            boolean allIdentical = true;
            long max = 0;
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if(i > 0 && a[i] != a[i - 1]) {
                    allIdentical = false;
                }
                max = Math.max(max, a[i]);
            }

            if(allIdentical) {
                System.out.println(-1);
                continue;
            }

            List<Long> b = new ArrayList<>();
            List<Long> c = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                if(a[i] == max) {
                    c.add(a[i]);
                } else {
                    b.add(a[i]);
                }
            }

            System.out.println(b.size() + " " + c.size());
            for(long i : b) {
                System.out.print(i + " ");
            }
            System.out.println();

            for(long i : c) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

// https://codeforces.com/problemset/problem/1859/B

import java.util.*;

public class CF10_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            long[][] arr = new long[n][2];
            long minimum = Long.MAX_VALUE;

            for(int i = 0; i < n; i++) {
                long m = sc.nextLong();

                long min = Long.MAX_VALUE;
                long secondMin = min;
                for(int j = 0; j < m; j++) {
                    long a = sc.nextLong();
                    if(a < min) {
                        secondMin = min;
                        min = a;
                    } else if(a < secondMin) {
                        secondMin = a;
                    }
                }
                arr[i][0] = secondMin;
                arr[i][1] = min;
                minimum = Math.min(min, minimum);
            }

            Arrays.sort(arr, (a, b) -> {
                if(a[0] == b[0]) {
                    return Long.compare(b[1], a[1]);
                }
                return Long.compare(b[0], a[0]);
            });

            long ans = 0;

            for(int i = 0; i < n - 1; i++) {
                ans += arr[i][0];
            }

            ans += minimum;

            System.out.println(ans);
        }
    }
}

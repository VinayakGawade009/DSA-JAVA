// https://codeforces.com/problemset/problem/1675/B

import java.util.*;

public class CF9_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long prev = Long.MAX_VALUE;

            long ans = 0;
            
            boolean notValid = false;
            for(int i = n - 1; i >= 0; i--) {
                while(a[i] >= prev) {
                    if(a[i] == 0) {
                        notValid = true;
                        break;
                    }
                    a[i] = a[i] / 2;
                    ans++;
                }

                if(notValid) {
                    break;
                }
                
                prev = a[i];
            }

            if(notValid) {
                System.out.println(-1);
                continue;
            }

            System.out.println(ans);
        }
    }
}
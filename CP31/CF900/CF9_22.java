// https://codeforces.com/problemset/problem/1582/B

import java.util.*;

public class CF9_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            int oneCnt = 0;
            int zeroCnt = 0;

            for(int i = 0; i < n; i++) {
                long a = sc.nextLong();
                if(a == 1) {
                    oneCnt++;
                }
                if(a == 0) {
                    zeroCnt++;
                }
            }

            long ans = oneCnt * (long)Math.pow(2, zeroCnt);

            System.out.println(ans);
        }
    }
}
// https://codeforces.com/problemset/problem/1828/B

import java.util.*;

public class CF9_9 {


    public static int  gcd(int a, int b) {
        if(b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            int k = 0;
            for(int i = 0; i < n; i++) {
                int p = sc.nextInt();

                int dist = Math.abs(p - (i + 1));

                if(dist != 0) {
                    k = gcd(k, dist);
                }
            }

            System.out.println(k);
        }

        sc.close();
    }
}

// https://codeforces.com/problemset/problem/1805/A

import java.util.*;

public class CF8_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            long bitmask = 0;

            for(int i = 0; i < n; i++) {
                int a = sc.nextInt();
                bitmask ^= a;
            }

            if(n % 2 == 0 && bitmask != 0) {
                System.out.println(-1);
            } else {
                System.out.println(bitmask);
            }
        }
    }
}
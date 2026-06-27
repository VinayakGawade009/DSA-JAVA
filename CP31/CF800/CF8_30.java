// https://codeforces.com/problemset/problem/1766/A

import java.util.*;

public class CF8_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            if(n <= 10) {
                System.out.println(n);
                continue;
            }

            int ans = 0;
            int prev = 0;
            boolean greaterThanUnit = false;
            while(n != 0) {
                if(greaterThanUnit) {
                    ans += 9 - prev;
                }
                int rem = n % 10;
                n /= 10;
                prev = rem;
                ans += rem;
                greaterThanUnit = true;
            }

            System.out.println(ans);
        }
    }
}

// https://codeforces.com/problemset/problem/1814/A

import java.util.*;

public class CF8_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if(n > k && (n - k) % 2 == 0) {
                System.out.println("YES");
                continue;
            }
            if(n % k == 0 || ((n % k) % 2 == 0) || n % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}

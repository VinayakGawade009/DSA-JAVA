// https://codeforces.com/problemset/problem/1761/A

import java.util.*;

public class CF8_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(n == 1 || (n == a && n == b)) {
                System.out.println("YES");
                continue;
            }

            int diff = n - a - b;

            if(diff >= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

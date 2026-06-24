// https://codeforces.com/problemset/problem/1857/A

import java.util.*;

public class CF8_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            int even = 0;
            int odd = 0;

            int sum = 0;

            for(int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if(a % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                sum += a;
            }

            if((sum % 2 == 0 && even > 0) || (sum % 2 == 0 && odd > 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
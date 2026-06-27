// https://codeforces.com/problemset/problem/1789/A

import java.util.*;

public class CF8_26 {

    public static int gcd(int a, int b) {
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

            int[] a = new int[n];

            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            boolean flag = false;
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    if(gcd(a[i], a[j]) <= 2) {
                        flag = true;
                        break;
                    }
                }
                if(flag) {
                    break;
                }
            }

            if(flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

        sc.close();
    }
}

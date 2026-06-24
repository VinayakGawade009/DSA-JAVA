// https://codeforces.com/problemset/problem/1903/A

import java.util.*;

public class CF8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            boolean valid = true;
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(i > 0 && valid) {
                    if(a[i] < a[i - 1]) {
                        valid = false;
                    }
                }
            }

            if(k == 1 && !valid) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
        }

        sc.close();
    }
}

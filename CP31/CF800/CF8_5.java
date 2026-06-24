// https://codeforces.com/problemset/problem/1896/A

import java.util.*;
public class CF8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            boolean valid = true; // can be sorted

            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(i > 0 && a[0] > a[i]) {
                    valid = false;
                }
            }

            if(valid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}

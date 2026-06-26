// https://codeforces.com/problemset/problem/1831/A

import java.util.*;

public class CF8_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] b = a.clone();

            Arrays.sort(b);

            Map<Integer, Integer> mp = new HashMap<>();
            for(int i = 0; i < n; i++) {
                mp.put(b[i], b[n - i - 1]);
            }

            for(int i = 0; i < n; i++) {
                System.out.print(mp.get(a[i]) + " ");
            }

            System.out.println();
        }
    }
}
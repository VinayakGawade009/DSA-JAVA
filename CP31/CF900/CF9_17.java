// https://codeforces.com/problemset/problem/1665/B

import java.util.*;

public class CF9_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            Map<Integer, Integer> f = new HashMap<>();
            int maxF = 0;
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                f.put(a[i], f.getOrDefault(a[i], 0) + 1);
                if(f.get(a[i]) > maxF) {
                    maxF = f.get(a[i]);
                }
            }

            if(maxF == n) {
                System.out.println(0);
                continue;
            }

            int ans = 0;

            while(maxF < n) {
                ans += Math.min(maxF, n - maxF) + 1;
                maxF *= 2;
            }
            
            System.out.println(ans);
        }
    }
}
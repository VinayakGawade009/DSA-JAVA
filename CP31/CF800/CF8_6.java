// https://codeforces.com/problemset/problem/1890/A

import java.util.*;

public class CF8_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            Map<Integer, Integer> mp = new HashMap<>();

            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
            }

            if(mp.size() == 1) {
                System.out.println("YES");
                continue;
            }

            if(mp.size() > 2) {
                System.out.println("NO");
                continue;
            }

            int first = 0;
            int sec = 0;
            for(int v : mp.values()) {
                if(first == 0) {
                    first = v;
                } else {
                    sec = v;
                }
            }

            if(first == sec - 1 || sec == first - 1 || first == sec) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
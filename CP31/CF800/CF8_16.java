// https://codeforces.com/problemset/problem/1853/A

import java.util.*;

public class CF8_16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while(t-- > 0) {
        int n = sc.nextInt();

        boolean isSorted = true;
        long prev = 0;
        long minDiff = Long.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            long a = sc.nextInt();
            if(a < prev) {
                isSorted = false;
            }
            if(i > 0) {
                minDiff = Math.min(minDiff, a - prev);
            }
            prev = a;
        }

        if(!isSorted) {
            System.out.println(0);
            continue;
        }

        long ans = 0;
        if(minDiff % 2 == 0) {
            ans = (minDiff / 2) + 1;
        } else {
            ans = (minDiff / 2) + ((minDiff % 2) > 0 ? 1 : 0);
        }

        System.out.println(ans);
    }

    sc.close();
  }  
}

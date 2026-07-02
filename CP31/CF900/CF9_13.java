// https://codeforces.com/problemset/problem/1696/B

import java.util.*;

public class CF9_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        
        while(t-- > 0) {
            int n = sc.nextInt();
            
            boolean foundNonZero = false;
            long ans = 0;
            for(int i = 0; i < n; i++) {
                long a = sc.nextLong();

                if(a > 0) {
                    foundNonZero = true;
                }

                if(a == 0 && foundNonZero) {
                    ans++;
                    foundNonZero = false;
                }
            }

            if(foundNonZero) {
                ans++;
            }

            if(ans >= 2) {
                ans = 2;
            }

            System.out.println(ans);
        }
    }
}

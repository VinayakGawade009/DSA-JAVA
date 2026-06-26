// https://codeforces.com/problemset/problem/1834/A

import java.util.*;

public class CF8_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            int pos = 0;
            int neg = 0;

            for(int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if(a == 1) {
                    pos++;
                } else {
                    neg++;
                }
            }

            int ans = 0;

            while(neg > pos) {
                neg--;
                pos++;
                ans++;
            }

            if(neg % 2 != 0) {
                neg--;
                pos++;
                ans++;
            }

            System.out.println(ans);
        }
        sc.close();
    }
}

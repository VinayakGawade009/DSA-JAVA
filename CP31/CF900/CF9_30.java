// https://codeforces.com/problemset/problem/1373/B

import java.util.*;

public class CF9_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            String s = sc.next();

            int cnt1 = 0;
            int cnt0 = 0;

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '1') {
                    cnt1++;
                } else {
                    cnt0++;
                }
            }

            int min = Math.min(cnt0, cnt1);

            if(min % 2 != 0) {
                System.out.println("DA");
            } else {
                System.out.println("NET");
            }
            
        }
    }
}

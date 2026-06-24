// https://codeforces.com/problemset/problem/1791/C

import java.util.*;

public class CF8_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int l = 0;
            int r = n - 1;

            int addedStringLen = 0;
            while(l < r) {
                if((s.charAt(l) == '0' && s.charAt(r) == '1') || (s.charAt(l) == '1' && s.charAt(r) == '0')) {
                    addedStringLen += 2;
                } else {
                    break;
                }
                l++;
                r--;
            }

            System.out.println(n - addedStringLen);
        }
        sc.close();
    }
}
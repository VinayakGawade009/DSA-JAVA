// https://codeforces.com/problemset/problem/1881/A

import java.util.*;

public class CF8_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String x = sc.next();
            String s = sc.next();

            boolean found = false;
            for(int i = 0; i <= 5; i++) {
                if(x.contains(s)) {
                    System.out.println(i);
                    found = true;
                    break;
                }
                x += x;
            }

            if(!found) {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}
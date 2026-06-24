// https://codeforces.com/problemset/problem/1878/A

import java.util.*;

public class CF8_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            boolean found = false;
            for(int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if(a == k) {
                    found = true;
                }
            }

            if(found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
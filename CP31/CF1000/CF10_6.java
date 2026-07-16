// https://codeforces.com/problemset/problem/1840/C

import java.util.*;

public class CF10_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();

            Stack<Integer> valids = new Stack<>();
            int curr = 0;
            for(int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if(a <= q) {
                    curr++;
                } else {
                    valids.push(curr);
                    curr = 0;
                }
            }

            if(curr > 0) {
                valids.push(curr);
            }

            long ans = 0;
            while(!valids.isEmpty()) {
                int el = valids.pop();
                for(int i = k; i <= el; i++) {
                    ans += el - i + 1;
                }
            }

            System.out.println(ans);
        }
    }
}
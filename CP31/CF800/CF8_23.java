//

import java.util.*;

public class CF8_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if(b > d || Math.abs(a - b) != Math.abs(c - d)) {
                System.out.println(-1);
                continue;
            }

            int diff = d - b;
            int ans = diff + (a + diff) - c;

            System.out.println(ans);
        }

        sc.close();
    }
}

//

import java.util.*;

public class CF8_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int ans = 0;
            int i = 0;
            while(i < n) {
                int len = 0;
                while(i < n && a[i] % 2 == 0) {
                    len++;
                    i++;
                }
                if(len > 1) {
                    ans += len - 1;
                }
                
                len = 0;
                while(i < n && a[i] % 2 != 0) {
                    len++;
                    i++;
                }
                if(len > 1) {
                    ans += len - 1;
                }
            }

            System.out.println(ans);
        }
    }
}

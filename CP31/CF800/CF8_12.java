// 

import java.util.*;

public class CF8_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            long[] b = new long[n];

            boolean needExtention = false;
            for(int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
                if(i > 0 && b[i] < b[i - 1]) {
                    needExtention = true;
                }
            }

            if(!needExtention) {
                System.out.println(n);
                for(long i : b) {
                    System.out.print(i + " ");
                }
                System.out.println();
                continue;
            }

            int m = n;
            List<Long> ans = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                ans.add(b[i]);
                if(i > 0 && b[i] < b[i - 1]) {
                    ans.add(b[i]);
                    m++;
                }
            }
            
            System.out.println(m);
            for(long i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();

        }

        sc.close();
    }
}

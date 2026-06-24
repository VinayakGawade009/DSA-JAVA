//

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

            if(pos == 1 && neg == 1) {
                System.out.println(1);
                continue;
            }

            if(pos >= neg) {
                if(neg % 2 == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
                continue;
            }

            if(pos == 0 && neg == 2) {
                if(neg % 2 == 0) {
                    System.out.println(2);
                }
                continue;
            }
            
            if(pos == 0 && (neg == 3 || neg == 1)) {
                System.out.println(neg);
                continue;
            }

            int change = neg / 2;
            neg -= change;
            pos += change;
            if(neg % 2 != 0 && neg > 0) {
                change++;
            }

            System.out.println(change);
            
        }
        sc.close();
    }
}

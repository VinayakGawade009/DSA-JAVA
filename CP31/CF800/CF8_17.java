// 

import java.util.*;

public class CF8_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            int count = 0;

            boolean possible = false;
            int first = 0;
            int sec = 0;

            for(int i = k; i > 0; i--) {
                if(i != x && i == 1) {
                    possible = true;
                    first = 1;
                    break;
                }
                if(i != x && n % i != x) {
                    possible = true;
                    first = i;
                    sec = n % i;
                    break;
                }
            }

            if(!possible) {
                System.out.println("NO");
                continue;
            }

            count += n / first;
            if(sec != 0) {
                count++;
            }

            System.out.println("YES");
            System.out.println(count);
            for(int i = 0; i < n / first; i++) {
                System.out.print(first + " ");
            }
            if(sec != 0) {
                System.out.print(sec);
            }
            System.out.println();
        }
        sc.close();
    }
}
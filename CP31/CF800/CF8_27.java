//https://codeforces.com/problemset/problem/1788/A

import java.util.*;

public class CF8_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            int twos = 0;
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(a[i] == 2) {
                    twos++;
                }
            }

            if(twos % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            if(twos == 0) {
                System.out.println(1);
                continue;
            }

            int currTwos = 0;
            for(int i = 0; i < n - 1; i++) {
                if(a[i] == 2) {
                    currTwos++;
                }

                if(currTwos == twos / 2) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
        sc.close();
    }
}


// https://codeforces.com/problemset/problem/1380/A

import java.util.*;

public class CF9_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] minK = new int[n];
            minK[n - 1] = n - 1;

            for(int i = n - 2; i >= 0; i--) {
                if(a[i] < a[minK[i + 1]]) {
                    minK[i] = i;
                } else {
                    minK[i] = minK[i + 1];
                }
            }

            int minI = 0;
            int j = -1;
            for(int i = 1; i < n - 1; i++) {
                if(a[i] > a[minI] && a[i] > a[minK[i + 1]]) {
                    j = i;
                    break;
                }

                if(a[i] < a[minI]) {
                    minI = i;
                }
            }

            if(j == -1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println((minI + 1) + " " + (j + 1) + " " + (minK[j + 1] + 1));
            }
        }
    }
}

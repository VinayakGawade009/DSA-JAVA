// https://codeforces.com/problemset/problem/1831/B

import java.util.*;

public class CF10_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            for(int i = 0; i < n; i++) b[i] = sc.nextInt();

            // Freq arrays
            int[] maxA = new int[2 * n + 1];
            int[] maxB = new int[2 * n + 1];

            int curr = 1;
            for(int i = 1; i < n; i++) {
                if(a[i] == a[i - 1]) {
                    curr++;
                } else {
                    maxA[a[i - 1]] = Math.max(maxA[a[i - 1]], curr);
                    curr = 1;
                }
            }
            maxA[a[n - 1]] = Math.max(maxA[a[n - 1]], curr);
            
            curr = 1;
            for(int i = 1; i < n; i++) {
                if(b[i] == b[i - 1]) {
                    curr++;
                } else {
                    maxB[b[i - 1]] = Math.max(maxB[b[i - 1]], curr);
                    curr = 1;
                }
            }
            maxB[b[n - 1]] = Math.max(maxB[b[n - 1]], curr);
            
            int ans = 0;
            for(int i = 1; i <= 2 * n; i++) {
                ans = Math.max(ans, maxA[i] + maxB[i]);
            }

            System.out.println(ans);
        }
    }
}

// ### **CP Learnings to Reuse**

// **1. Decouple Independent States (Avoid "On-the-Fly" traps)**
// When you have two distinct sources of data (like array $a$ and array $b$), processing one while simultaneously trying to calculate the final answer using the other often leads to complex logic trees and dropped edge cases (like missing elements exclusive to one array).

// * **The Pattern:** Build the complete state for Object A. Build the complete state for Object B. Then, evaluate them together in a final, separate phase.

// **2. Flat Arrays > HashMaps (When constraints allow)**
// In Java, `HashMap` is relatively slow due to hashing overhead, object wrapping (e.g., `Integer` instead of `int`), and load factor resizing.

// * **The Pattern:** Always check the upper bound constraint of the values. If the maximum possible value in the array is relatively small (e.g., $\le 10^6$), discard `HashMap` entirely. Use a simple flat array `int[] freq = new int[MAX_VAL + 1]` where the index represents the element and the value represents the frequency. It gives you guaranteed $O(1)$ operations with zero overhead.
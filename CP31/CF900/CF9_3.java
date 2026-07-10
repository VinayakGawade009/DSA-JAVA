// https://codeforces.com/problemset/problem/1878/C

import java.util.*;

public class CF9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            // Calculate minimum possible sum of k distinct elements
            long minSum = (k * (k + 1)) / 2;

            // Calculate maximum possible sum of k distinct elements
            long totalSum = (n * (n + 1)) / 2;
            long excludeSum = ((n - k) * (n - k + 1)) / 2;
            long maxSum = totalSum - excludeSum;

            // Check if x falls within the range
            if(x >= minSum && x <= maxSum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

        sc.close();
    }
}

// ### **What to Learn & Apply in the Future**

// This problem teaches you a highly reusable CP pattern: **Range Bounding for Existence Queries**.

// Whenever a problem asks "Is it possible to form a sum $X$ using $K$ distinct elements?" or "Can you reach target $Y$ in exactly $K$ steps?":

// 1. **Do not simulate:** Stop trying to pick elements or run loops.
// 2. **Find the extremes:** Calculate the absolute minimum possible state and the absolute maximum possible state.
// 3. **Check for continuity:** Verify if every state between the min and max is achievable (usually true if step sizes are 1 or elements are consecutive).
// 4. **Use $O(1)$ checks:** Your entire algorithm just becomes checking if the target is within `[min_bound, max_bound]`.
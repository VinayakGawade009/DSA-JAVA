// https://codeforces.com/problemset/problem/1559/A

import java.util.*;

public class CF9_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            long ans = 0;
            for(int i = 0; i < n; i++) {
                long a = sc.nextLong();
                if(i == 0) {
                    ans = a;
                } else {
                    ans &= a;
                }
            }

            System.out.println(ans);
        }
    }
}


// ### **What to Learn & Apply in the Future**

// This problem highlights a classic competitive programming trap and a highly reusable pattern:

// 1. **Monotonic Operations with Infinite Moves:** Whenever a problem gives you an operation that can only *decrease* a value (like Bitwise AND, or `Math.min`) or only *increase* a value (like Bitwise OR, or `Math.max`), AND you are allowed infinite moves across overlapping intervals, the answer is almost always the global accumulation of that operation across the entire array.
// 2. **Don't Simulate Infinite Operations:** If a problem says "you can perform this operation any number of times," you rarely need to figure out the exact sequence of $[l, r]$ bounds. Instead, figure out the theoretical limit of the operation. In this case, the theoretical limit of applying AND infinitely across a sequence is simply ANDing everything together.
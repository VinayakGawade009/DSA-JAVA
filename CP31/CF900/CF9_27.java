// https://codeforces.com/problemset/problem/1471/A

import java.util.*;

public class CF9_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();

            long minBeauty = 0;
            long maxBeauty = 0;
            for(int i = 0; i < n; i++) {
                long a = sc.nextInt();
                
                minBeauty += a;

                maxBeauty += (a + x - 1) / x; // ceiling formula
            }

            minBeauty = (minBeauty + x - 1) / x;

            System.out.println(minBeauty + " " + maxBeauty);
        }
        sc.close();
    }
}

// ### **What to Learn & Apply in the Future**

// 1. **The Extremes Principle (Greedy):** When a problem allows "any number of operations" and asks for a Min/Max, the answer is almost always the two absolute extremes: performing the operation $0$ times, or performing the operation $N-1$ times (until you can't anymore).
// 2. **Integer Math over Floating Point:** Memorize `(A + B - 1) / B` for calculating $\lceil A/B \rceil$. It keeps your variables in `long` format, avoiding any weird IEEE 754 floating-point inaccuracies that happen when converting huge integers to `double` and back.
// 3. **Operation Properties:** Before writing any code, apply the operation to just two numbers on paper. Ask yourself: "Does this operation strictly increase, strictly decrease, or scramble the result?" Finding that monotonicity is the key to $O(N)$ solutions.

// If the operation in this problem was $A \oplus B$ (Bitwise XOR) instead of addition, how do you think that would change your approach to finding the maximum and minimum values?
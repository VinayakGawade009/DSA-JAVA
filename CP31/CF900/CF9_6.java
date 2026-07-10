// https://codeforces.com/problemset/problem/1855/B

import java.util.*;

public class CF9_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            long n = sc.nextLong();

            int i = 1;
            
            while(n % i == 0) {
                i++;
            }

            System.out.println(i - 1);
        }
    }
}

// ### **Wait, won't this cause a TLE if $n$ is huge?**

// No, this is effectively an $O(1)$ time complexity solution!

// Think about how fast the Least Common Multiple (LCM) grows. For $n$ to be divisible by the first $40$ numbers, $n$ would have to be at least the LCM of $1, 2, 3, \dots, 40$.
// The LCM of the first $42$ integers is greater than $10^{18}$. Since the maximum possible input for $n$ is $10^{18}$, your `while` loop will **never** run more than 42 times per test case.

// ---

// ### **What to Learn & Apply in the Future**

// This problem highlights a highly reusable pattern in competitive programming:

// **The Pigeonhole/Divisibility Property of Consecutive Integers:** Whenever a problem involves an interval of length $K$, or $K$ consecutive elements, always remember that this subset guarantees the presence of multiples of $1, 2, \dots, K$. If a problem requires a condition to hold for an entire interval, you can often simplify the bounds of the problem to just checking the prefix $1$ to $K$.
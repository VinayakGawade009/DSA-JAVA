// https://codeforces.com/problemset/problem/1765/M

import java.util.*;

public class CF10_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            int a = 1; // Default if n is prime

            // Find the smallest prime factor of n
            for(int i = 2; i * i <= n; i++) {
                if(n % i == 0) {
                    a = n / i; // n / smallest factor = largest divisor
                    break;
                }
            }

            int b = n - a;

            System.out.println(a + " " + b);
        }
        sc.close();
    }
}


// ### **The Math Solution (Number Theory)**

// To solve this efficiently, we have to look at the mathematical relationship between LCM and GCD.

// We know two things:

// 1. $a + b = n$, which means $b = n - a$.
// 2. The fundamental property of GCD: $GCD(a, b) = GCD(a, a+b)$. Therefore, $GCD(a, n-a) = GCD(a, n)$.

// We want to minimize $LCM(a, n-a)$.
// The formula for LCM is:


// $$LCM(a, b) = \frac{a \times b}{GCD(a, b)}$$

// To make the LCM as small as possible, we need to make the denominator—the $GCD(a, n)$—as **large** as possible.

// * To make $GCD(a, n)$ as large as possible, $a$ must be the **largest proper divisor** of $n$.
// * How do you find the largest proper divisor of a number? You divide it by its **smallest prime factor**.

// **The Strategy:**

// 1. Find the smallest prime factor of $n$ (let's call it $p$) by looping up to $\sqrt{n}$.
// 2. The largest divisor is $a = n / p$.
// 3. The other number is just $b = n - a$.
// 4. If $n$ is prime, it has no smaller prime factors, so its largest proper divisor is just $1$. In that case, $a = 1$ and $b = n - 1$.







// ### **CP Learnings to Reuse**

// **1. The $10^8$ Constraint Rule**
// Never write an $O(N)$ loop without looking at the constraints first. If a problem states $N \le 10^9$, it is the author's way of explicitly screaming at you: *"A linear loop will fail here!"*

// * **The Pattern:** If $N \le 10^9$, the intended solution is almost always $O(\log N)$ (Binary Search), $O(\sqrt{N})$ (Prime factorization / Divisors), or $O(1)$ (Math formula).

// **2. The $GCD(a, b) = GCD(a, a+b)$ Property**
// This is one of the most frequently tested number theory properties in competitive programming. Whenever a problem asks you to minimize/maximize an LCM or GCD of two numbers that sum up to a constant ($a + b = N$), immediately substitute $b$ with $N-a$.

// * **The Pattern:** You can't easily optimize $GCD(a, b)$ because both variables change. By applying the property, it becomes $GCD(a, N)$. Now $N$ is a constant, and you only have to find the best divisor $a$ for a fixed number, which reduces the problem to basic prime factorization.
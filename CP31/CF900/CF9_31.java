// https://codeforces.com/problemset/problem/1374/B

import java.util.*;

public class CF9_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            long n = sc.nextLong();

            int cnt2 = 0;
            int cnt3 = 0;

            while(n % 2 == 0) {
                cnt2++;
                n /= 2;
            }

            while(n % 3 == 0) {
                cnt3++;
                n /= 3;
            }

            if(n == 1 && cnt2 <= cnt3) {
                System.out.println(2 * cnt3 - cnt2);
            } else {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}



// Prime Factorization as a State: Whenever a problem involves multiplying, dividing, or checking divisibility by constants, immediately translate the problem from standard arithmetic into a system of equations based on prime exponents.

// Identify Invariants and Monotonicity: Look for things that cannot change, or can only move in one direction. In this problem, the fact that you could never add 3s was the strict constraint that dictated the entire solution. Finding the "bottleneck" operation is a standard way to solve optimization and "is it possible?" queries.








// The Core LogicOur target is to reach $1$, which can be written as $2^0 \times 3^0$.Let's analyze how our two allowed operations affect the prime factors of any number $n$:Multiply by 2: Adds a power of 2 ($2^{+1}$).Divide by 6: Removes one power of 2 and one power of 3 ($2^{-1}, 3^{-1}$).Assume our initial number is represented as $n = 2^a \times 3^b \times k$ (where $k$ is any number not divisible by 2 or 3).Condition 1: The Impossible RemainderCan we ever eliminate $k$? No. Our operations only add 2s or remove 2s and 3s. They cannot touch any other prime factor (like 5, 7, 11, etc.).Conclusion: If $k > 1$ (meaning $n$ has prime factors other than 2 or 3), it is impossible to reach 1. The answer is -1.Condition 2: The BottleneckNotice that the power of 3 ($b$) can only decrease (via dividing by 6). It can never increase because we don't have a "multiply by 3" operation.This means we must perform the "divide by 6" operation exactly $b$ times to get the 3s down to $3^0$.However, every time you divide by 6, you also consume a 2. If you start with more 2s than 3s ($a > b$), you will run out of 3s before you can clear out all the 2s, leaving you stuck with leftover 2s that you can't get rid of.Conclusion: If $a > b$, it is impossible. The answer is -1.Calculating the MovesIf $n = 2^a \times 3^b$ and $a \le b$, we can solve it:We need exactly $b$ divisions by 6. This will require $b$ factors of 2.We currently have $a$ factors of 2. We are short by $(b - a)$ factors of 2.We must perform the "multiply by 2" operation exactly $(b - a)$ times to generate enough 2s.Total moves = (moves to multiply by 2) + (moves to divide by 6) = $(b - a) + b = 2b - a$.
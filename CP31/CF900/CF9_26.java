// https://codeforces.com/problemset/problem/1475/A

import java.util.*;

public class CF9_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            long n = sc.nextLong();

            // What are the exact properties of a number that has zero odd divisors?
            // The prime numbers are $2, 3, 5, 7, 11, \dots$Notice anything? 2 is the only even prime number.

            if((n & (n - 1)) == 0) {
                System.out.println("NO"); // It's a power of 2, so no odd divisors.
            } else {
                System.out.println("YES");
            }
        }
    }
}

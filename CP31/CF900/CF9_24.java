// https://codeforces.com/problemset/problem/1543/A

import java.util.*;

public class CF9_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while(t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if(a == b) {
                System.out.println(0 + " " + 0);
                continue;
            }

            long gcd = (long)Math.abs(b - a);

            long op1 = a % gcd;
            long op2 = gcd - op1;

            System.out.println(gcd + " " + Math.min(op1, op2));

        }
    }
}
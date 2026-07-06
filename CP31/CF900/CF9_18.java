// https://codeforces.com/problemset/problem/1624/B

import java.util.*;

public class CF9_18 {

    // AP -> Arithmetic Progression
    // y - x = z - y
    // 2y = x + z
    // can find new values of x, y and z if they satisfie the divisibility and multiplicity conditions
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            boolean ans = false;

            long newA = 2 * b - c; // potential new 'a'
            if(newA / a > 0 && newA % a == 0) { // check if newA is positive multiple of 'a'
                ans = true;
            }

            long newB = (a + c) / 2; // potential new 'b'
            if(newB / b > 0 && newB % b == 0 && (c - a) % 2 == 0) { // check if newB is positive multiple of 'b' and (c - a) is even
                ans = true;
            }

            long newC = 2 * b - a; // potential new 'c'
            if(newC / c > 0 && newC % c == 0) { // check if newC is a positive multiple of 'c'
                ans = true;
            }

            if(ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

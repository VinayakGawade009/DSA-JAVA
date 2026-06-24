// https://codeforces.com/problemset/problem/1858/A

import java.util.*;

public class CF8_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            int winner = 1;

            if(c % 2 == 1) {
                winner = 2;
            }

            if(winner == 1) {
                if(a <= b) {
                    winner = 2;
                }
            } else {
                if(b <= a) {
                    winner = 1;
                }
            }

            System.out.println(winner == 1 ? "First" : "Second");
        }
        sc.close();
    }
}
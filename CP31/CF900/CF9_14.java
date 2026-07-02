// https://codeforces.com/problemset/problem/1679/A

import java.util.*;

public class CF9_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            long n = sc.nextLong();

            if(n % 2 != 0 || n < 4) {
                System.out.println(-1);
                continue;
            }

            long four = n / 4;
            long six = n / 6;
            if(n % 6 != 0) { // n % 6 - 0 / 2 / 4
                six++; // if 4 then + 1 bus, If 2 then + 2 4 wheel bus - 1 6 wheel bus -> + 1 4 wheel bus
            }

            System.out.println(six + " " + four);
        }
    }    
}

// https://codeforces.com/problemset/problem/1899/A

import java.util.*;

public class CF8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            if(n % 3 == 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        }

        sc.close();
    }
}

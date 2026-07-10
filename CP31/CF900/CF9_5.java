// https://codeforces.com/problemset/problem/1869/A

import java.util.*;

public class CF9_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            if(n % 2 == 0) {
                System.out.println(2);
                System.out.println(1 + " " + n);
                System.out.println(1 + " " + n);
            } 
            else {
                System.out.println(4);
                System.out.println(1 + " " + (n - 1));
                System.out.println(1 + " " + (n - 1));
                System.out.println((n - 1) + " " + n);
                System.out.println((n - 1) + " " + n);
            }
        }
        sc.close();
    }    
}

// ### **What to Learn & Apply in the Future**

// This problem belongs to a category called **Constructive Algorithms**.

// 1. **Parity is King:** Whenever a problem involves bitwise XOR, or alternating turns, or canceling things out, immediately check if the length being Even or Odd changes the behavior.
// 2. **Read the Constraints for Hints:** If a problem says "you do not need to minimize the steps" and gives you a seemingly random upper bound (like 8), stop trying to calculate the perfect path. Look for a "dumb but guaranteed" sequence of moves that you can apply blindly to every single test case.

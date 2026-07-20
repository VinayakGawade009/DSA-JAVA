// https://codeforces.com/problemset/problem/1744/C

import java.util.*;

public class CF10_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            String c = sc.next();

            String s = sc.next();

            s = s + s;

            int max = 0;
            int curr = 0;
            for(int i = 0; i < 2 * n; i++) {
                if(s.charAt(i) == 'g') {
                    max = Math.max(max, curr);
                    curr = 0;
                }
                else if(curr == 0 && s.charAt(i) == c.charAt(0)) {
                    curr++;
                } 
                else if(curr > 0) {
                    curr++;
                    max = Math.max(max, curr);
                }
            }

            System.out.println(max);

        }
    }
}

// ### **The CP Learnings to Reuse**

// **1. "Guaranteed" = Worst Case (Max of Mins)**
// In competitive programming, when a problem says "you don't know your exact position, but you are guaranteed X," it means you need to calculate the answer for *every possible valid starting position* and find the **maximum** of those answers. You are solving for the worst-case scenario.

// **2. The Circular Array Unroll**
// Whenever a problem involves a sequence that loops back on itself (circular arrays, repeating strings, cyclic shifts), do not write complex modulo math to wrap your indices around the back. **Just allocate an array of size $2N$ and copy the elements twice.** This flattens the circle into a straight line, allowing you to use standard left-to-right logic.

// Does the string doubling trick make sense, or would you like to brainstorm how to set up the `for` loop to track the distances?
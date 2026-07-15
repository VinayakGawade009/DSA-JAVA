// https://codeforces.com/problemset/problem/1849/B

import java.util.*;

public class CF10_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[][] arr = new int[n][2];
            for(int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int rem = a % k;

                // 1. The Modulo Shift (Fix the math first!)
                if (rem == 0) {
                    rem = k;
                }

                arr[i][0] = rem;
                arr[i][1] = i + 1;
            }

            Arrays.sort(arr, (x, y) -> {
                if(x[0] != y[0]) {
                    // Descending by remainder (Highest health gets hit first)
                    return Integer.compare(y[0], x[0]); 
                }
                // Ascending by index (Smaller index gets hit first on ties)
                return Integer.compare(x[1], y[1]); 
            });

            for(int i = 0; i < n; i++) {
                System.out.print(arr[i][1] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// ### **CP Learnings to Reuse**

// **1. The 1-Indexed Modulo Shift (Cycle Mapping)**
// Whenever a problem involves a cyclical process (like taking turns, dealing fixed damage, dealing cards in a circle) and you need to figure out what happens on the *last* step of a cycle, standard `a % k` maps the last step to `0`.

// * **The Pattern:** Whenever `0` breaks your logical sequencing, manually map it back to the max value of the cycle: `if (val % k == 0) val = k;`. This aligns the math with the physical reality of the problem, allowing standard sorting to work perfectly.

// **2. Never "Fix" a Sort with a Reverse Loop**
// If you have a multi-condition sort (e.g., sort by remainder, *then* by index), never try to reverse the output array during the printing phase to fix one of the conditions. Reversing the output reverses *all* conditions, destroying your tie-breakers.

// * **The Pattern:** Put 100% of your ordering logic inside the `Comparator`. The printing loop should almost always just be a simple `for(int i = 0; i < n; i++)`. If your comparator logic is clean, the output will naturally be correct.
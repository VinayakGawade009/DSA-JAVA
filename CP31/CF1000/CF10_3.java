// https://codeforces.com/problemset/problem/1876/A

import java.util.*;

public class CF10_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            
            int[][] residents = new int[n][2];
            for(int i = 0; i < n; i++) {
                residents[i][0] = sc.nextInt();
            }
            for(int i = 0; i < n; i++) {
                residents[i][1] = sc.nextInt();
            }

            Arrays.sort(residents, (x, y) -> {
                if(x[1] != y[1]) {
                    return Integer.compare(x[1], y[1]);
                }
                return Integer.compare(y[0], x[0]);
            });

            // Greedy Logic
            long totalCost = p; // must notify at leat 1 person at the start
            int remainingPeople = n - 1;

            for(int i = 0; i < n && remainingPeople > 0; i++) {
                int capacity = residents[i][0];
                int cost = residents[i][1];

                // The Global Ceiling
                if(cost >= p) {
                    break;
                }

                // Take as many shares as we need, up to the resident's maximum
                int sharesToTake = Math.min(capacity, remainingPeople);
                totalCost += (long) sharesToTake * cost;
                remainingPeople -= sharesToTake;
            }

            // Fallback: If we ran out of cheap residents, Pak Chanek handles the rest
            if(remainingPeople > 0) {
                totalCost += (long) remainingPeople * p;
            }

            System.out.println(totalCost);
        }

        sc.close();
    }
}

// ### **The CP Learnings to Reuse**

// This problem highlights two highly reusable patterns for your CP toolkit:

// * **Attribute Binding (Zipping):** Never attempt to swap elements across two separate primitive arrays simultaneously to keep them aligned. Always map them into a 2D array (or a custom object class) and sort the unified structure. This prevents desynchronization bugs.
// * **The Global Ceiling (Greedy Cutoff):** When a problem gives you a generic "direct" operation with a fixed cost (like Pak Chanek's $p$) alongside variable operations (the residents), treat the fixed cost as your absolute ceiling. You greedily consume the variable options *only* as long as they are strictly cheaper than the global ceiling. Once the variable cost hits or exceeds the ceiling, you default entirely to the global operation.

// https://codeforces.com/problemset/problem/1904/A

import java.util.*;

public class CF9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xk = sc.nextInt();
            int yk = sc.nextInt();
            int xq = sc.nextInt();
            int yq = sc.nextInt();

            Set<String> setK = new HashSet<>();
            setK.add((xk + a) + "," + (yk + b));
            setK.add((xk + a) + "," + (yk - b));
            setK.add((xk - a) + "," + (yk + b));
            setK.add((xk - a) + "," + (yk - b));
            setK.add((xk + b) + "," + (yk + a));
            setK.add((xk + b) + "," + (yk - a));
            setK.add((xk - b) + "," + (yk + a));
            setK.add((xk - b) + "," + (yk - a));
            
            Set<String> setQ = new HashSet<>();
            setQ.add((xq + a) + "," + (yq + b));
            setQ.add((xq + a) + "," + (yq - b));
            setQ.add((xq - a) + "," + (yq + b));
            setQ.add((xq - a) + "," + (yq - b));
            setQ.add((xq + b) + "," + (yq + a));
            setQ.add((xq + b) + "," + (yq - a));
            setQ.add((xq - b) + "," + (yq + a));
            setQ.add((xq - b) + "," + (yq - a));

            int ans = 0;
            for(String i : setK) {
                if(setQ.contains(i)) {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}

// This problem teaches you two highly relevant CP patterns:

// Reverse Thinking (Meet-in-the-Middle concept): Whenever a problem asks "find a starting point that reaches A and B," stop trying to search from the unknown starting point. Search outwards from A, search outwards from B, and find where they intersect. This drastically reduces the time complexity from infinite down to O(1) operations per test case.

// Using Sets for Geometry/Grids: When dealing with grid movements, rotations, or reflections where overlapping might occur (like a == b), do not waste time writing manual deduplication logic. Calculate everything blindly and let a HashSet filter out the duplicates for you. It saves time and prevents silly edge-case bugs during a contest.
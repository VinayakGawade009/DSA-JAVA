// https://codeforces.com/problemset/problem/1537/B

import java.util.*;

public class CF9_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long i = sc.nextLong();
            long j = sc.nextLong();

            System.out.println(1 + " " + 1 + " " + n + " " + m);
        }

        sc.close();
    }
}

// ### **What to Learn & Apply in the Future**

// This problem teaches you a highly reusable CP pattern:

// 1. **The Bounding Box / Extreme Points Trick:** Whenever you are asked to maximize a distance, area, or path on a grid or a 2D plane, start by testing the absolute boundaries (the edges and the corners). Maximums in geometry almost always lie on the extreme vertices of the available space, not somewhere in the middle.
// 2. **Identify Distraction Variables:** CP problem setters will frequently give you variables you don't need to use just to bait you into writing a simulation or a complex formula. If you find a global maximum that works perfectly, completely ignore the local starting conditions.
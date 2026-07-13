// https://codeforces.com/problemset/problem/1913/B

import java.util.*;

public class CF10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            String s = sc.next();

            int n = s.length();

            int zeroCnt = 0;
            int oneCnt = 0;

            for(int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if(ch == '0') {
                    zeroCnt++;
                } else {
                    oneCnt++;
                }
            }

            int ans = 0;
            int i = 0;
            while(i < n) {
                char ch = s.charAt(i);
                if(ch == '0') {
                    if(oneCnt > 0) {
                        oneCnt--;
                    } else {
                        break;
                    }
                } else {
                    if(zeroCnt > 0) {
                        zeroCnt--;
                    } else {
                        break;
                    }
                }
                i++;
            }

            System.out.println(n - i);
        }
    }
}

// ### **The CP Learnings (What to apply in the future)**

// This problem was hand-picked for the sheet because it teaches a very specific, highly re-usable CP trope. Write these down:

// 1. **"Free Unlimited Swaps" = Frequency Counting:** Whenever a problem says you can swap *any* adjacent elements or *any* pair of elements an infinite number of times for free, **stop thinking about the string as a sequence.** Treat it as a hash map or an array of frequencies. The physical arrangement no longer restricts you; only the quantities do.
// 2. **Greedy Prefix Matching:**
// When you have a flexible supply (your bucket of characters) and a fixed demand (the original string $s$ you must be the opposite of), you always fulfill the demand greedily from left to right.
// 3. **Find the Bottleneck and Break:**
// In competitive programming, you often don't need to simulate the entire failure. The moment a strict condition fails (running out of the required opposite character), calculate the penalty ($n - i$) and instantly `break`.

// https://codeforces.com/problemset/problem/1607/B

import java.util.*;

public class CF9_19 {

//     Dry Run ($x_0 = 0$)

// * **Start:** $0$ (even)
// * **1st jump ($d=1$):** $0 - 1 = -1$ (odd)
// * **2nd jump ($d=2$):** $-1 + 2 = 1$ (odd)
// * **3rd jump ($d=3$):** $1 + 3 = 4$ (even)
// * **4th jump ($d=4$):** $4 - 4 = \mathbf{0}$ (even)
// * **5th jump ($d=5$):** $0 - 5 = -5$ (odd)
// * **6th jump ($d=6$):** $-5 + 6 = 1$ (odd)
// * **7th jump ($d=7$):** $1 + 7 = 8$ (even)
// * **8th jump ($d=8$):** $8 - 8 = \mathbf{0}$ (even)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            long x = sc.nextLong();
            long n = sc.nextLong();

            if(n % 4 == 0) {
                System.out.println(x);
                continue;
            }

            if(x % 2 == 0) {
                if(n % 4 == 1) {
                    x -= n;
                    System.out.println(x);
                }
                else if(n % 4 == 2) {
                    x += 1;
                    System.out.println(x);
                }
                else {
                    x += n + 1;
                    System.out.println(x);
                }
                
            }
            else {
                if(n % 4 == 1) {
                    x += n;
                    System.out.println(x);
                }
                else if(n % 4 == 2) {
                    x -= 1;
                    System.out.println(x);
                }
                else {
                    x -= n + 1;
                    System.out.println(x);
                }

            }
        }
        sc.close();;
    }
}

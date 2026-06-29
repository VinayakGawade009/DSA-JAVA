// https://codeforces.com/problemset/problem/1837/B

import java.util.*;

public class CF9_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int maxAdjLTLen = 1;
            int maxAdjGTLen = 1;

            int i = 0;
            while(i < n - 1) {
                int LT = 1;
                while(i < n - 1 && s.charAt(i) == '<' && s.charAt(i + 1) == '<') {
                    i++;
                    LT++;
                }
                maxAdjLTLen = Math.max(maxAdjLTLen, LT);
                
                int GT = 1;
                while(i < n - 1 && s.charAt(i) == '>' && s.charAt(i + 1) == '>') {
                    i++;
                    GT++;
                }
                maxAdjGTLen = Math.max(maxAdjGTLen, GT);

                i++;
            }
    
            System.out.println(Math.max(maxAdjGTLen, maxAdjLTLen) + 1);
        }
    }
}

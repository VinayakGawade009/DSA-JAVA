// https://codeforces.com/problemset/problem/1829/B

import java.util.*;
 
public class CF8_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt();
            
            int ans = 0; // length of lagest blank space
            
            int prev = 1;
            int len = 0;
            for(int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if(a == 0) {
                    if(prev == 1) {
                        len = 1;
                    } else {
                        len++;   
                    }
                } else {
                    len = 0;
                }
                prev = a;
                ans = Math.max(ans, len);
            }
            
            System.out.println(ans);
        }

        sc.close();
    }
}
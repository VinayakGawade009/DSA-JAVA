// https://codeforces.com/problemset/problem/1900/A

import java.util.*;

public class CF8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            String s = sc.next();
            int emp = 0;
            int cnt = 1; // to check adjacent 3 empty cell
            char prev = '#';
            boolean flag = false;

            for(int i = 0; i < n; i++) {
                char a = s.charAt(i);
                if(a == '.') {
                    emp++;
                    if(prev == '.') {
                        cnt++;
                    } else {
                        cnt = 1;
                    }
                    if(cnt == 3) {
                        flag = true;
                        break;
                    }
                }
                prev = a;
            }

            if(flag) {
                System.out.println(2);
            } else {
                System.out.println(emp);
            }
        }

        sc.close();
    }
}
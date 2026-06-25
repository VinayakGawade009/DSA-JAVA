// https://codeforces.com/problemset/problem/1873/C

import java.util.*;

public class CF8_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            
            int totalScore = 0;
            for(int i = 0; i < 10; i++) {
                String s = sc.next();
                for(int j = 0; j < 10; j++) {
                    if(s.charAt(j) == 'X') {
                        int minEdgeDist = Math.min(Math.min(i, j), Math.min(9 - i, 9 - j));
                        totalScore += minEdgeDist + 1;
                    }
                }
            }

            System.out.println(totalScore);
        }

        sc.close();
    }    
}

// https://codeforces.com/problemset/problem/1883/B

import java.util.*;

public class CF9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            String s = sc.next();

            if(n == 1) {
                System.out.println("Yes");
                continue;
            }

            Map<Character, Integer> mp = new HashMap<>();

            for(char ch : s.toCharArray()) {
                mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            }

            int odd = 0;

            for(char key : mp.keySet()) {
                if(mp.get(key) % 2 != 0) {
                    odd++;
                }
            }

            if(k < odd && odd - k != 1) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
        }

        sc.close();
    }
}

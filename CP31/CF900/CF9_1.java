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
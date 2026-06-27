// https://codeforces.com/problemset/problem/1783/A

import java.util.*;

public class CF8_28 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        int t = sc.nextInt();
    
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
    
            boolean allSame = true;
            
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(i > 0 && a[i] != a[i - 1]) {
                    allSame = false;
                }
            }

            if(allSame) {
                System.out.println("NO");
                continue;
            }
    
            Arrays.sort(a);
    
            if(a[n - 1] == a[0]) {
                System.out.println("NO");
                
            } else {

                System.out.println("YES");
    
                System.out.print(a[n - 1] + " ");
                for(int i = 0; i < n - 1; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

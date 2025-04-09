//https://www.geeksforgeeks.org/problems/find-xor-of-numbers-from-l-to-r/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-xor-of-numbers-from-l-to-r

// TC: O(1) SC: O(1)
class Solution {
    public static int findXOR(int l, int r) {
        int result = XOR1ToN(l-1) ^ XOR1ToN(r);
        return result;
    }
    
    public static int XOR1ToN(int N) {
        if(N % 4 == 1) return 1;
        if(N % 4 == 2) return N+1;
        if(N % 4 == 3) return 0;
        return N; // N % 4 == 0
    }
}

// 1  = 1
// 1 ^ 2 = 3
// 1 ^ 2 ^ 3 = 0
// 1 ^ 2 ^ 3 ^ 4 = 4
// 1 ^ 2 ^ 3 ^ 4 ^ 5 = 1
// 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 = 7
// 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 = 0
// 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 ^ 8 = 8
// 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6 ^ 7 ^ 8 ^ 9 = 1


// Observation:
// N % 4 == 1 -> XOR(1TON) = 1
// N % 4 == 2 -> XOR(1TON) = N+1
// N % 4 == 3 -> XOR(1TON) = 0
// N % 4 == 0 -> XOR(1TON) = N

// For XOR(LToR) = XOR(1To(L-1)) ^ XOR(1ToR)
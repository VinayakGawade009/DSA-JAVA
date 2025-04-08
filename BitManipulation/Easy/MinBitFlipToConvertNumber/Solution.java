//https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/

// TC: O(logn)

class Solution {
    public int minBitFlips(int start, int goal) {
        int n = start ^ goal;

        int count = 0;

        while(n > 0) {
            if((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }

        return count;
    }
}


// class Solution {
//     public int minBitFlips(int start, int goal) {
//         int n = start ^ goal;
//         int count = 0;

//         while (n > 0) {
//             n &= (n - 1); // Clears the lowest set bit
//             count++;
//         }

//         return count;
//     }

// }


// Ex.
// start = 10   // 1010
// goal  = 7    // 0111

// start ^ goal = 1101
//              = 3 differing bits → answer = 3
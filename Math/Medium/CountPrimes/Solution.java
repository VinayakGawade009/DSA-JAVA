//https://leetcode.com/problems/count-primes/description/

// TC: O(n log log n)
// SC: O(n)
class Solution {
    public int countPrimes(int n) {
        int prime[] = new int[n];
        for(int i = 2; i < n; i++) {
            prime[i] = 1;
        }

        int ans = 0;
        int sqroot = (int) Math.sqrt(n);
        
        for(int i = 2; i < n; i++) {
            // System.out.print(prime[i]);

            if(prime[i] == 1) {
                ans++;
                for(long j = (long)i*i; j < n; j += i) {
                    prime[(int)j] = 0;
                }
            }

        }

        return ans;
    }
}

//  Sieve of Eratosthenes — Short Explanation
// The Sieve is an efficient way to find all prime numbers less than a given number n.

// Steps:
// 1. Assume all numbers from 2 to n-1 are prime (initialize to 1).

// 2. Start with the first prime number 2.

// 3. Eliminate all multiples of 2, starting from 2 * 2, 2 * 3, 2 * 4, etc.

// 4. Move to the next unmarked number (3), and mark all its multiples.

// 5. Repeat this process up to √n.

// The unmarked numbers left are primes.
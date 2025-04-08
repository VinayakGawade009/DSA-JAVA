class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean sign = (dividend >= 0) == (divisor >= 0);

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        int ans = 0;

        while (n >= d) {
            int count = 0;

            // d << count ≡ d * 2^count  
            // ex.  
            // 3 * 2^3 → 3 * 8 → 24
            // 3 << 3 → 3 * 8 → 24
            while (n >= (d << (count + 1))) {
                count++;
            }

            // Add the corresponding power of two to answer
            ans += 1 << count;

            // Subtract the found chunk from the dividend
            n -= d << count;
        }

        // Apply sign to result
        return sign ? ans : -ans;
    }
}

// ex.
// 2^3 + 2^2 + 2^1 = 8 + 4 + 2 = 14, so 43 / 3 = 14
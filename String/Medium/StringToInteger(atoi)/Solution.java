// https://leetcode.com/problems/string-to-integer-atoi/

class Solution {
    public int myAtoi(String s) {
        int i = 0, sign = 1, result = 0;
        int n = s.length();

        // Step 1: Ignore leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Check sign
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits to integer while checking for overflow
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for integer overflow before adding the digit
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}


// Examples

// 1	"42"	->  42	Basic valid number
// 2	" -42"	->  -42	Leading spaces and negative sign
// 3	"4193 with words"	->  4193	Stops at first non-digit
// 4	"words and 987"	->  0	No valid number at the start
// 5	"00000000000123"	->  123	Ignore leading zeros
// 6	"-2147483649"	->  -2147483648	Clamped to Integer.MIN_VALUE
// 7	"2147483648"	->  2147483647	Clamped to Integer.MAX_VALUE
// 8	"-00000123"	->  -123	Negative number with leading zeros
// 9	" +"	->  0	Only + is invalid
// 10	"--42"	->  0	Invalid format (double -)
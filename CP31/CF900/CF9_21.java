// https://codeforces.com/problemset/problem/1593/B

import java.util.*;

public class CF9_21 {

    // Function to calculate the minimum number of oprations needed
    // to make the number divisible by a given possible_value
    private static int minOperations(String n, String possibleValue) {
        int operations = 0; // Initialize the operations counter
        int checkerIndex = possibleValue.length() - 1; // start from the last character of possibleValue

        // Traverse the number from the end to the beginning
        for(int i = n.length() - 1; i >= 0; i--) {
            // Check if the current digit marches the current character in possibleValue
            if(n.charAt(i) == possibleValue.charAt(checkerIndex)) {
                checkerIndex--; // Move to the next characterin possibleValue

                // If all characters in possibleValue are matched, break the loop
                if(checkerIndex < 0) {
                    break;
                }
            } else {
                operations++; // Increment operations if current digit doesn't match
            }
        }

        // If not all characters in possibleValue are matched, set operations to Integer.MAX_VALUE
        if(checkerIndex >= 0) {
            operations = Integer.MAX_VALUE;
        }

        return operations;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        while(t-- > 0) {
            String n = sc.next();

            // Possible endings for a number to be divisible by 25
            List<String> possibleValues = Arrays.asList("00", "25", "50", "75");

            int ans = Integer.MAX_VALUE; // Initialize the answer with a large value

            // Check for each possible ending
            for(String possibleValue : possibleValues) {
                ans = Math.min(ans, minOperations(n, possibleValue)); // Find the minimum operations
            }

            System.out.println(ans);
        }

        sc.close();
    }
}

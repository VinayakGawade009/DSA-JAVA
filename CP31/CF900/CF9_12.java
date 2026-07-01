// 

import java.util.*;

public class CF9_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Read the number of test cases
		while (t-- > 0) {
			long n = scanner.nextLong(); // Read the size of the array for each test case
			long[] v = new long[(int) n];
			for (int i = 0; i < n; i++) {
				v[i] = scanner.nextLong(); // Read the array elements
			}

			// Initialize the answer with the difference between the last and first element
			long answer = v[(int) n - 1] - v[0];

			// Check the maximum difference between any element and the first element
			for (int i = 1; i < n; i++) {
				answer = Math.max(answer, v[i] - v[0]);
			}

			// Check the maximum difference between the last element and any other element
			for (int i = 0; i < n - 1; i++) {
				answer = Math.max(answer, v[(int) n - 1] - v[i]);
			}

			// Check the maximum difference between consecutive elements
			for (int i = 0; i < n - 1; i++) {
				answer = Math.max(answer, v[i] - v[i + 1]);
			}

			// Output the maximum difference found
			System.out.println(answer);
		}
		scanner.close();

    }
}

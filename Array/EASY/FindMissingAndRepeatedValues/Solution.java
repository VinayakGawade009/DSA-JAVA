import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        long totalNumbers = (long) n * n; // Total elements in the grid
        
        //expected sum and sum of squares
        long expectedSum = (totalNumbers * (totalNumbers + 1)) / 2;
        long expectedSumOfSquares = (totalNumbers * (totalNumbers + 1) * (2 * totalNumbers + 1)) / 6;
        
        //actual sum and sum of squares from the grid
        long actualSum = 0, actualSumOfSquares = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                actualSum += grid[i][j];
                actualSumOfSquares += (long) grid[i][j] * grid[i][j];
            }
        }
        
        long diffSum = actualSum - expectedSum; // val1 = x - y
        long diffSumOfSquares = actualSumOfSquares - expectedSumOfSquares; // val2 = x^2 - y^2
        
        // Compute x (repeated value) and y (missing value)
        long sum = diffSumOfSquares / diffSum; // x + y
        long repeated = (diffSum + sum) / 2; // x
        long missing = repeated - diffSum; // y
        
        return new int[] {(int) repeated, (int) missing};
    }
}
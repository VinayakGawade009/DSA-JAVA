class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int i = 0;
        while(n>1) {
            rotateBoundry(matrix, n, i);
            n -= 2;
            i++;
        }
    }

    public void rotateBoundry(int[][] matrix, int n, int i) {

        int last = n + i - 1;

        for(int j=0; j<n-1; j++) {
            int temp = matrix[i][i+j];

            matrix[i][i+j] = matrix[last-j][i];
            matrix[last-j][i] = matrix[last][last-j];
            matrix[last][last-j] = matrix[i+j][last];
            matrix[i+j][last] = temp;
        }
    }
}
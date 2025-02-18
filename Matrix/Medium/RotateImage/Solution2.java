class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Find transpose 
       for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
       }

        // Reverse each array
        for(int i=0; i<n; i++) {
            reverseArray(matrix[i]);
        }

    }
    public void reverseArray(int[] mat) {
        int start = 0; 
        int end = mat.length-1;
        while(start<end) {
            int temp = mat[start];
            mat[start] = mat[end];
            mat[end] = temp;
            start++;
            end--;
        }
    }
}
class Solution {
    public void setZeroes(int[][] matrix) { // tc: (2* n*m)  sc: 3 vars
        int m = matrix.length;
        int n = matrix[0].length;

        // int rowArr[] = new int[m]; => matrix[i][0]
        // int colArr[] = new int[n]; => matrix[0][j]

        int col0 = 1;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;

                    if(j == 0) {
                        col0 = 0;
                    } else {
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        for(int i = m-1; i>0; i--) {
            for(int j = n-1; j>0; j--) {
                if(matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0) {
            for(int j=1; j<n; j++) {
                matrix[0][j] = 0;
            }
        }

        if(col0 == 0) {
            for(int i=0; i<m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
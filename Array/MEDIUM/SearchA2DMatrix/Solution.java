class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        for(int i=1; i<matrix.length; i++) {
            if(matrix[i-1][0] <= target && matrix[i][0] > target) {
                row = i-1;
                break;
            } else if(matrix[i][0] <= target && target <= matrix[i][matrix[0].length-1]) {
                row = i;
                break;
            }
        }
        for(int j=0; j<matrix[0].length; j++) {
            if(matrix[row][j] == target) {
                return true;
            }
        }
        return false;
    }
}
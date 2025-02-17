import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralList = new ArrayList<>();

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length;
        int endCol = matrix[0].length;
        int total = endRow * endCol;
        int size = 0;

        while(startRow < endRow && startCol < endCol) {
            for(int i = startCol; i<endCol; i++) {
                spiralList.add(matrix[startRow][i]);
                size++;
                if(size == total) {
                    return spiralList;
                }
            }
            startRow++;
            for(int i = startRow; i<endRow; i++) {
                spiralList.add(matrix[i][endCol-1]);
                size++;
                if(size == total) {
                    return spiralList;
                }
            }
            endCol--;
            for(int i = endCol-1; i>=startCol; i--) {
                spiralList.add(matrix[endRow-1][i]);
                size++;
                if(size == total) {
                    return spiralList;
                }
            }
            endRow--;
            for(int i = endRow-1; i >= startRow; i--) {
                spiralList.add(matrix[i][startCol]);
                if(size == total) {
                    return spiralList;
                }
                size++;
            }
            startCol++;
        }
        return spiralList;
    }
}
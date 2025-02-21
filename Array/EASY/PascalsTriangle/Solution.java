import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();

        for(int i=0; i<numRows; i++) {
            pascalsTriangle.add(rowGenerator(i+1));
        }

        return pascalsTriangle;
    }

    public List<Integer> rowGenerator(int rowNum) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        int ans = 1;
        for(int col=1; col<rowNum; col++) {
            ans = ans * (rowNum - col);;
            ans = ans / col;
            row.add(ans);
        }
        return row;
    }
}
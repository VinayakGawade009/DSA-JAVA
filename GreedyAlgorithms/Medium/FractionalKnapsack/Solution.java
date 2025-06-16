// https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/0

import java.util.*;
class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        int n = values.length;
        double[][] ratio = new double[n][2];
        
        for(int i = 0; i < n; i++) {
            ratio[i][0] = i;
            ratio[i][1] = values[i] / (double) weights[i];
        }
        
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        
        double maxValue = 0;
        int capacity = W;
        for(int i = n-1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if(weights[idx] <= capacity) {
                capacity -= weights[idx];
                maxValue += values[idx];
            } else {
                maxValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        
        return maxValue;
    }
}
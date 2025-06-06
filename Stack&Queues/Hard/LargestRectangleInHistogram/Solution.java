// https://leetcode.com/problems/largest-rectangle-in-histogram/

import java.util.*;
class Solution {

    // In this approach we trying to find each size rectangle and storing max sized area and returning it
    
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;

        int[] prevSmall = new int[n]; // store index
        int[] nextSmall = new int[n]; // store index

        Stack<Integer> stack = new Stack<Integer>(); // monotonic stack store index of current small elements

        // next smaller left
        for(int i=0; i<n; i++) {
            while(!stack.empty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();            
            }

            if(stack.empty()) {
                prevSmall[i] = -1;
            } else {
                prevSmall[i] = stack.peek();
            }

            stack.push(i);
        }

        // next smaller right
        stack = new Stack<Integer>();

        for(int i = n - 1; i >= 0; i--) {
            while(!stack.empty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if(stack.empty()) {
                nextSmall[i] = n;
            } else {
                nextSmall[i] = stack.peek();
            }
            stack.push(i);
        }

        // finding largest rectangle in histogram
        for(int i = 0; i < n; i++) {
            int left = prevSmall[i];
            int right = nextSmall[i];
            int h = heights[i];
            int w = (right - left - 1);
            int area = h * w;
            maxArea = Math.max(area, maxArea); 
        }

        return maxArea;
    }
}
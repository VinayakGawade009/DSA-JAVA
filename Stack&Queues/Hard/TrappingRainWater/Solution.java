// https://leetcode.com/problems/trapping-rain-water/

import java.util.*;
class Solution {
    public int trap(int[] height) { // stack approach
        Stack<Integer> st = new Stack<>(); // store indices
        int ans = 0;

        for(int r=0; r<height.length; r++) {
            while(!st.empty() && height[st.peek()] < height[r]) { // till next large column not found
                int m = st.pop(); // in between submerged colums are excluded

                if(st.empty()) {
                    break;
                }

                int l = st.peek(); // max left height;
                int h = Math.min( height[r], height[l]) - height[m]; // height till water can be traped
                // height = total height - column height
                int w = r - l - 1; // width of trapped water
                // width = length after right left column till right column - 1 (-l because we don't consider column in width of trapped water)
                ans += h * w; // total amount of total trapped water
                // area = height * width
            }

            st.push(r);
        }

        return ans;
    }
}
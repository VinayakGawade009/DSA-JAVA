// https://leetcode.com/problems/next-greater-element-i/


import java.util.*;


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        // Traverse nums2 from left to right
        for (int num : nums2) {
            // Pop smaller elements from the stack and assign current number as their next greater
            while(!stack.empty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // For remaining elements, no next greater exists
        while(!stack.empty()) {
            map.put(stack.pop(), -1);
        }
        
        // Build result for nums1 using the map
        int[] result = new int[nums1.length];
        for(int i=0; i<nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}


// My first approach
// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int n1 = nums1.length;
//         int n2 = nums2.length;
//         int[] nextGreater = new int[n1];

//         for(int i=0; i<n1; i++) {
//             int curr = nums1[i];

//             for(int j=0; j<n2; j++) {
//                 if(curr == nums2[j]) {
//                     if(j<n2-1) {
//                         for(int k=j+1; k<n2; k++) {
//                             if(nums2[k] > curr) {
//                                 nextGreater[i] = nums2[k];
//                                 break;
//                             } else {
//                                 nextGreater[i] = -1;
//                                 // break;
//                             }
//                         }
//                         break;
//                     } else {
//                         nextGreater[i] = -1;
//                         break;
//                     }
//                 }
//             }
//         }

//         return nextGreater;
//     }
// }
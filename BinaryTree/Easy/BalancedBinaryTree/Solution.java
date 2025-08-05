/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// class Solution {

// //     Brute-force Approach (O(N^2)):
// //     - For each node, recursively calculate the height of left and right subtrees.
// //     - Check the absolute difference in heights ≤ 1.
// //     - Recurse on left and right children.
// //     - Inefficient because height is calculated repeatedly for the same subtrees.
 
// //   Optimized Approach (O(N)):
// //     - We can avoid recomputing height by computing it bottom-up (post-order), and passing height up the recursion tree only if the subtree is balanced.
// //     - If any subtree is unbalanced, propagate a failure (e.g., return -1) immediately.
// //     - Avoids redundant height calculations and early exits on unbalanced nodes.

//     private int checkBalance(TreeNode root) {
//         if(root == null) {
//             return 0;
//         }

//         int l = checkBalance(root.left);

//         if(l == -1) {
//             return -1;
//         }

//         int r = checkBalance(root.right);

//         if(r == -1) {
//             return -1;
//         }

//         if(Math.abs(l - r) > 1) {
//             return -1;
//         }

//         return Math.max(l, r) + 1;
//     }

//     public boolean isBalanced(TreeNode root) {
//         return checkBalance(root) != -1;
//     }
// }
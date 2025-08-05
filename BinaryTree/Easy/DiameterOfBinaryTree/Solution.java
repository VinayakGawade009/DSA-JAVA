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

//     private int findDiameter(TreeNode root, int[] res) {
//         if(root == null) {
//             return 0;
//         }

//         int lHeight = findDiameter(root.left, res);
//         int rHeight = findDiameter(root.right, res);

//         res[0] = Math.max(res[0], lHeight + rHeight);

//         return Math.max(lHeight, rHeight) + 1;
//     }
//     public int diameterOfBinaryTree(TreeNode root) {
//         int[] res = {0};

//         findDiameter(root, res);

//         return res[0];
//     }
// }
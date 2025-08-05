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

//     private void inorder(TreeNode root, int[] minDiff, int[] prev) {
//         if(root == null) {
//             return;
//         }

//         inorder(root.left, minDiff, prev);

//         if(prev[0] != -1) {
//             minDiff[0] = Math.min(minDiff[0], root.val - prev[0]);
//         }
//         prev[0] = root.val;

//         inorder(root.right, minDiff, prev);
//     }

//     public int minDiffInBST(TreeNode root) {
//         int minDiff[] = {Integer.MAX_VALUE};
//         int prev[] = {-1};

//         inorder(root, minDiff, prev);
        
//         return minDiff[0];
//     }
// }


// You can also solve it by using stack for practice
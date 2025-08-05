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

//     // Problem: Check if subRoot is a subtree of root
//     // Idea: For every node in root, check if a subtree starting at that node
//     //       is exactly the same as subRoot using isSameTree().
//     // Note: Tree nodes can have duplicate values, so don't stop at first match!


//     private boolean isSameTree(TreeNode root, TreeNode subRoot) {
//         if(root == null && subRoot == null) {
//             return true;
//         } else if(root == null || subRoot == null || root.val != subRoot.val) {
//             return false;
//         }

//         // both left and right subtrees must be same in structure and value hence &&
//         return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);
//     }
//     public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//         if(root == null) { // no subtree present which matchest with given subtree
//             return false;
//         }

//         // check for each node that if its sameSubtree
//         if(isSameTree(root, subRoot)) {
//             return true;
//         }

//         // subtree may be present in left or right subtree of main tree;
//         return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//     }
// }
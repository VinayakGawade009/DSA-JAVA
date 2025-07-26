// // https://leetcode.com/problems/binary-tree-inorder-traversal/

// import java.util.*;

// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {

//     private void inOrder(TreeNode root, List<Integer> inorder) {
//         if(root == null) {
//             return;
//         }

//         inOrder(root.left, inorder);

//         inorder.add(root.val);

//         inOrder(root.right, inorder);
//     }

//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> inorder = new ArrayList<>();

//         inOrder(root, inorder);

//         return inorder;
//     }
// }
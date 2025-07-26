// // https://leetcode.com/problems/binary-tree-preorder-traversal/

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

//     private void preOrder(TreeNode root, List<Integer> list) {
//         if(root == null) {
//             return;
//         }

//         list.add(root.val);

//         preOrder(root.left, list);

//         preOrder(root.right, list);
//     }
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> preorder = new ArrayList<>();

//         preOrder(root, preorder);

//         return preorder;
//     }
// }
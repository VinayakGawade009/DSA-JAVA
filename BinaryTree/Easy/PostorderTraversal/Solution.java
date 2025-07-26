// // https://leetcode.com/problems/binary-tree-postorder-traversal/


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

//     private void postOrder(TreeNode root, List<Integer> list) {
//         if(root == null) {
//             return;
//         }

//         postOrder(root.left, list);

//         postOrder(root.right, list);

//         list.add(root.val);
//     }

//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> postorder = new ArrayList<>();

//         postOrder(root, postorder);

//         return postorder;
//     }
// }
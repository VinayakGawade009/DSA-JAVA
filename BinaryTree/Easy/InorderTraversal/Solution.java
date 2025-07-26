// // https://leetcode.com/problems/binary-tree-inorder-traversal/
// https://leetcode.com/problems/binary-tree-inorder-traversal/solutions/7006209/binarytree-inorder-traversal-recursive-o-ao22/

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
// class Solution { // Morris Traversal

//     private TreeNode findPredecessor(TreeNode prev, TreeNode curr) {
//         while(prev.right != null && prev.right != curr) {// predecessor thread link present or not
//             prev = prev.right;
//         }

//         return prev;
//     }

//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> inorder = new ArrayList<>();

//         TreeNode curr =  root;

//         while(curr != null) {
//             if(curr.left == null) { // no left subtree -> add root i.e. curr to inorder seq -> traverse to right
//                 inorder.add(curr.val);
//                 curr = curr.right;
//             } else {
//                 // predecessor of curr will be rightmost node from left subtree
//                 TreeNode prev = curr.left;
//                 TreeNode predecessor = findPredecessor(prev, curr);

//                 if(predecessor.right == null) { // Add thread to curr
//                     predecessor.right = curr;
//                     curr = curr.left; // first travers left subtree
//                 } else { // already thread was added remove the thread
//                     predecessor.right = null;
//                     inorder.add(curr.val);
//                     curr = curr.right; // then traverse right subtree
//                 }
//             }
//         }

//         return inorder;
//     }
// }
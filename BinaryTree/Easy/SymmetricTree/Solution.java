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

// O(N), O(h)

// Recursive Approach : 
// class Solution {

//     private boolean isMirror(TreeNode left, TreeNode right) {
//         if(left == null && right == null) {
//             return true;
//         } else if(left == null || right == null) {
//             return false;
//         }

//         if(left.val != right.val) {
//             return false;
//         }

//         return isMirror(left.left, right.right) && isMirror(left.right, right.left);
//     }

//     public boolean isSymmetric(TreeNode root) {
//         return isMirror(root.left, root.right);
//     }
// }


// Iterative Approach
// class Solution {

//     public boolean isSymmetric(TreeNode root) {
//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root.left);
//         q.add(root.right);

//         while(!q.isEmpty()) {
//             TreeNode h1 = q.poll();
//             TreeNode h2 = q.poll();

//             if(h1 == null && h2 == null) {
//                 continue;
//             }

//             if(h1 == null || h2 == null || h1.val != h2.val) {
//                 return false;
//             }

//             q.add(h1.left);
//             q.add(h2.right);
//             q.add(h1.right);
//             q.add(h2.left);
//         }

//         return true;
//     }
// }
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


// Zigzag (spiral) level order traversal of binary tree:
// Use normal level order (BFS) with queue,
// but reverse the list at every alternate level using a boolean flag.


// class Solution {
//     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

//         List<List<Integer>> res = new ArrayList<>();

//         if(root == null) {
//             return res;
//         }

//         Queue<TreeNode> q = new LinkedList<>();
//         q.add(root);

//         boolean leftToRight = true;    

//         while(!q.isEmpty()) {
//             int size = q.size();

//             List<Integer> level = new ArrayList<>();

//             for(int i = 0; i < size; i++) { // collect all nodes of a level
//                 TreeNode curr = q.poll();

//                 if(leftToRight) { // place values in zigzag
//                     level.add(curr.val);
//                 } else {
//                     // When 0 is passed as the index, the value is inserted at the very first position of the ArrayList. This means all existing elements are shifted one position to the right to accommodate the new element at index 0.
//                     level.add(0, curr.val); // each element is inserted at 0th index i.e. rightToLeft
//                 }

//                 if(curr.left != null) q.offer(curr.left);
//                 if(curr.right != null) q.offer(curr.right);
//             }

//             res.add(level);
//             leftToRight = !leftToRight;
//         }

//         return res;
//     }
// }
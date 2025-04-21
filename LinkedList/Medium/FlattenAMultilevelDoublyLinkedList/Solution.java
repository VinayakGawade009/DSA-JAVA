// https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/description/?source=submission-ac


/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

// class Solution {
//     public Node flatten(Node head) {
        
//         flattenDFS(head);

//         return head;
//     }

//     private Node flattenDFS(Node node) {
//         Node current = node;
//         Node last = null;

//         while(current != null) {
//             Node next = current.next;

//             if(current.child != null) {
//                 Node lastChild = flattenDFS(current.child);

//                 current.next = current.child;
//                 current.child.prev = current;
//                 current.child = null;

//                 if(next != null) {
//                     lastChild.next = next;
//                     next.prev = lastChild;
//                 }

//                 last = lastChild;
//             } else {
//                 last = current;
//             }

//             current = next;
//         }

//         return last;
//     }
// }

// Algorithm (stack handling done by recursion)
// 1. Traverse the list with a pointer `current`.
// 2. If a node has a child:
//    a. Save `current.next` in `next`
//    b. Recursively flatten the child
//    c. Connect child to `current.next`
//    d. If `next` exists, connect it after the flattened child
// 3. When `current.child` is null, just move to `next`
// 4. Return the last node in the flattened list at every level

// Time Complexity: O(n) — each node is visited once
// Space Complexity: O(n) — due to recursion call stack (worst case: all children nested)










/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

// class Solution {
//     public Node flatten(Node head) {
//         Stack<Node> stack = new Stack<>();
//         Node current = head;

//         while(current != null || !stack.empty()) {
//             if(current.child != null) {
//                 if(current.next != null) {
//                     stack.push(current.next);
//                 }
//                 current.next = current.child;
//                 current.child.prev = current;
//                 current.child = null;
//             }
//             if(current.next == null && !stack.empty()) {
//                 Node nextNode = stack.pop();
//                 current.next = nextNode;
//                 nextNode.prev = current;
//             }
//             current = current.next;
//         }

//         return head;
//     }
// }

// Algorithm (stack handling manually)

// 1. Traverse the list with a pointer current.
// 2. If a node has a child, push its next to the stack (if it exists), then splice in the child.
// 3. When you reach a node without a next but have something in the stack, pop and connect it.
// 4. Continue until all nodes are processed.
// *** This method cleanly simulates depth-first traversal while preserving doubly linked list properties.

// Complexity
// Time Complexity: ( O(n) ) — every node is visited once.
// Space Complexity: ( O(n) ) — for the stack in the worst case.
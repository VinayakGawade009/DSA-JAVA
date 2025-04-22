// https://leetcode.com/problems/copy-list-with-random-pointer/solutions/6677642/two-approaches-hashmap-o1-space-in-place-n4ui/


/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

// class Solution {
//     public Node copyRandomList(Node head) {
        
//         Map<Node, Node> map = new HashMap<>();

//         Node temp = head;

//         // First pass: create clone nodes without setting next and random.
//         while(temp != null) {
//             map.put(temp, new Node(temp.val));
//             temp = temp.next;
//         }

//         // Second pass: assign next and random pointers.
//         temp = head;
//         while(temp != null) {
//             map.get(temp).next = map.get(temp.next);
//             map.get(temp).random = map.get(temp.random);
//             temp = temp.next;
//         }

//         return map.get(head);
//     }
// }

// Time Complexity	O(n)
// Space Complexity	O(n)





// class Solution {
//     public Node copyRandomList(Node head) {
//         if(head == null) return head;

//         // Step 1: Clone nodes and insert them next to original nodes.
//         Node temp = head;
//         while(temp != null) {
//             Node copy = new Node(temp.val);
//             copy.next = temp.next;
//             temp.next = copy;

//             temp = copy.next;
//         }

//         // Step 2: Assign random pointers to the copied nodes.
//         temp = head;
//         while(temp != null) {
//             if(temp.random != null) {
//                 temp.next.random = temp.random.next;
//             }
//             temp = temp.next.next;
//         }

//         // Step 3: Separate the copied list from the original list.
//         temp = head;
//         Node dummy = new Node(0);
//         Node copy = dummy;

//         while(temp != null) {
//             copy.next = temp.next;
//             temp.next = temp.next.next;

//             copy = copy.next;
//             temp = temp.next;
//         }
        
//         return dummy.next;
//     }
// }

// Time Complexity	O(n)
// Space Complexity	O(1)
// https://leetcode.com/problems/reverse-linked-list/


// using stack

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// TC: O(n) SC: O(n)
// class Solution {
    //     public ListNode reverseList(ListNode head) {
//         if(head == null || head.next == null) {
//             return head;
//         }
//         ListNode temp = head;
//         Stack<Integer> stack = new Stack<>();
//         while(temp != null) {
//             stack.push(temp.val);
//             temp = temp.next;
//         }

//         ListNode newHead = new ListNode(stack.pop());
//         temp = newHead;
//         while(!stack.isEmpty()) {
//             ListNode newNode = new ListNode(stack.pop());
//             temp.next = newNode;
//             temp = temp.next;
//         }

//         return newHead;
//     }
// }

// class Solution { // O(n) O(1)
//     public ListNode reverseList(ListNode head) {
//         if(head == null || head.next == null) {
//             return head;
//         }

//         ListNode prev = null;
//         ListNode curr = head;

//         while(curr != null) {
//             ListNode next = curr.next;
//             curr.next = prev; // reverse link
//             prev = curr;
//             curr = next; // iterate forward
//         }

//         return prev; // new head
//     }
// }

// class Solution { // recursive approach
//     public ListNode reverseList(ListNode head) {
//         if(head == null || head.next == null) {
//             return head;
//         }

//         ListNode newHead = reverseList(head.next);
//         head.next.next = head;
//         head.next = null;
//         return newHead; // new head
//     }
// }


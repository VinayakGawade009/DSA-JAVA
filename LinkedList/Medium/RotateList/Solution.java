// https://leetcode.com/problems/rotate-list/submissions/

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
// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         if (head == null || head.next == null || k == 0) return head;

//         ListNode temp = head;
//         int count = 1;

//         // Step 1: Count length and get tail
//         while(temp.next != null) {
//             temp = temp.next;
//             count++;
//         }

//         // Step 2: Make it circular
//         temp.next = head;

//         // Step 3: Find new head
//         k = k % count;

//         int stepsToNewTail = count - k;

//         temp = head;

//         for(int i=0; i<stepsToNewTail-1; i++) {
//             temp = temp.next;
//         }

//         ListNode newHead = temp.next;
//         temp.next = null; // break the cycle

//         return newHead;
//     }
// }
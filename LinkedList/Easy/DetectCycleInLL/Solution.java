// https://leetcode.com/problems/linked-list-cycle/



/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         ListNode fast = head;
//         ListNode slow = head;

//         // if(fast == null || fast.next == null) {
//         //     return false;
//         // }

//         while(fast != null && fast.next != null) {
//             fast = fast.next.next;
//             slow = slow.next;
//             if(fast == slow) {
//                 return true;
//             }
//         }

//         return false;
//     }
// }
// https://leetcode.com/problems/linked-list-cycle-ii/

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

 /**
 * Detects the start node of a cycle in a singly linked list.
 * Uses Floyd's Tortoise and Hare algorithm for cycle detection.
 *
 * If a cycle exists, returns the node where the cycle begins.
 * If no cycle exists, returns null.
 *
 * Approach:
 * - Two pointers (`fast` and `slow`) are used to detect the cycle.
 * - If they meet, a third pointer (`helper`) starts from the head.
 * - Move both `helper` and `slow` one step at a time until they meet again.
 * - Their meeting point is the start of the cycle.
 *
 * Time Complexity: O(n) — where n is the number of nodes.
 * Space Complexity: O(1) — constant extra space.
 */

//  public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         ListNode fast = head;
//         ListNode slow = head;

//         if(fast == null || fast.next == null) return null;

//         while(fast != null && fast.next != null) {
//             fast = fast.next.next;
//             slow = slow.next;

//             if(fast == slow) {
//                 ListNode helper = head;
//                 while(helper != slow) {
//                     helper = helper.next;
//                     slow = slow.next;
//                 }
//                 return helper;
//             }
//         }

//         return null;
//     }
// }
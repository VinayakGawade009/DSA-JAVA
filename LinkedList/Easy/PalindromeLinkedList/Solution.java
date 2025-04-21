// https://leetcode.com/problems/palindrome-linked-list/


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


// TC: O(N) SC: O(N)
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         Stack<Integer> stack = new Stack<>();
//         ListNode temp = head;

//         while(temp != null) {
//             stack.push(temp.val);
//             temp = temp.next;
//         }

//         temp = head;
//         while(temp != null) {
//             if(temp.val != stack.pop()) {
//                 return false;
//             }
//             temp = temp.next;
//         }

//         return true;
//     }
// }



// TC: O(N) SC: O(1)
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         if(head == null || head.next == null) return true;

//         // find middle of linked list
//         ListNode fast = head;
//         ListNode slow = head;

//         while(fast != null && fast.next != null) {
//             fast = fast.next.next;
//             slow = slow.next;
//         }

//         // reverse 2nd halp of linked list
//         ListNode prev = null;
//         while(slow != null) {
//             ListNode nextNode = slow.next;
//             slow.next = prev;
//             prev = slow;
//             slow = nextNode;
//         }

//         // compare 1st and 2nd half
//         ListNode left = head;
//         ListNode right = prev;
//         while(right != null) {
//             if(left.val != right.val) {
//                 return false;
//             }
//             left = left.next;
//             right = right.next;
//         }
        
//         return true;
//     }
// }
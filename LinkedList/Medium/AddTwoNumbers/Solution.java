// https://leetcode.com/problems/add-two-numbers/description/

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
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode node1 = l1;
//         ListNode node2 = l2;
//         int carry = 0;
//         ListNode prev = new ListNode();
//         ListNode ptr = prev;

//         while(node1 != null && node2 != null) {
//             int ans = node1.val + node2.val + carry;
//             carry = ans / 10;
//             ans = ans % 10;
            
//             ListNode list = new ListNode(ans);
//             prev.next = list;
//             prev = list;

//             node1 = node1.next;
//             node2 = node2.next;
//         }

//         while(node1 != null) {
//             int ans = node1.val + carry;
//             if(ans > 9) {
//                 ans = ans % 10;
//             } else {
//                 carry = 0;
//             }
//             ListNode list = new ListNode(ans);
//             prev.next = list;
//             prev = list;

//             node1 = node1.next;
//         }

//         while(node2 != null) {
//             int ans = node2.val + carry;
//             if(ans > 9) {
//                 ans = ans % 10;
//             } else {
//                 carry = 0;
//             }
//             ListNode list = new ListNode(ans);
//             prev.next = list;
//             prev = list;

//             node2 = node2.next;
//         }

//         if(carry == 1) {
//             ListNode list = new ListNode(carry);
//             prev.next = list;
//             prev = list;
//         }

//         return ptr.next;
//     }
// }





// Similar but more clear code

// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode dummyHead = new ListNode();
//         ListNode curr = dummyHead;
//         int carry = 0;

//         while (l1 != null || l2 != null || carry != 0) {
//             int val1 = (l1 != null) ? l1.val : 0;
//             int val2 = (l2 != null) ? l2.val : 0;

//             int sum = val1 + val2 + carry;
//             carry = sum / 10;

//             curr.next = new ListNode(sum % 10);
//             curr = curr.next;

//             if (l1 != null) l1 = l1.next;
//             if (l2 != null) l2 = l2.next;
//         }

//         return dummyHead.next;
//     }
// }
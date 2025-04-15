
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         return slow;
//     }
// }

// fast runs ahead twice as fast as slow.
 
// When fast is done, slow will be at the middle.

// If the list is even, slow ends on the second middle node.



// class Solution {
//     public ListNode middleNode(ListNode head) {
//         int count = 0;
//         ListNode temp = head;

//         while(temp != null) {
//             count++;
//             temp = temp.next;
//         }
//         System.out.println(count);

//         temp = head;
//         int mid = count/2;
//         System.out.println(mid);
//         for(int i=0; i<mid; i++) {
//             temp = temp.next;
//         }

//         return temp;
//     }
// }


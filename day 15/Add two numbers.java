/*Question: You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Example 1:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
*/
Solution: 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode p = result;
        int carry = 0;
        ListNode zero = new ListNode(0);
        while(l1 != zero || l2!=zero || carry==1) {
          int sum = l1.val + l2.val + carry;
          if(sum>=10) {
              result.val = sum - 10;
              carry = 1;
          } else {
              result.val = sum;
              carry = 0;
          }
          if(l1.next != null)
            l1 = l1.next;
          else {
            l1 = zero;
            System.out.println("l1 zero");
          }
          if(l2.next != null)
            l2 = l2.next;
          else {
            l2 = zero;
            System.out.println("l2 zero");
          }
          System.out.println("l1.val="+l1.val+",l2.val="+l2.val);
          if(l1!=zero || l2!=zero || carry==1) {
            ListNode newNode = new ListNode();
            result.next = newNode;
            result = result.next;
          }
        }
        
        return p;
        
        
    }
}

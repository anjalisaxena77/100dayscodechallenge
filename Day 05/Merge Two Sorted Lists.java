/* Question: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'. */

Solution
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current2 = new ListNode(10000);
        ListNode current = current2;
        ListNode next1 = list1, next2 = list2;
        
        while( next1 != null && next2 != null && current != null){
            if(next1.val <= next2.val){
                current.next = next1;
                current = current.next;
                next1 = next1.next;
            }else{
                current.next = next2;
                current = current.next;
                next2 = next2.next;
            }
        }
        
        while(next1 != null){
            current.next = next1;
            current = current.next;
            next1 = next1.next;
        }
        
        while(next2 != null){
            current.next = next2;
            current = current.next;
            next2 = next2.next;
 
        }
        
        current2 = current2.next;

        return current2;
        
    }
}

/* Question:
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters. */

Solution:
class Solution {
    public boolean isPalindrome(String s) {
           if(s.isEmpty() || s.length() == 1) return true;
        int l = 0;
        int r = s.length() - 1;
        
        while(l < r) {
            char lChar = Character.toLowerCase(s.charAt(l));
            char rChar = Character.toLowerCase(s.charAt(r));
            
            if(!Character.isLetterOrDigit(lChar)){
                l++;
                continue; 
            }
            if(!Character.isLetterOrDigit(rChar)){
                r--;
                continue;
            }
            
            if(lChar != rChar)
                return false;
            
            l++;
            r--;
        }
        
        return true;
        
    }

    
}

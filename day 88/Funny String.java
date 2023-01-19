/* Question: 
In this challenge, you will determine whether a string is funny or not. To determine whether a string is funny, 
create a copy of the string in reverse e.g. . Iterating through each string, compare the absolute difference in the ascii
values of the characters at positions 0 and 1, 1 and 2 and so on to the end. If the list of absolute differences is the same for both strings, they are funny.

Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.

Sample Input

STDIN   Function
-----   --------
2       q = 2
acxz    s = 'acxz'
bcxz    s = 'bcxz'

Sample Output
Funny
*/
Solution:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        Solution p = new Solution();
        for (int i = 0; i < test_cases; i++) {
            String str = sc.next();
            p.isFunny(str);
        }
    }

     void isFunny(String str) {
        int str_len = str.length();

        int i = 1, j = str_len -1;
        boolean flagFound = false;
        while (i < str_len && j > 0) {
            int diff = Math.abs((int) str.charAt(i) - str.charAt(i - 1));
            int rev_diff = Math.abs( (int) str.charAt(j) - str.charAt(j - 1) );
            if(rev_diff != diff) {
                 flagFound = true;
                break;
            }

            i++;
            j--;
        }

        if(flagFound) System.out.println("Not Funny");
        else System.out.println("Funny");
    }
}

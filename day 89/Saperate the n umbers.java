/* Question:
Sample Input 0

7
1234
91011
99100
101103
010203
13
1
Sample Output 0

YES 1
YES 9
YES 99
NO
NO
NO
NO
*/
Solution:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        for(int i = 0; i < q; i++){
            String in = s.next();
             long a = check(in);
            if (a != -1) {
                System.out.println("YES " + a);
            }
            else {
                System.out.println("NO");
            }
        }
    }
    
    public static long check(String s) {
        for (int j = 1; j < s.length()+1 && j < 18; j++) {
            long a = Long.parseLong(s.substring(0, j));
            long init = a;
            String temp = "" + a;
            int count = 1;
            while (temp.length() < s.length()) {
                a++;
                count++;
                temp += a;
            }
            if (temp.equals(s) && count >= 2) {
                return init;
                   }         
        }
        return -1;
    
    }
}

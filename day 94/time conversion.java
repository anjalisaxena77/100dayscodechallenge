/* Question: 
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Sample Input 0

07:05:45PM
Sample Output 0

19:05:45
*/
solution:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dt = sc.next();
        char ap = dt.charAt(dt.length() - 2);
        dt = dt.substring(0, dt.length() - 2);
        if (ap == 'A') {
            int hh = Integer.parseInt(dt.substring(0, 2));
            if (hh == 12) hh = 0;
            String s = Integer.toString(hh);
            if (s.length() == 1) {
                s = "0" + s;
            }
            System.out.println(s + dt.substring(2, dt.length()));
        } else {
            int hh = Integer.parseInt(dt.substring(0, 2));
             if (hh != 12) hh += 12;
            String s = Integer.toString(hh);
            if (s.length() == 1) {
                s = "0" + s;
            }
            System.out.println(hh + dt.substring(2, dt.length()));
        }
    }
}

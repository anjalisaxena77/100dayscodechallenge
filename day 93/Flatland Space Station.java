/* Question:
Flatland is a country with a number of cities, some of which have space stations. 
Cities are numbered consecutively and each has a road of  length connecting it to the next city.
It is not a circular route, so the first city doesn't connect with the last city. 
Determine the maximum distance from any city to its nearest space station.

Sample Input 0

STDIN   Function
-----   --------
5 2     n = 5, c[] size m = 2
0 4     c = [0, 4]
Sample Output 0

2

*/
Solution:
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        int max = c[0];
        for (int i = 1; i < c.length; ++i) {
            int diff = c[i] - c[i - 1];
            int length = diff / 2;
            max = Math.max(max, length);
        }
        max = Math.max(max, n - c[c.length - 1] - 1);
        System.out.println(max);
    }
}


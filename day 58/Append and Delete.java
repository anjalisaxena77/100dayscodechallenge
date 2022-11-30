/* Question:
 You have two strings of lowercase English letters. You can perform two types of operations on the first string:

Append a lowercase English letter to the end of the string.
Delete the last character of the string. Performing this operation on an empty string results in an empty string.
Sample Input 0

hackerhappy
hackerrank
9
Sample Output 0

Yes


*/
Solution:
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {
    // Write your code here
     int n = s.length(), m = t.length();
        if (n + m <= k) return "Yes";
        int idx = 0;
        while (idx < Math.min(n, m) && s.charAt(idx) == t.charAt(idx)) {
            idx++;
        }
        int res = (n - idx) + (m - idx);
        if (res < k) {
            while (res < k) {
                res += 2;
            }
            if (res == k) {
                return "Yes";
            }
            return "No";
        } else if (res == k) {
            return "Yes";
        } else {
            return "No";
        }
 
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

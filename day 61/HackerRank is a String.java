/* Question: 
We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank.
Remeber that a subsequence maintains the order of characters selected from a sequence.

More formally, p[0],p[1]......p[9]let be the respective indices of h, a, c, k, e, r, r, a, n, k in string . If p[0]<p[1]<p[2]<....<p[9] is true, then s contains hackerrank.

For each query, print YES on a new line if the string contains hackerrank, otherwise, print NO.
Sample Input 0

2
hereiamstackerrank
hackerworld
Sample Output 0

YES
NO

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
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
    // Write your code here
          String hk = "hackerrank";
        int pointer1 = 0;
        int pointer2 = 0;
        
        while (pointer1 < s.length() && pointer2 < hk.length()) {
            if (s.charAt(pointer1) == hk.charAt(pointer2)) {
                pointer2++;
            }
            pointer1++;
        } 
        
        return pointer2 == hk.length() ? "YES" : "NO";  
    }
    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.hackerrankInString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

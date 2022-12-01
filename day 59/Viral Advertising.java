/*Question: 
HackerLand Enterprise is adopting a new viral advertising strategy. When they launch a new product, they advertise it to exactly 5 people on social media.

On the first day, half of those 5 people (i.e.floor = 5/2 = 2) like the advertisement and each shares it with  of their friends. At the beginning of the second day,  people receive the advertisement.

Each day, floor = 5/2 *3 = 2 * 3 = 6 of the recipients like the advertisement and will share it with 3 friends on the following day.
Assuming nobody receives the advertisement twice, determine how many people have liked the ad by the end of a given day, beginning with launch day as day .

Example:
.n = 6

Day Shared Liked Cumulative
1      5     2       2
2      6     3       5
3      9     4       9
4     12     6      15
5     18     9      24
The progression is shown above. The cumulative number of likes on the 5th day is 24th .

Function Description

Complete the viralAdvertising function in the editor below.

viralAdvertising has the following parameter(s):

int n: the day number to report
Returns

int: the cumulative likes at that day
Input Format

A single integer,n, the day number.

Constraints
1 < n < 50
Sample Input

3
Sample Output

9

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
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    
  
   
  public static int viralAdvertising(int n) {
        int shared = 5;
        int liked = (int) Math.floor(shared / 2);
        int cumultative = liked;
        while (n > 1) {
            shared = (int) Math.floor(shared / 2) * 3;
            liked = (int) Math.floor(shared / 2);
            cumultative += liked;
            n--;
        }
        
        return cumultative;
    }

    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

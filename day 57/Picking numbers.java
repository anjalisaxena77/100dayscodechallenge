/* Question: 
Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to 1 .

Example
a = [1,1,2,2,4,4,5,5,5]



There are two subarrays meeting the criterion: [1,1,2,2] and [4,4,5,5,5] . The maximum length subarray has 5 elements.
Sample Input 0

6
4 6 5 3 3 1
Sample Output 0

3


*/
solution:
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
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
    int bigger = Integer.MIN_VALUE;
        
        for(int i = 0; i < a.size() - 1; i++){
            int count = 0;
            for(int j = 0; j < a.size(); j++){
                if(a.get(i) - a.get(j) >= 0 && a.get(i) - a.get(j) <= 1){
                    count++; 
                }
            }
            if(count >= bigger){
                bigger = count;
            }
        }
        return bigger;
    }

    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
